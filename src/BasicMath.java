public class BasicMath {

    public static void main(String[] args){
        // + _ * / %

        System.out.println(5 + 2);
        System.out.println(5 * 2);
        System.out.println(5 / 2);
        System.out.println(5 % 2);

        System.out.println(5.0 + 2);
        System.out.println(5 * 2.0);
        System.out.println(5.0 / 2);
        System.out.println(5.5 % 2);

        // double a = Math.sqrt( b * b - 4 * a * c);

        // random numbers

       double r = Math.random(); // a random number from [0, 1)
        System.out.println(r);
        // random integer number in a range from [bot,top]
        // (int)(Math.random()*(top-bot+1) + bot)
        System.out.println((int)(Math.random()*(20)+1));
    }
}
