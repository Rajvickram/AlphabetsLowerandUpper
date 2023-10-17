import java.util.*;


class Alphabets {
    static void displayForwardAlphabetsLowercase() {

        System.out.println("Below Mentioned Vowels are Forward in Lower Case : ");

        for (char i='a';i<='z';i++) {
            if (i=='a' || i=='e' || i=='i' || i=='o' || i=='u') {
                System.out.println(i);
            }
        }

        System.out.println("Below Mentioned Consonants are Forward in Lower Case : ");

        for (char ch='a';ch<='z';ch++) {
            if (ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u') {
                System.out.println(ch);
            }
        }
    }


    static void displayBackwardAlphabetsLowercase() {

        System.out.println("Below Mentioned Vowels are Backward in Lower Case : ");

        for (char i='z';i>='a';i--) {
            if (i=='a' || i=='e' || i=='i' || i=='o' || i=='u') {
                System.out.println(i);
            }
        }

        System.out.println("Below Mentioned Vowels are Backward in Lower Case : ");

        for(char ch='z';ch>='a';ch--) {
            if (ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u') {
                System.out.println(ch);
            }
        }
    }


    static void displayForwardAlphabetsUppercase() {
        

        System.out.println("Below Mentiond Vowels are Forward in Upper Case : ");

        for (char i='A';i<='Z';i++) {
            if (i=='A' || i=='E' || i=='I' || i=='O' || i=='U') {
                System.out.println(i);
            }
        }

        System.out.println("Below Mentioned Consonats are Forward in Upper Case : ");

        for (char ch='A';ch<='Z';ch++) {
            if (ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U') {
                System.out.println(ch);
            }
        }
    }


    static void displayBackwardAlphabetsUppercase() {

        System.out.println("Below Mentiond Vowels are Backward in Upper Case : ");

        for (char i='Z';i>='A';i--) {
            if (i=='A' || i=='E' || i=='I' || i=='O' || i=='U') {
                System.out.println(i);
            }
        }

        System.out.println("Below Mentioned Consonats are Backward in Upper Case : ");

        for (char ch='Z';ch>='A';ch--) {
            if (ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U') {
                System.out.println(ch);
            }
        }
    }
}


class OK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean data = true;

        do {
            System.out.println("Press 1 For Display Forward Lower Case : ");
            System.out.println("Press 2 For Display Backward Lower Case : ");
            System.out.println("Press 3 For Display Forward Upper Case : ");
            System.out.println("Press 4 For Display Backward Upper Case : ");
            System.out.println("Please Select Your Choice : ............... ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 : {
                    Alphabets.displayForwardAlphabetsLowercase();
                }break;

                case 2 : {
                    Alphabets.displayBackwardAlphabetsLowercase();
                }break;

                case 3 : {
                    Alphabets.displayForwardAlphabetsUppercase();
                }break;

                case 4 : {
                    Alphabets.displayBackwardAlphabetsUppercase();
                }break;

                case 5 : {
                    data = false;
                    System.out.println("Thanks for Pressing us..............");
                }break;

                default : {
                    System.out.println("Thanks for Followeing us.................");
                }
            }
        } while(data);
    }
}