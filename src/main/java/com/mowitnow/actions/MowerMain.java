package com.mowitnow.actions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.mowitnow.utils.FileReader;



public class MowerMain {
	private List<String> file;

	public MowerMain(String fileName) throws IOException {
        file = FileReader.parseFile(fileName);
	}
    /**
     * The main function to run the mower.
     *
     */
	 public List<String> run() {
		 List<String> result = new ArrayList<String>();
	        Area area = Area.initArea(file.get(0).split(" "));

	        for (int i = 1; i < file.size(); i += 2) {

	            Mower mower = Mower.initMower(area, file.get(i));

	            char[] steps = file.get(i + 1).toCharArray();
	            for (char step : steps) {
	                if (area.canMove(mower.getPosition())) {
	                    mower.move(step);
	                }
	            }
	            result.add(mower.toString());
	        }
	        return result;
	    }
}
