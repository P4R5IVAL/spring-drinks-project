package com.example.Springdrinks.service;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.Springdrinks.domain.Drink;
import com.example.Springdrinks.repo.DrinkRepo;


@SpringBootTest
public class DrinkServiceUnitTest {

	@Autowired
	private DrinkService service;
	
	@MockBean
	private DrinkRepo repo;
	
	@Test
	public void createTest() {
		Drink input = new Drink("Pepsi", "Black", 7);
		Drink output = new Drink(1L,"Pepsi", "Black", 7);
		
		Mockito.when(this.repo.save(input)).thenReturn(output);

		assertEquals(output,this.service.create(input));
		
		Mockito.verify(this.repo, Mockito.times(1)).save(input);
	
	}
	
}

