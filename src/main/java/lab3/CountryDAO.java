package lab3;

import java.util.ArrayList;
import java.util.List;

public class CountryDAO {
    private List<Country> countries;

    public CountryDAO() {
        countries = new ArrayList<>();
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public void deleteCountry(Country country) {
        countries.remove(country);
    }

    public Country getCountry(String id) {
        for (Country country : countries) {
            if (country.getId().equals(id)) {
                return country;
            }
        }
        return null;
    }

    public void updateCountry(Country updatedCountry) {
        for (int i = 0; i < countries.size(); i++) {
            Country country = countries.get(i);
            if (country.getId().equals(updatedCountry.getId()) && !country.getName().equals(updatedCountry.getName())) {
                countries.set(i, updatedCountry);
                break;
            }
        }
    }
}
