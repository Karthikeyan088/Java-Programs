public class Building
{
    public static void main(String[]args)
    {
        int[]building={1,2,0,5,7,0,8,3,0,9,5};
        int n=building.length;
        int p1=0,p2=n-1;
        int lmax=0;
        int rmax=0;
        int tot=0;
        while (p1<p2)
        { 
            if(building[p1]< building[p2])
            {
                if(building[p1]<lmax)
                {
                    tot+=lmax-building[p1];
                    p1++;
                    
                }
                else
                {
                    lmax=building[p1];
                    p1++;
                }

            }
            else
            {
                 if(building[p2]<rmax)
                {
                    tot+=rmax-building[p2];
                    p2--;
                }
                else
                {
                    rmax=building[p2];
                    p2--;
                }

            }
            
        }
        System.out.println(tot);
    }
     
}