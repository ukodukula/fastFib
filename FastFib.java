class FastFib {
	public static void main(String[] args){
		System.out.println("Traditional implementation of Fibonacci sequence generator. This implementation does not scale, and can be tweaked simply with a dynamic programming implementation that is mind blowingly faster.");
		for (int i=0; i<50; i++){
			System.out.println("Fib(" + i + ") = " + fib(i));
		}
	}

	public static int fib(int number){
		if (number < 0){
			return 0;
		}	
		if (number == 0 || number == 1){
			return number;
		}
		return fib(number - 1) + fib(number - 2);
	}
}
