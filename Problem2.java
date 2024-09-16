public class main
{
    public static void main(String[] args)
    {
        int number = 123;
        int digit1 = (number % 10); //store 3
        number = number / 10;   //make number 12: 12.3 rounds to 12

        int digit2 = (number % 10); //store 2
        number = number / 10;   // make number 1
        
        int digit3 = (number % 10); //store 1
        number = number / 10;  //make number 0

        System.out.println("Three digit number: " + number);
        System.out.println("Here are the digits:");
        System.out.println(digit3); //print 1
        System.out.println(digit2); //print 2
        System.out.println(digit1); //print 3
    }
}