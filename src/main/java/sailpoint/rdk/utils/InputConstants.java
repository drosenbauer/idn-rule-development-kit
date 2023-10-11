package sailpoint.rdk.utils;

/**
 * Constants so that you don't spend your time fighting with misspelled
 * inputs, rather than actual test failures
 */
@SuppressWarnings("unused")
public class InputConstants {
    public static final String INPUT_APPLICATION = "application";
    public static final String INPUT_APPLICATION_NAME = "applicationName";
    public static final String INPUT_ATTRIBUTE = "attribute";
    public static final String INPUT_ATTRIBUTE_NAME = INPUT_ATTRIBUTE;
    public static final String INPUT_CONTEXT = "context";
    public static final String INPUT_IDENTITY = "identity";
    public static final String INPUT_IDN_UTIL = "idn";
    public static final String INPUT_LINK = "link";
    public static final String INPUT_LOG = "log";
    public static final String INPUT_NATIVE_IDENTITY = "nativeIdentity";
    public static final String INPUT_PLAN = "plan";
    public static final String INPUT_PROVISIONING_PLAN = INPUT_PLAN;

    private InputConstants() {
        /* Do not construct this, use the static variables */
    }
}
