factorial
=========

Java ile Recursive(Kendini çağıran) ve Iterative(Tekrarlanan) Faktöriyel işlemlerinin yapılmasını konu alır.

İnternette bulabileceğiniz en basit algoritmalar üzerine kodlanmıştır.

Algoritma
---------

## Recursive

Bu algoritma methoda verilen ve hesaplanması istenen faktöriyel değerinin, işlem yapmak için sürekli (kendi * method(kendi - 1)) çağrı yapması ve methoda verilen değer 1 veya altına ulaştığında 1 döndürmesi üzerine dayanmaktadır.

## Iterative

Bu algoritma methoda verilen değer ile, 1 olarak tanımlanan sonuç değişkenine, 2 sayısından, verilen sayıya kadar for döngüsü çalıştırıp, for döngüsü içinde sonuç değişkeni ile çarpım yapmaya dayanmaktadır.

Kullanılan Kütüphaneler
-----------------------

Herhangi bir standart java veya external kütüphane kullanılmamıştır.

Geliştirme
----------

* BigInteger class'ından yararlanabilir. Şuanki hali ile long sınıfının hafıza kapasitesinden dolayı, methodlar 21 faktöriyel ve sonrasında doğru çıktı vermemektedir.
* İnternet üzerinde daha iyi olduğu kanıtlanan algoritmalar kullanılabilir.
* Runtime(Koşma) anında tekrar tekrar faktöriyel işlemleri yapmamak için Hash data yapısını kullanarak, cache işlemi yapılabilir.
