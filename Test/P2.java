import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import exP2alex.LetraDNI;

class P2 {

	@Test
	@DisplayName ("Examen")
	void test() {
		LetraDNI l = new LetraDNI();
		assertNull(l.obtenerLetraDNI(41571313));
	}

}
