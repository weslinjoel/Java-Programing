import java.util.Arrays;
public class Insertelement {
    public static void main(String[] args) {
        int a[]={1,2,4,4};
        int index=2;
        int value=3;
        for(int i=a.length; i<index; i--){
            a[i]=a[i-1];
        }
        a[index]=value;
        System.out.println(Arrays.toString(a));
    }
}
