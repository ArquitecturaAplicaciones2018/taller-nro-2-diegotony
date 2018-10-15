import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

public class RationalTest {
    public RationalTest() {
    }

    @Test
    public void constructorTest(){
        Rational rational =  new Rational(1,3);

    }

    @Test
    public void toStringTest(){
        Rational r = new Rational(1,3);
        assertEquals("1/3",r.toString());

    }

    @Test
    public  void  isLesssThanTest(){
        Rational r = new Rational(1,3);
        Rational r2 = new Rational(2,3);
        assertEquals(true,r.isLessThan(r2));
    }

    @Test
    public void getGreaterTest(){
        Rational r = new Rational(1,3);
        Rational r2 = new Rational(2,3);
        assertEquals("2/3",r.getGreater(r2).toString());
    }

    @Test
    public void plusTest(){
        Rational r = new Rational(1,3);
        Rational r2 = new Rational(2,3);
        assertEquals("1",r.plus(r2).toString());
    }

    @Test
    public void  minusTest(){
        Rational r = new Rational(1,3);
        Rational r2 = new Rational(2,3);
        assertEquals("1/3",r2.minus(r).toString());
    }

    @Test
    public void  timesTest(){
        Rational r = new Rational(1,3);
        Rational r2 = new Rational(2,3);
        assertEquals("2/9",r2.times(r).toString());
    }

    @Test
    public  void dividesTest(){
        Rational r = new Rational(1,3);
        Rational r2 = new Rational(2,3);
        Rational exp = new Rational(1,2);
        assertEquals("1/2",r.divides(r2).toString());
    }



}
