package sailpoint.rdk.utils;

import org.opentest4j.AssertionFailedError;

/**
 * Assertions for common IIQ and IDN situations, like "not null or empty"
 */
@SuppressWarnings("unused")
public class IDNAssertions {

    /**
     * Throws an {@link AssertionFailedError} if the input is null or empty
     * @param object The object to test
     */
    public static void assertNotNullOrEmpty(Object object) {
        if (object == null) {
            throw new AssertionFailedError("Expected not null or empty, got null");
        }
        if (object instanceof String) {
            if (((String) object).isEmpty()) {
                throw new AssertionFailedError("Expected not null or empty, got empty string");
            }
        }
    }

    /**
     * Throws an {@link AssertionFailedError} if the input is NOT null or empty
     * @param object The object to test
     */
    public static void assertNullOrEmpty(Object object) {
        if (object == null) {
            return;
        }
        if (object instanceof String) {
            if (((String) object).isEmpty()) {
                return;
            }
        }
        throw new AssertionFailedError("Expected null or empty, got " + object.getClass() + " [" + object + "]");
    }
}
