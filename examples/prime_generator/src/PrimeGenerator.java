import java.util.ArrayList;
import java.lang.Long;

public class PrimeGenerator{

	private static ArrayList<Long> primeList = new ArrayList<Long>(); // Bulduğumuz asal sayıları, daha sonra tekrardan işlem yapmamak için tutacağımız obje.
	private static int[] startingPrimes = new int[]{ 2, 3, 5, 7 }; // Başlangıçta asal olduğunu bildiğimiz sayılar. İşlemleri başlatmak için gerekli.
	
	// Ana asal kontrol etme methodumuz.
	private static boolean PrimeCheck(long number){

		boolean isPrime = true;
		long half = number / 2;

		for(Long prime : primeList){ // Asallık kontrol işlemi
			if(prime > half){ break; } 
			if(number % prime == 0){ isPrime = false; break; } 
		}

		return isPrime;

	}
	
	// Asal sayı üretme methodumuz.
	public static ArrayList<Long> generate(long lim){

		if(primeList.size() == 0){
			for(int prime : startingPrimes){ primeList.add(Long.valueOf(prime)); } // Eğer prime listemiz boş ise, başlangıç için verilen asal sayılar ile dolduruyoruz.
		}

		Long limit = Long.valueOf(lim); // Limitimizin Long değeri
		Long last = primeList.get( primeList.size() - 1 ); // En son bulunan prime değerimizi değişkene atıyoruz.		
		
		// Eğer primeListimizdei son değer, limitimizden büyük ise, işlem yapmaya gerek yok. Sadece limitimize kadar olan asal sayıları döndürmemiz yeterli.
		if(last.compareTo(limit) >= 0){

			ArrayList<Long> returnList = new ArrayList<Long>(); // ArrayList mutable yani değişim yapıldığı zaman, yeni bir obje oluşturulmayan bir sınıf olduğu için, döndüreceğimiz Obje bizim kendi primeListimiz olmamalı.
						
			for(Long prime : primeList){
				if(prime.compareTo(limit) > 0){ break; }
				returnList.add(prime);
			}

			return returnList;

		}

		// Son asal sayımızdan, limite kadar loopluyoruz.
		for( ; last <= limit; last++){
			if(PrimeCheck(last)){ primeList.add(last); }
		}

		return new ArrayList<Long>(primeList);

	}
	
	// Listemizdeki asal sayıları silerek, hafızayı temizleme methodu.
	public static void clear(){
		primeList.clear(); // Tek seferlik kullanımlarda veya class kullanımına ihtiyaç kalmadığı zaman, hafızayı temizlemek için.
	}

	// Asallık kontrol methodu.
	public static boolean isPrime(long number){
		Long last = primeList.get( primeList.size() - 1 ), half = number / 2;

		if(number % half == 0){ return false; } // Hızlı sonuç vermek için ilk kontrolü yapıyoruz.
		
		if(last.compareTo(half) < 0){ // Eğer listemizde sayının yarısına kadar asal sayılar yoksa, doğru sonuç almak için listemizi dolduruyoruz/oluşturuyoruz.
			PrimeGenerator.generate(half);
		}

		return PrimeCheck(number);
	}

}
