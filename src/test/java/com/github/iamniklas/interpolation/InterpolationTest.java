package com.github.iamniklas.interpolation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InterpolationTest {

    //Test Configuration
    private static final float MAXIMUM_DEVIATION = 0.0000005f;

    @Test
    void testLinear() {
        float[] expectedValues = { 0.0f, 0.1f, 0.2f, 0.3f, 0.4f, 0.5f, 0.6f, 0.7f, 0.8f, 0.9f, 1.0f,};
        runTestCase(expectedValues, InterpolationType.Linear);
    }

    @Test
    void testEaseInSine() {
        float[] expectedValues = { 0.0f, 0.01231166f, 0.04894348f, 0.10899348f, 0.19098301f, 0.29289322f, 0.41221475f, 0.54600950f, 0.69098301f, 0.8435655f, 1.0f};
        runTestCase(expectedValues, InterpolationType.EaseInSine);
    }
    @Test
    void testEaseOutSine() {
        float[] expectedValues = { 0.0f, 0.1564344f, 0.30901699f, 0.45399050f, 0.58778525f, 0.70710678f, 0.80901699f, 0.89100652f, 0.95105657f, 0.98768834f, 1.0f};
        runTestCase(expectedValues, InterpolationType.EaseOutSine);
    }
    @Test
    void testEaseInOutSine() {
        float[] expectedValues = { 0.0f, 0.024471742f, 0.095491503f, 0.20610737f, 0.34549150f, 0.5f, 0.65450850f, 0.79389267f, 0.90450850f, 0.975528259f, 1.0f};
        runTestCase(expectedValues, InterpolationType.EaseInOutSine);
    }

    @Test
    void testEaseInQuad() {
        float[] expectedValues = { 0.0f, 0.01f, 0.04f, 0.09f, 0.16f, 0.25f, 0.36f, 0.49f, 0.64f, 0.81f, 1.0f};
        runTestCase(expectedValues, InterpolationType.EaseInQuad);
    }
    @Test
    void testEaseOutQuad() {
        float[] expectedValues = { 0.0f, 0.19f, 0.36f, 0.51f, 0.64f, 0.75f, 0.84f, 0.91f, 0.96f, 0.99f, 1.0f};
        runTestCase(expectedValues, InterpolationType.EaseOutQuad);
    }
    @Test
    void testEaseInOutQuad() {
        float[] expectedValues = { 0.0f, 0.02f, 0.08f, 0.18f, 0.32f, 0.5f, 0.68f, 0.82f, 0.92f, 0.98f, 1.0f};
        runTestCase(expectedValues, InterpolationType.EaseInOutQuad);
    }

    @Test
    void testEaseInCubic() {
        float[] expectedValues = { 0.0f, 0.001f, 0.008f, 0.027f, 0.064f, 0.125f, 0.216f, 0.343f, 0.512f, 0.729f, 1.0f};
        runTestCase(expectedValues, InterpolationType.EaseInCubic);
    }
    @Test
    void testEaseOutCubic() {
        float[] expectedValues = { 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        runTestCase(expectedValues, InterpolationType.EaseOutCubic);
    }
    @Test
    void testEaseInOutCubic() {
        float[] expectedValues = { 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        runTestCase(expectedValues, InterpolationType.EaseInOutCubic);
    }

    @Test
    void testEaseInQuart() {
        float[] expectedValues = { 0.0f, 0.0001f, 0.0016f, 0.0081f, 0.0256f, 0.0625f, 0.1296f, 0.2401f, 0.4096f, 0.6561f, 1.0f};
        runTestCase(expectedValues, InterpolationType.EaseInQuart);
    }
    @Test
    void testEaseOutQuart() {
        float[] expectedValues = { 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        runTestCase(expectedValues, InterpolationType.EaseOutQuart);
    }
    @Test
    void testEaseInOutQuart() {
        float[] expectedValues = { 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        runTestCase(expectedValues, InterpolationType.EaseInOutQuart);
    }

    @Test
    void testEaseInQuint() {
        float[] expectedValues = { 0.0f, 0.00001f, 0.00032f, 0.00243f, 0.01024f, 0.03125f, 0.07776f, 0.16807f, 0.32768f, 0.59049f, 1.0f};
        runTestCase(expectedValues, InterpolationType.EaseInQuint);
    }
    @Test
    void testEaseOutQuint() {
        float[] expectedValues = { 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        runTestCase(expectedValues, InterpolationType.EaseOutQuint);
    }
    @Test
    void testEaseInOutQuint() {
        float[] expectedValues = { 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        runTestCase(expectedValues, InterpolationType.EaseInOutQuint);
    }

    @Test
    void testEaseInExpo() {
        float[] expectedValues = { 0.0f, 0.001953125f, 0.00390625f, 0.0078125f, 0.015625f, 0.03125f, 0.0625f, 0.125f, 0.25f, 0.5f, 1.0f};
        runTestCase(expectedValues, InterpolationType.EaseInExpo);
    }
    @Test
    void testEaseOutExpo() {
        float[] expectedValues = { 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        runTestCase(expectedValues, InterpolationType.EaseOutExpo);
    }
    @Test
    void testEaseInOutExpo() {
        float[] expectedValues = { 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        runTestCase(expectedValues, InterpolationType.EaseInOutExpo);
    }

    @Test
    void testEaseInCirc() {
        float[] expectedValues = { 0.0f, 0.005012562f, 0.02020410289f, 0.04606079858f, 0.08348486101f, 0.1339745962f, 0.2f, 0.2858571571f, 0.4f, 0.5641101056f, 1.0f};
        runTestCase(expectedValues, InterpolationType.EaseInCirc);
    }
    @Test
    void testEaseOutCirc() {
        float[] expectedValues = { 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        runTestCase(expectedValues, InterpolationType.EaseOutCirc);
    }
    @Test
    void testEaseInOutCirc() {
        float[] expectedValues = { 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        runTestCase(expectedValues, InterpolationType.EaseInOutCirc);
    }

    @Test
    void testEaseInBack() {
        float[] expectedValues = { 0.0f, -0.01431422f, -0.04645056f, -0.08019954f, -0.09935168f, -0.0876975f, -0.02902752f, 0.09286774f, 0.29419776f, 0.59117202f, 1.0f};
        runTestCase(expectedValues, InterpolationType.EaseInBack);
    }
    @Test
    void testEaseOutBack() {
        float[] expectedValues = { 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        runTestCase(expectedValues, InterpolationType.EaseOutBack);
    }
    @Test
    void testEaseInOutBack() {
        float[] expectedValues = { 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        runTestCase(expectedValues, InterpolationType.EaseInOutBack);
    }

    @Test
    void testEaseInElastic() {
        float[] expectedValues = { 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        runTestCase(expectedValues, InterpolationType.EaseInElastic);
    }
    @Test
    void testEaseOutElastic() {
        float[] expectedValues = { 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        runTestCase(expectedValues, InterpolationType.EaseOutElastic);
    }
    @Test
    void testEaseInOutElastic() {
        float[] expectedValues = { 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        runTestCase(expectedValues, InterpolationType.EaseInOutElastic);
    }

    @Test
    void testEaseInBounce() {
        float[] expectedValues = { 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        runTestCase(expectedValues, InterpolationType.EaseInBounce);
    }
    @Test
    void testEaseOutBounce() {
        float[] expectedValues = { 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        runTestCase(expectedValues, InterpolationType.EaseOutBounce);
    }
    @Test
    void testEaseInOutBounce() {
        float[] expectedValues = { 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        runTestCase(expectedValues, InterpolationType.EaseInOutBounce);
    }


    private void runTestCase(float[] _expectedValues, InterpolationType _interpolationType) {
        for (int i = 0; i < _expectedValues.length; i++) {
            System.out.printf("Loop-Count: %d -- Expect: %f -- Actual: %f%n", i, _expectedValues[i], Interpolation.getInterpolationValue(0.1f * i, _interpolationType));
            assertTrue(_expectedValues[i] + MAXIMUM_DEVIATION > Interpolation.getInterpolationValue(0.1f * i, _interpolationType));
            assertTrue(_expectedValues[i] + MAXIMUM_DEVIATION > Interpolation.getInterpolationValue(0.1f * i, _interpolationType));
        }
    }
}