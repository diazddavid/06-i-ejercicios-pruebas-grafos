package thermostat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ThermostatTest {

	@Test
	void testAdvance(){
		thermostat.Thermostat();
		Thermostat.advance();
		assertsEquals("partOfDay es: Sleep");
		Thermostat.advance();
		assertsEquals("partOfDay es: Wake");
	}

}
