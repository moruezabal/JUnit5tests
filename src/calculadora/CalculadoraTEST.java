package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.*;

class CalculadoraTEST {
	
	Calculadora calc;
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("beforeAll");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("afterAll");
	}
	
	@BeforeEach
	public void before() {
		System.out.println("before()");
		calc = new Calculadora();
	}
	
	@AfterEach
	public void after() {
		System.out.println("after()");
		calc.clear();
	}

	@Test
	public void testAdd() {
		System.out.println("add");
		int resultado = calc.add(2, 3);
		int esperado = 5;
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testSub() {
		System.out.println("sub");
		int resultado = calc.sub(2, 3);
		int esperado = -1;
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testDiv() {
		System.out.println("div");
		int resultado = calc.div(9, 3);
		int esperado = 3;
		assertEquals(esperado, resultado);
	}
	
	@Test //@Test(expected = ArithmeticException.class) --> JUnit 4
	public void testDivPorCero() {
		assertThrows(ArithmeticException.class, () -> calc.div(5,0));
	}
	
	@Test
	@Timeout(value = 2500, unit = TimeUnit.MILLISECONDS)
	public void testOperacionOptima() {
		calc.operacionOptima();
	}
}
