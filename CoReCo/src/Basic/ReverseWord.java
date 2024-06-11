package Basic;

//"Hello World" --> reverse words only
//      Ans --> 'olleH dlroW'.

public class ReverseWord {
    public static void main(String[] args) {
        String Str = "Hello World";
        System.out.println("Original string : "+Str);

        String words[] = Str.split("\\s");
        String revString = "";

        for (int i = 0; i < words.length; i++)
        {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            revString = revString + reverseWord + " ";
        }

        System.out.println("Reversed string : " + revString);
    }
}

