import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzbuzzTest {
    Fizzbuzz fizz;

    @BeforeEach
    public void createFizzbuzz(){
        fizz = new Fizzbuzz();
    }

    @Test
    void createFizzbuzzArray_callCreateFizzBuzzMethod_return100ElementsInArray(){
        assertEquals(100,fizz.createFizzbuzzArray().length);
    }

    @Test
    void createFizzbuzzArray_callCreateFizzbuzzMethod_return3rdElementIsFizz(){
        assertEquals("Fizz", fizz.createFizzbuzzArray()[2]);
    }

    @Test
    void createFizzbuzzArray_callCreateFizzbuzzMethod_return9thElementIsFizz(){
        assertEquals("Fizz",fizz.createFizzbuzzArray()[8]);
    }

    @Test
    void createFizzbuzzArray_callCreateFizzBuzzMethod_return5thElementAsBuzz(){
        assertEquals("Buzz",fizz.createFizzbuzzArray()[4]);
    }

    @Test
    void createFizzBuzzArray_callCreateFizzBuzzMethod_return15thElementAsFizzBuzz(){
//        System.out.println(Arrays.toString(fizz.createFizzbuzzArray()));
        assertEquals("FizzBuzz",fizz.createFizzbuzzArray()[14]);
    }

    @Test
    void createFizzbuzzArray_callCreateFizzBuzzMethod_returnArrayThatMatchesThePatternFizzBuzzFizzBuzz(){
        Object[] shortFizzbuzz = new Object[]{1, 2, "Fizz", 4, "Buzz", "Fizz", 7, 8, "Fizz", "Buzz", 11, "Fizz", 13, 14, "FizzBuzz"};
        assertArrayEquals(shortFizzbuzz, Arrays.copyOfRange(fizz.createFizzbuzzArray(), 0, 15));

    }
}
