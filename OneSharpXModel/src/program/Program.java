package program;

import java.util.HashMap;

import function.Function;

public class Program extends LabelContext{
	
	// A LabelContext where functions are declared as well. 
	public HashMap<String,Function> functions;

	public Function getFunctionById(String id){
		return functions.get(id);
	}
}
