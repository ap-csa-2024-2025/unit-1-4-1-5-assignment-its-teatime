public class Problem1
{
  public static void main(String[] args)
  {
    
    int num = 24;
    System.out.println("Initial value: " + num);
    for (int i = 0; i < 4; i++) //repeat 4 times
    {
      num++;                   //increases number by 1
      System.out.println("Number is now " + num);
    }
    for (int i = 0; i < 4; i++)
    {
      num--;                   //decreases number by 1
      System.out.println("Number is now " + num);
    }
  }
}
