package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


class calculadoraParametroTest {

	private int a, b, exp;
	
	private static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.of(1, 1, 2),
                Arguments.of(2, 3, 5),
                Arguments.of(3, 3, 6)
        );
    }
	
	@ParameterizedTest
	@MethodSource("getData")
	void testAdd() {
		Calculadora calc = new Calculadora();
		int result = calc.add(a, b);
		assertEquals(exp,result);
	}

}
