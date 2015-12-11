package ceronsantiago.onesharpx.lib;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Observable;

public class ObservableRegisterContainer extends Observable {
	public HashMap<Integer, Deque<Boolean>> registers;

	public void addToRegister(int register, char c) {
		if (registers.get(register) == null)
			registers.put(register, new LinkedList<Boolean>());
		registers.get(register).addLast(c == '1');
	}

	public Boolean readFromRegister(int register) {
		Deque<Boolean> regi = registers.get(register);
		if (regi == null)
			return null;
		if (regi.isEmpty()) {
			registers.remove(register);
		}
		return regi.pollFirst();

	}
}
