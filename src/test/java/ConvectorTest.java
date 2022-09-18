import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ConvectorTest {

    Convector convector;

    @BeforeEach
    void setUp() {
        System.out.println("Start test");
        convector = new Convector();
    }

    @AfterEach
    void tearDown() {
        System.out.println("End test");
        convector = null;
    }

    @Test
    //Проверка на ввод букв
    public void throwsEx() {
        String letter = "l";
        try {
            Double num = Double.parseDouble(letter);
            convector.inchToMetre(num);
        } catch (NumberFormatException e) {
            assertEquals("For input string: \"l\"", e.getMessage());
        }
    }

    @Test
//    Проверка на пустой ввод
    public void throwsExEmpty() {
        String letter = "";
        try {
            Double num = Double.parseDouble(letter);
            convector.inchToMetre(num);
        } catch (NumberFormatException e) {
            assertEquals("empty String", e.getMessage());
        }
    }

    @Test
//    Проверка на корректную работы конвектора
    void test_inchToMetre() {
        double num = 28.9, expected = 0.7341;
        double result = convector.inchToMetre(num);
        assertEquals(expected, result);
    }

}