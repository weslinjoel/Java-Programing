import java.util.Arrays;

public class Largest {
    public static void main(String[] args) {
        int numbers[] = new int[]{32,43,53,54,32,65,63,98,43,23};
        int largetst = numbers[0];
        for(int i=1; i< numbers.length; i++)
        {
            if(numbers[i] > largetst) {
                largetst = numbers[i];
            }
        }
        System.out.println("Largest Number is : " +
                largetst);
    }
}

