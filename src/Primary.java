public class Primary {
    public static void main(String[] args) {    //start of main method
        System.out.print("G'mornin, All Saints!");  //this line does something
        System.out.println(" How is everyone this morning?");

        System.out.println("  \"It is hot \ttoday!\\");

        System.out.println( 7 + 8 + 9 );
        System.out.println( 7 + " " + 8 + 9 );
        System.out.println( 7 + 8 + " " + 9 );
        System.out.println( 7 + " " + (8 + 9) );



        // Variables
        // 8 primitive types
            // 4 integer types:  byte [-128,127], short [-32768,32767], int [-2147483648,2147483647], long
        int bob = 2000000000;
        System.out.println( 2 * bob );

        System.out.println(Byte.MAX_VALUE);

        System.out.println(Byte.MIN_VALUE);

            // 2 real types: float 32-bit, double 64-bit
        double fl = 13.2 + 1.2;
        System.out.println((int)fl);
            // 1 unsigned "integer" type:  char
                // 'A' -> 65   1000001
                // ' ' -> 32   0100000
                // 'a' -> 97
                // '0' -> 48
        char let = 'q';
        char l = 65;
        char newline = '\n';

        bob = let + l;
        System.out.println( (char) bob );

            // 1 boolean: true, false



        // single line comment

    }   // end of main method
}

