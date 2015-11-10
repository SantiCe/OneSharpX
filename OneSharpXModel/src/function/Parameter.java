package function;

public class Parameter {
	
	//Must be one of the typeIds in constants;
	public int typeId;
	public String id;
	
	public boolean equals(Object o){
		Parameter ot =  (Parameter)o;
		return ot.id == id;
	}

}