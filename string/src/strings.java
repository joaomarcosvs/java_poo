public class strings {
    public static void main(String[] args) {

        String og = "abcde FGHIJ ABC abc DEFG      ";
        String s01 = og.toLowerCase();
        String s02 = og.toUpperCase();
        String s03 = og.trim();
        String s04 = og.substring(2);
        String s05 = og.substring(2, 9);
        String s06 = og.replace('a', 'x');
        String s07 = og.replace("abc", "xyz");
        int i = og.indexOf("bc");
        int j = og.lastIndexOf("bc");
        String s = "potato;apple;lemon";
        String[] vect = s.split(";");
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];

        System.out.println("Original: -" + og + "-");
        System.out.println("toLoweCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("subString(2): -" + s04 + "-");
        System.out.println("subString(2, 9): -" + s05 + "-");
        System.out.println("subString(a, x): -" + s06 + "-");
        System.out.println("replace('abc', 'xyz'): -" + s07 + "-");
        System.out.println("indexOf(bc):" + i);
        System.out.println("lastIndexOf(bc):" + j);
        System.out.println("Split:" + word1 + "-" + word2 + "-" + word3);

        

    }
}
