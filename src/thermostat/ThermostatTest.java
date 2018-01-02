package thermostat;

import static org.junit.Assert.*;
import org.junit.Test;

class ThermostatTest {

	@Test void testAdvance(){
		Thermostat thermo = new Thermostat();
		thermo.advance();
		assertEquals("Part es Sleep", thermo.getPart(), "Sleep");
		thermo.advance();
		assertEquals("partOfDay es Wake", thermo.getPart(), "Wake");
	}

}
