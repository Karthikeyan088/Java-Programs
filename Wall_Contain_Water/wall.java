public class wall
{
    public static void main(String[]arg)
    {
        int[]wall={0,3,5,8,2,6,9};
        int n=wall.length;
        int p1=0,p2=n-1;
        int max=0;
        int[]pair=new int[2];
        while(p1<p2)
        {
            int leng=min(wall[p1],wall[p2]);
            int brd=p2-p1;
            int tot=leng*brd;
            if(tot>max)
            {
                max=tot;
                pair[0]=p1;
                pair[1]=p2;

            }
            if(p1<p2)
            {
                p1++;
            }
            else
            {
                p2--;
            }
        }
        for(int num:pair)
        {
            System.err.println(num);
        }

    }
    public static int min(int a,int b)
    {
        if(a>b)
        {
            return b;
        }
        else
        {
            return a;
        }

    }
}
