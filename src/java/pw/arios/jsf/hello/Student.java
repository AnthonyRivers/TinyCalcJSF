/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pw.arios.jsf.hello;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Antonio
 */
@ManagedBean
public class Student {
    
    private String firstName;
    private String lastName;
    private String country;
    private List<String> countryOptions;
    private String favoriteProgrammingLanguage;
    private String[] favoriteLanguages;

    public String[] getFavoriteLanguages() {
        return favoriteLanguages;
    }

    public void setFavoriteLanguages(String[] favoriteLanguages) {
        this.favoriteLanguages = favoriteLanguages;
    }

    
    
    public String getFavoriteProgrammingLanguage() {
        return favoriteProgrammingLanguage;
    }

    public void setFavoriteProgrammingLanguage(String favoriteProgrammingLanguage) {
        this.favoriteProgrammingLanguage = favoriteProgrammingLanguage;
    }

    public List<String> getCountryOptions() {
        return countryOptions;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    public Student() {
        
        firstName = "John";
        lastName = "Doe";
        favoriteProgrammingLanguage = "Java";
        countryOptions = new ArrayList<>();
        countryOptions.add("Brazil");
        countryOptions.add("France");
        countryOptions.add("Germany");
        countryOptions.add("India");
        countryOptions.add("Turkey");
        countryOptions.add("United Kingdom");
        countryOptions.add("United States");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
}
