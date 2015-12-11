package ceronsantiago.utils;

import java.util.HashMap;

import ceronsantiago.oneSharpExpressive.ParamDec;
import ceronsantiago.oneSharpExpressive.RegisterParam;
import ceronsantiago.oneSharpExpressive.WordParam;

public class ParameterContext {
	public HashMap<String,String> valMap = new HashMap<>();
	
	//TODO: Should probably change this name.
	public String resolve(ParamDec param){
		return valMap.get(param.getName());
	}
	
	public Integer resolve(RegisterParam param){
		if(param.getParam() != null){
			return Utils.isInt(valMap.get(param.getParam().getName()));
		}
		else return param.getValue();
	}
	
	public String resolve(WordParam param){
		if(param.getParam() != null)
			return valMap.get(param.getParam().getName());
		else return param.getValue();
	}
}
