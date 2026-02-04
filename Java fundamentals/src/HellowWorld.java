public class HellowWorld {
    // i can make comments like this
    public static void main(String[] args) {
        String greetings;
        greetings = " greetings to you!";
        int x = 11;
        x +=4;
        x = x - 6;
        while (x != 12) {
            /* multi
            line 
            commment */
            String ammount;
            if (x > 12) {
                ammount = "too many";
                x--;
            }
            else if (x < 12) {
                ammount = "not enough";
                x++;
            }
            else {
                ammount = "lucky number of";
            }
            System.out.println(ammount + greetings);
            System.out.println(x);
        }
    }
}
