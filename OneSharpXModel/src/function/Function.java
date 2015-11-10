package function;

import java.util.HashSet;

import program.Program;

public abstract class Function {
	
	public String name;
	public HashSet<Parameter> parameters;
	public Program declarationContext;
	
	//This method must be completed in each implementation of Function. 
	public void execute(String[] params){
		//Check that parameters are correctly typed.  
	}

}
