package com.example.Springdrinks.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class DrinkTest {

	@Test
	public void testEquals() {
		EqualsVerifier.forClass(Drink.class).usingGetClass().verify();
	}
	
	@Test
	public void noIdConstructor() {
		Drink drink = new Drink("Mirinda", "red", 3);
		
		assertNotNull(drink.getBrand());
		assertNotNull(drink.getColour());
	    assertNotNull(drink.getAge());
	    
	    assertEquals(drink.getBrand(),"Mirinda");
	    assertEquals(drink.getColour(),"red");
	    assertEquals(drink.getAge(),3);	
	}
	
	@Test
	public void settersTest() {
		Drink drink = new Drink(); 
		
		drink.setBrand("rubicon");
		drink.setColour("yellow");
		drink.setAge(4);
		
		assertNotNull(drink.getBrand());
		assertNotNull(drink.getColour());
	    assertNotNull(drink.getAge());
	    
	    assertEquals(drink.getBrand(), "rubicon");
	    assertEquals(drink.getColour(), "yellow");
	    assertEquals(drink.getAge(), 4);	
		
	}
}
