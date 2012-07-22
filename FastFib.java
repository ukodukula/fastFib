import java.util.HashMap;
import java.lang.Exception;

class FastFib {
	private HashMap map;
	
	public FastFib(){
		this.map = new HashMap<Integer,Integer>();
	}

	public int fib(int number) throws Exception{
		if (number < 0){
			throw new Exception("Implementation of negative numbers is not Supported.");
		}	
		if (number == 0 || number == 1){
			return number;
		}

		// Check to see if this work has already been done, in which case let's use that stored value.
		if(this.map.containsKey(new Integer(number))){
			return ((Integer)this.map.get(number)).intValue();
		}

		int val = fib(number - 1) + fib(number - 2);
		map.put(new Integer(number), new Integer(val));	

		return val;
	}
}
