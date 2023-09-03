package com.mustafa.designpatterns.singleton;

import com.mustafa.designpatterns.singleton.models.Country;
import com.mustafa.designpatterns.singleton.singleton.CountryProvider;

import java.time.LocalTime;
import java.util.List;

public class SingletonMain {
    /**
     * SINGLETON CLASSES
     *  __Avantajları__
     *  - 1 kere oluşturulur, kullandığı objeleri, çağırıldığında aynı objeyi (memory caching) kullanmaya devam eder.
     *  - Her yerden ulaşılabilir (Yeni bir instance kullanmadan aynı instance kullanılır)
     *  - Biz ilk isteği yaptığımızda create edilir.
     *  __Dezavantajları__
     *  - Unit test yazımı zorlaştırır
     *  - Multithread kulanımında her thread ayrı ayrı instance yaratılması gerekirken,
     *  singletonda sadece 1 kez üretildiğinden aynı instance kullanılır
     *  - Singleton class'lar her threadda aynı instance'i döndürür.
     *  - Singleton yarattığımız objenin ömrü uygulamanın hayatı boyuncadır. Uygulama kapanıncaya kadar bellekte kalır.
     */
    public static void main(String[] args) throws InterruptedException {
        System.out.println(LocalTime.now());
        List<Country> countries = CountryProvider.getInstance().getCountries();

        for (Country country:
             countries) {
            System.out.println(country.getName());
        }
        System.out.println(LocalTime.now());
        for (Country country:
                countries) {
            System.out.println(country.getName());
        }
        System.out.println(LocalTime.now());
    }
}
