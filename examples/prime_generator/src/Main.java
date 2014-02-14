class Main{

	public static void main(String[] args){
	
		ArrayList<Long> list = PrimeGenerator.generate(10000); // => Liste döndürür.

		for(Long prime : list){
			System.out.println(prime); // => 2, 3, 5, 7,.......9973
		}

		list = PrimeGenerator.generate(7);

		for(Long prime : list){
			System.out.println(prime); // => 2, 3, 5, 7
		}

		System.out.println(PrimeGenerator.isPrime(152312)); // => false
		PrimeGenerator.clear(); // => Hafıza temizler

	}

}
