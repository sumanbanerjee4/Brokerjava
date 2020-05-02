package com.home.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import com.home.model.Advertisement;
import com.home.repo.MongoRepo;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class HomeController {

	@Autowired
	MongoRepo repository;

	@Bean
	public CorsFilter corsFilter() {
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		CorsConfiguration config = new CorsConfiguration();
		config.setAllowCredentials(true);
		config.addAllowedOrigin("*");
		config.addAllowedHeader("*");
		config.addAllowedMethod("OPTIONS");
		config.addAllowedMethod("GET");
		config.addAllowedMethod("CREATE");
		config.addAllowedMethod("POST");
		config.addAllowedMethod("PUT");
		config.addAllowedMethod("DELETE");
		source.registerCorsConfiguration("/**", config);
		return new CorsFilter(source);
	}

	@GetMapping("/advertisements")
	public List<Advertisement> getAllAdvertisements() {

	
		

		return repository.findAll();
	}

	@PostMapping("/advertisement/create")
	public void postCustomer(@RequestBody Advertisement advertisement) {

		
		
		repository.save(advertisement);
	}

	@DeleteMapping("/advertisement/{name}")
	public void deleteAdvertisement(@PathVariable("name") String name) {
		

		repository.deleteByName(name);

		
	}

	@DeleteMapping("/advertisements/delete")
	public ResponseEntity<String> deleteAlladvertisement() {
		System.out.println("Delete All Advertisement...");

		repository.deleteAll();

		return new ResponseEntity<>("All advertisement have been deleted!", HttpStatus.OK);
	}

	@GetMapping("advertisement/pincode/{pincode}")
	public List<Advertisement> findByPinCode(@PathVariable("pincode") int pinCode) {

		List<Advertisement> advertisement = repository.findByPinCode(pinCode);
		return advertisement;
	}

	@GetMapping("advertisement/area/{area}")
	public List<Advertisement> findByArea(@PathVariable("area") String area) {
		System.out.println("--------------" + area);

		List<Advertisement> advertisement = new ArrayList<Advertisement>();

		advertisement = repository.findByArea(area);

		return advertisement;
	}

	/*
	 * @PutMapping("/advertisement/{id}") public ResponseEntity<Advertisement>
	 * updateAdvertisement(@PathVariable("id") Integer id, @RequestBody
	 * Advertisement advertisement) {
	 * System.out.println("Update Customer with ID = " + id + "...");
	 * 
	 * Optional<Advertisement> advertisementdata = repository.findById(id);
	 * 
	 * if (advertisementdata.isPresent()) { Advertisement advertisement2 =
	 * advertisementdata.get(); advertisement2.setName(advertisement2.getName());
	 * advertisement2.setPinCode(advertisement2.getPinCode());
	 * advertisement2.setActive(advertisement2.isActive()); return new
	 * ResponseEntity<>(repository.save(advertisement2), HttpStatus.OK); } else {
	 * return new ResponseEntity<>(HttpStatus.NOT_FOUND); }
	 */
	// }
}
