package program;

import java.util.ArrayList;
import java.util.HashMap;

public class LabelContext {
	// A LabelContext defines the scope of labeled commands. It consists of a list of commands and
	// a map that maps some labels to specific items of such list. 
	
	//The following hold inside a LabelContext:
	/*
	 * The order in which commands appear in the list of commands never changes, and matters.
	 * Each command has at most one label.
	 * No two commands have the same labels. 
	 * 
	 */
	
	//A list of Commands
	public ArrayList<Command> commands;
	
	//A map of Labels.
	/*
	 * labelMap[s] = i, if and only if commands.get(i).label == s.
	 */
	public HashMap<String,Integer> labelMap;
}
