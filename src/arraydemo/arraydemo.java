package arraydemo;

import java.util.ArrayList;

public class arraydemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();

        System.out.println("array:"+array);
        array.add("java");
        array.add("hello");
        array.add(0,"world");
        System.out.println("array:"+array);
    }
}
