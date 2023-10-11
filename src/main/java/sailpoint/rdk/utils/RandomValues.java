package sailpoint.rdk.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@SuppressWarnings("unused")
public class RandomValues {

    /**
     * A list of random first names
     */
    public static final List<String> FIRST_NAMES =
            Arrays.asList(
                    "Robert", "Susan",
                    "Mary", "Jonathan",
                    "Sanjay", "Parvati",
                    "Hansel", "Gretel",
                    "Joan", "Francis",
                    "Antonio", "Luca",
                    "Aurora", "Ariel",
                    "Kenji", "Yuki",
                    "Beverly", "Deanna"
            );

    /**
     * A list of random last names
     */
    public static final List<String> LAST_NAMES =
            Arrays.asList(
                    "Roberts", "Jones", "Smith",
                    "Johnson", "Garcia", "Lee",
                    "Kumar", "Hernandez", "Ahmad",
                    "Ren", "Shah", "Ramirez",
                    "Reyes", "Williams", "Cho",
                    "Umar", "Sato", "Barbosa",
                    "Dias", "Miller", "Shen",
                    "Wilson", "Chavez", "Rai",
                    "van Winkle", "von Trapp"
            );

    /**
     * A reusable {@link Random} object
     */
    public static final Random RANDOM = new Random();

    /**
     * Common suffixes in Western last names
     */
    public static final List<String> SUFFIX =
            Arrays.asList(
                    "Jr",
                    "Sr",
                    "III"
            );

    /**
     * Chooses a random item from a list of items using the {@link #RANDOM} object
     *
     * @param items The list of items
     * @return A random item from the list, or null if the list is null or empty
     * @param <T> The type of the list items
     */
    public static <T> T fromList(List<? extends T> items) {
        if (items == null || items.isEmpty()) {
            return null;
        }

        int index = RANDOM.nextInt(items.size());

        return items.get(index);
    }

    /**
     * Gets a random UUID for a Sailpoint object
     * @return A random UUID, without dashes
     */
    public static String randomUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
