public class Pair
{
    public static void main(String[] args) {
        {
            int[]arry={0,4,7,2,5,9};
            int target=14;
            int n=arry.length;
            int p1=0;
            int p2=n-1;
            int to=0;
            int[]pair=new int[2];
            while(p1<p2)
            {
                int sum=p1+p2;
                if(sum>to)
                {
                    to=sum;
                    pair[0]=p1;
                    pair[1]=p2;
                }
                if(sum<target)
                {
                    p1++;
                }
                else
                {
                    p2--;
                }
            }
            for( int a:pair)
            {
                System.out.println(a);
            }
        }
    }

}