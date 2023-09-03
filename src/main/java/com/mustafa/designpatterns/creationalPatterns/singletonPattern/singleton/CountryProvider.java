package com.mustafa.designpatterns.creationalPatterns.singletonPattern.singleton;

import com.mustafa.designpatterns.creationalPatterns.singletonPattern.models.Country;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class CountryProvider {
    /**
     * Singleton class'ımızda static bir alan yaratırız ve bu static alan üzerinden erişim sağlarız.
     * Null mı değil mi? Null ise oluştur, null değilse getir
     * Constructor içerisinde işlemi yapalım, constructor private olsun.
     * Sadece getInstance static olması yeterlidir. Instance üzerinden diğer metodları çağıracaz
     */
    private static CountryProvider instance = null;
    private static List<Country> countries = null;

    private CountryProvider() throws InterruptedException {
        Thread.sleep(3000);
        List<Country> countries = new ArrayList<>();
        countries.add(new Country().setName("Türkiye"));
        countries.add(new Country().setName("Azerbaycan"));
        setCountries(countries);
    }

    public static CountryProvider getInstance() throws InterruptedException {
        return Objects.nonNull(instance) ? getInstance() : (instance = new CountryProvider());
    }

    public List<Country> getCountries() {
        return countries;
    }

    public int getCountryCount() {
        return countries.size();
    }

    private static void setCountries(List<Country> countries) {
        CountryProvider.countries = countries;
    }
}
