package com.wwa.erp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.wwa.erp.model.CountryMaster;

public interface CountryRepository extends JpaRepository<CountryMaster, Long> {

	@Query("select country from CountryMaster country order by country.countryName ASC")
	List<CountryMaster> findByActiveOrderByCountryNameAsc(boolean active);
	
	CountryMaster findByCountryName(String name);
}
