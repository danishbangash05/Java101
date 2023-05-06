public class SumOfNumbers
{
    public static void main(String []args)
    {
        int n1 = 2, n2 = 3, sum;
        sum = n1+ n2;
        saySumofthetwonumbers(sum);
    }
    public static void saySumofthetwonumbers (int sum) {
        System.out.println("Sum of two numbers:" +sum);
    }
}