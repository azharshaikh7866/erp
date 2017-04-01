package com.wwa.erp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.wwa.erp.model.CityMaster;

public interface CityRepository extends JpaRepository<CityMaster, Long> {

	@Query("select city from CityMaster city join fetch city.country where city.active = 1 and city.country.countryId=?1 Order By city.cityName Asc")
	List<CityMaster> findByCountryCountryIdAndActiveTrueOrderByCityNameAsc(long countryId);
	
	@Query("select city from CityMaster city join fetch city.country where city.country.countryId=? Order By city.cityName Asc")
	List<CityMaster> findByShowInPopupCountryCountryIdAndActiveTrueOrderByCityNameAsc(long countryId);
	
	List<CityMaster> findByCityName(String cityName);
	
	@Query("select city from CityMaster city join fetch city.country where city.cityId=?1")
	CityMaster findByCityId(Long id);
	
}
