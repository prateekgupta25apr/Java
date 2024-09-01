package src;

import java.util.Arrays;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        String[] array = {"A", "B", "C"};
        List<String> list = Arrays.asList(array);

// Modifying the array affects the list
        array[0] = "X";
        System.out.println(list);  // Output: [X, B, C]

// Modifying the list affects the array
        list.set(1, "Y");
        System.out.println(Arrays.toString(array));  // Output: [X, Y, C]

        list.add("P");

    }
}

