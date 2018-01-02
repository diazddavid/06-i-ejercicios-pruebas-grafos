package thermostat;

import static org.junit.Assert.*;
import org.junit.Test;

class ThermostatTest {

	@Test void testAdvance(){
		Thermostat thermo = new Thermostat();
		thermo.advance();
		
		assertEquals("partOfDay es Sleep", thermo.getPart(), "Sleep");
		thermo.advance();
		assertEquals("partOfDay es Wake", thermo.getPart(), "Wake");
	}
	
	@Test void testUp() {
		Thermostat thermo = new Thermostat();
		
		assertEquals("Temp es Low", thermo.getTemp(), "Low");
		thermo.up();
		assertEquals("Temp es High", thermo.getTemp(), "High");
		thermo.up();
		assertEquals("Temp sigue siendo High", thermo.getTemp(), "High");
	
		
	}

}
