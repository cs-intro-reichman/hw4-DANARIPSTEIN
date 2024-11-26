public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        if (str == null || str.isEmpty())
            return "";
        int i = 0;
        String ans = "";
        char ch = ' ';
        while (i < str.length()) {
            if (64 < str.charAt(i) && str.charAt(i) < 91)
                ch = (char) (str.charAt(i) + 32);
            else
                ch = (char) (str.charAt(i));
            ans = ans + ch;
            i++;
        }
        return ans;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if (str1 == "" || str1 == null || str2 == null)
            return false;
        if (str2 == "")
            return true;
        str1 = lowerCase(str1);
        str1 = lowerCase(str2);
        boolean contain = true;
        int j = 0;
        if (str1.length() < str2.length())
            return false;
        for (int i = 0; i < str2.length(); i++) {
            while (j < str1.length()) {
                if (str2.charAt(i) != str1.charAt(j))
                    contain = false;
                else {
                    contain = true;
                    break;
                }
                j++;
            }
        }
        return contain;
    }
}
