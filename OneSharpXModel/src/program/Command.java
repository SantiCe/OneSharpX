package program;

public class Command {
	
	//Defines a single command. It is a probably labeled call to a function, either primitive or 
	public String label;
	public String targetFunction;
	public String[] targetParameters;
	public LabelContext labelContext;
	public Program declarationContext;

}
