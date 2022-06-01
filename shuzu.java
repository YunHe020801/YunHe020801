import java.util.Scanner;

public class Max 
{
    public static void main(String[] args)
    {
        int shu[]=new int[100];
        int k=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入若干个整数：");
        String a=scanner.next();
        if(a.equals("#")) System.out.println("您什么都没有输入，故没有最大值！");
        else
        {
            shu[k]=Integer.parseInt(a);
            k++;
            a=scanner.next();
            while(!a.equals("#"))
            {
                shu[k]=Integer.parseInt(a);
                k++;
                a=scanner.next();
            }
            
            System.out.println("数组中连续数的最大值为："+MaxSum(shu,k));
        }
    }
    
    static int MaxSum(int[] arr,int k) 
    {
        int Sum=0;
        int maxSum=0;
        int len=k;
        int d;
        int i;
        int j;

        for(j=0;j<len;j++)
        {
            for (i=j;i<len+j;i++) 
            {
                if(i>len-1) d=i-len;
                else d=i;
                Sum+=arr[d];
                if(Sum<0) 
                {
                    Sum=0;
                }
                if(Sum>maxSum) 
                {
                    maxSum=Sum;
                }
            }
            Sum=0;
        }

        if(maxSum==0) 
        {
            for(i=0;i<len;i++) 
            {
                if(i==0) 
                {
                    maxSum=arr[i];
                }
                if(arr[i]>maxSum) 
                {
                    maxSum=arr[i];
                }
            }
        }
        
        return maxSum;
    }
}
