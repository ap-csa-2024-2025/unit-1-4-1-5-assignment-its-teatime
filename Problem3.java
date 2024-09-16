public class Problem4 {
    public static void main(String[] args)
    {
        int number = 5678;
        System.out.println("Four digit number: " + number);
        System.out.println("Here are the digits: ");
        for (int i = 0; i < 4; i++)
        {
            int digit = number % 10;
            number = number / 10;
            System.out.println(digit);
        }
    }
    
    
}

