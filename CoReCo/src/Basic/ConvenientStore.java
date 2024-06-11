package Basic;
/*
At My Store
I have few currency notes with me - few of INR 10, 50, 100 and 200.
I am at a store to buy an item. I saw the price of the item.
I want a function which can tell me if I can buy this item with the notes that I have with me.
The functional will take an array of number of notes that I have, in given order (10, 50, 100, 200) and another parameter as price of item. I am expecting the function to return "I can purchase" or "I need more money". Kindly write this function in your favorite programming lang.
*/

public class ConvenientStore {
    public static void main(String[] args) {
        int[] notes = {2,3,1,2};
        int price = 540;

        String result = canPurchase(notes,price);
        System.out.println(result);
    }
    public static String canPurchase(int[] notes, int price){
        int [] note = {10,50,100,200};

        int totalMoney = 0;
        for (int i=0; i<notes.length;i++){
            totalMoney += notes[i] *note[i];
        }
        if (totalMoney >= price){
            return "I can Purchase";
        }else {
            return "I need More Money";
        }
    }
}
