public class Solution {
    public static void main(String[] args) {
        System.out.println(repeat(3, "number"));
        System.out.println(repeat(5, "article"));
    }

    public static String repeat(int count, String word) {
        String output = "";
        for (int i = 1; i <= count; i++) {
            output += word + i + " ";
        }
        return output;
    }

}