package sailpoint.rdk.utils;

import org.mockito.Mockito;
import sailpoint.object.Application;
import sailpoint.object.Attributes;
import sailpoint.object.Identity;
import sailpoint.object.Link;

import java.util.HashMap;
import java.util.Map;

/**
 * Utilities related to mocking up objects for use in IDN tests
 */
public class Mockery {
    /**
     * Mocks up the attributes in an {@link Identity} object
     * @param mock The object to populate with attributes
     * @param attributes The mock attributes to assign
     */
    public static void mockAttributes(Identity mock, Map<String, Object> attributes) {
        for(String key : attributes.keySet()) {
            Object answer = attributes.get(key);
            if (answer instanceof String) {
                Mockito.when(mock.getStringAttribute(key)).thenReturn((String) answer);

                switch (key) {
                    case "name":
                        Mockito.when(mock.getName()).thenReturn((String) answer);
                        break;
                    case "firstName":
                        Mockito.when(mock.getFirstname()).thenReturn((String) answer);
                        break;
                    case "lastName":
                        Mockito.when(mock.getLastname()).thenReturn((String) answer);
                        break;
                    case "uid":
                        Mockito.when(mock.getUid()).thenReturn((String) answer);
                        break;
                    case "email":
                        Mockito.when(mock.getEmail()).thenReturn((String) answer);
                        break;
                    case "manager.id":
                    case "managerId":
                        Mockito.when(mock.getManager().getId()).thenReturn((String) answer);
                        break;
                    case "manager.name":
                    case "managerName":
                        Mockito.when(mock.getManager().getName()).thenReturn((String) answer);
                        break;
                    case "id":
                        Mockito.when(mock.getId()).thenReturn((String) answer);
                        break;
                }
            }
            Mockito.when(mock.getAttribute(key)).thenReturn(answer);
        }

        Attributes<String, Object> attrs = new Attributes<>();
        attrs.putAll(attributes);

        Mockito.when(mock.getAttributes()).thenReturn(attrs);
    }

    /**
     * Mock up a set of attributes on an Application object
     * @param mock The mock Application object
     * @param attributes The attributes to assign to the mock object
     */
    public static void mockAttributes(Application mock, Map<String, Object> attributes) {
        for(String key : attributes.keySet()) {
            Object answer = attributes.get(key);
            switch(key) {
                case "id":
                    Mockito.when(mock.getId()).thenReturn((String) answer);
                    break;
                case "name":
                    Mockito.when(mock.getName()).thenReturn((String) answer);
                    break;
                default:
                    if (answer instanceof String) {
                        Mockito.when(mock.getStringAttributeValue(key)).thenReturn((String) answer);
                    } else if (answer instanceof Integer) {
                        Mockito.when(mock.getIntAttributeValue(key)).thenReturn((Integer) answer);
                    }
            }
        }

        Attributes<String, Object> attrs = new Attributes<>();
        attrs.putAll(attributes);

        Mockito.when(mock.getAttributes()).thenReturn(attrs);
    }

    /**
     * Mocks a set of attributes on a {@link Link} object
     * @param mock The mock Link object
     * @param attributes The attributes to assign to the mock object
     */
    public static void mockAttributes(Link mock, Map<String, Object> attributes) {
        for(String key : attributes.keySet()) {
            Object answer = attributes.get(key);
            switch(key) {
                case "nativeIdentity":
                    Mockito.when(mock.getNativeIdentity()).thenReturn((String) answer);
                    break;
                case "application.name":
                case "applicationName":
                    Mockito.when(mock.getApplicationName()).thenReturn((String) answer);
                    break;
                case "application.id":
                case "applicationId":
                    Mockito.when(mock.getApplicationId()).thenReturn((String) answer);
                    break;
                default:
                    Mockito.when(mock.getAttribute(key)).thenReturn(answer);
                    Mockito.when(mock.getAttributes().get(key)).thenReturn(answer);
            }
        }
    }

    /**
     * Mocks a set of attributes on a {@link sailpoint.rule.Identity} object
     * @param mock The mock object
     * @param attributes The attributes to assign to the mock object
     */
    public static void mockAttributes(sailpoint.rule.Identity mock, Map<String, String> attributes) {
        for(String key : attributes.keySet()) {
            String answer = attributes.get(key);
            switch (key) {
                case "name":
                    Mockito.when(mock.getName()).thenReturn(answer);
                    break;
                case "firstName":
                    Mockito.when(mock.getFirstName()).thenReturn(answer);
                    break;
                case "lastName":
                    Mockito.when(mock.getLastName()).thenReturn(answer);
                    break;
                case "uid":
                    Mockito.when(mock.getUid()).thenReturn(answer);
                    break;
                case "email":
                    Mockito.when(mock.getEmail()).thenReturn(answer);
                    break;
                case "manager.id":
                case "managerId":
                    Mockito.when(mock.getManagerId()).thenReturn(answer);
                    break;
                case "manager.name":
                case "managerName":
                    Mockito.when(mock.getManagerName()).thenReturn(answer);
                    break;
                case "lifecycleState":
                    Mockito.when(mock.getLifecycleState()).thenReturn(answer);
                    break;
                case "employeeNumber":
                    Mockito.when(mock.getEmployeeNumber()).thenReturn(answer);
                    break;
                case "phone":
                    Mockito.when(mock.getPhone()).thenReturn(answer);
                    break;
                case "id":
                    Mockito.when(mock.getId()).thenReturn(answer);
                    break;
                case "personalEmail":
                    Mockito.when(mock.getPersonalEmail()).thenReturn(answer);
                    break;
                case "displayName":
                    Mockito.when(mock.getDisplayName()).thenReturn(answer);
                    break;
            }
        }

        Map<String, Object> attrs = new HashMap<>(attributes);
        Mockito.when(mock.getAttributes()).thenReturn(attrs);
    }

}
