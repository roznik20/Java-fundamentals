public class HellowWorld {
    // i can make comments like this
    public static void main(String[] args) {
        String greetings;
        greetings = " greetings to you!";
        int x = luckyNumberSubstract(22);
        x = Math.abs(x);
        System.out.println(x);
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
        }

        for (int i = 0; i<=12; i++) {
            int counts;
            counts = 12 - i;
            if ( i != 12){
                System.out.println(counts + " till lucky number");
            }
            else{ 
                System.out.println("here is the lucky numer: " + i);
            }
        }
        String a = "blob";
        String b = "Blob";
        boolean nonCapital = a.equals(b);
        boolean capital = a.equalsIgnoreCase(b);
        System.out.println(nonCapital);
        System.out.println(capital);
        System.out.println(a.length());
        System.out.println(a.charAt(2));


        String numStr = "32";
        String doubStr = "3.14";
        int num = Integer.parseInt(numStr);
        double doub = Double.parseDouble(doubStr);
        double sum = num + doub;
        System.out.println(sum);
    }
    public static int luckyNumberSubstract(int num) {
        int luckyNumSub = 12 - num;
        return luckyNumSub;
    }
}
