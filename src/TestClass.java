import org.junit.Assert;
import org.junit.Test;

public class TestClass {

    @Test
    public void firstTest() {
        try {
            WorkClass.someFunction(0);
        } catch (NullPointerException e) {
            System.out.println("Передан 0");
        }
    }

    @Test
    public void secondTest() {
        try {
            WorkClass.someFunction(0);
        } catch (IllegalArgumentException e) {
            System.out.println("Передано отрицательное число");
        }
    }

    @Test
    public void thirdTest() {
        try {
            WorkClass.someFunction(1);
        } catch (IllegalArgumentException e) {
            System.out.println("Передано отрицательное число");
        } catch (NullPointerException e) {
            System.out.println("Передано 0");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Передано положительное число");
        }

    }

    @Test
    public void forthTest() {
        try {
            WorkClass.someFunction(-5);
        } catch (Exception e) {
            System.out.println("Передано что-то не то");
        }
    }

    @Test
    public void fifthTest() {
        try {
            WorkClass.someFunction(28);
        } catch (IllegalArgumentException e) {
            System.out.println("Передано отрицательное число");
        } catch (NullPointerException e) {
            System.out.println("Передано 0");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Передано положительное число");
        } catch (Exception e) {
            System.out.println("Передано что-то не то");
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void annotationTest() {
        WorkClass.someFunction(28);
    }

    @Test
    public void nullAssert() {
      String result = WorkClass.getString(null);
        Assert.assertNull(result);
    }

    @Test
    public void sameAssert() {
        String result = WorkClass.getString("there is smh");
        Assert.assertNotNull(result);
    }

    @Test
    public void equalsAssert() {
        String result = WorkClass.getString("test is completed");
        Assert.assertEquals("test's completed",result);
    }
}
