class FibDriver{
	public static void main (String[] args){
		FastFib ff = new FastFib();
		
		try{
			for (int i=0; i<40; i++){
				System.out.println("fib(" + i + ") = " + ff.fib(i));	
			}

		}catch (java.lang.Exception e){
			e.printStackTrace();
		}
	}
}
