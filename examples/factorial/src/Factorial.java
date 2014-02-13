public class Factorial{
	
	// Bu method, belirlenen koşula ulşana kadar, kendini çağırmaya dayanarak kodlanmıştır.
	// 5! Verdiğimizi var sayarsak;
	// Method 5 ile çağırdıldığı zaman
	// Dönen Değer: 5 * recursiveFactorial(4) olmaktadır.
	// recursiveFactorial bu adımdan sonra factorial değişkeni 1'e ulşana kadar, kendini tekrarlar ve sonuç elde edilir.
	// Kendini belli bir koşula kadar çağıran methodlara Recursive denir.
	public static long recursiveFactorial(int factorial){
		if(factorial <= 1){ return 1; } // Burası recursive metodumunuzun, sonuca ulaştığı yer.	
		return factorial * recursiveFactorial(factorial - 1); // Burası recursive methodumuzun sonuca ulaşana kadar tekrarladığı adım.
	}

	

	public static long iterativeFactorial(int factorial){
		
		long factorialValue = 1; // Sonuç olarak döndüreceğimiz değişkeni tanımlıyoruz.
		int i; // for döngüsü için kullandığımız değişkeni tanımlıyoruz.
		
		for(i = 2; i <= factorial; i++){
			factorialValue *= i; // 2'den, factorial değişkenine kadar, döndüreceğimiz değişkeni i ile çarpıyoruz. Kısaca 5! için 1 * 2 * 3 * 4 * 5
		}

		return factorialValue; // Elde ettiğimiz sonucu döndürüyoruz

	}
}
