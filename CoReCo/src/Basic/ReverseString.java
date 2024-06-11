package Basic;



//"Hello World" --> reverse string
//      Ans --> 'dlroW olleH'.


    public class ReverseString {
        public static void main(String[] args) {
            String string = "Hello World";
            String revStr = "";

            for(int i = string.length()-1; i >= 0; i--){
                revStr = revStr + string.charAt(i);
            }

            System.out.println("Original string: " + string);
            System.out.println("Reverse of given string: " + revStr);
        }
    }
