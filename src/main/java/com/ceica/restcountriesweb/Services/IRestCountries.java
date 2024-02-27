package com.ceica.restcountriesweb.Services;

import com.ceica.restcountriesweb.Models.CountryDTO;

import java.util.List;

public interface IRestCountries {
    public String[] getRegions();
    public List<CountryDTO> getCoutriesByRegion(String region);
    public CountryDTO getCountryByName(String name);
    public CountryDTO getCountryByCca3(String cca3);
}
