package math;

import org.testng.Assert;

public class UnitTestingMath {


    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

        long actualFactNum = 0;
        long expectedValue = 0;
        long actualValue = 0;
        Factorial factorial = new Factorial();
        actualFactNum = 6;
        expectedValue = 420;
        actualValue = factorial.calFactorial(actualFactNum);
        try {
            Assert.assertEquals( expectedValue,actualValue, "factorial is not correct");
            Assert.fail("answer is correct");

            //Factorial factorial1 = new Factorial();
            actualFactNum = 4;
            actualValue = 24;
            expectedValue = factorial.recursiveFactorial(actualFactNum);
            Assert.assertEquals( expectedValue,actualValue, "answer is not correct");
            Assert.fail("answer is correct");
            } catch (Exception ex) {
                ex.getMessage();

            }


        }
}
