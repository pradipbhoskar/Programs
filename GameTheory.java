class Points
{
    public int maxPoints(int a[],int l,int r)
    {
        if(l+1==r)
        {
            return Math.max(a[l],a[r]);
        }
        
        return Math.max(  a[l]+ Math.min(maxPoints(a,l+2,r),maxPoints(a,l+1,r-1))   ,   a[r]+ Math.min(maxPoints(a,l,r-2),maxPoints(a,l+1,r-1))  );
    }
}

public class Main
{
    public static void main (String[] args) 
    {
       int a[]=new int[]{2,3,5,6,4,5};
        int l=a.length-1;
        
        Points p=new Points();
        System.out.println(p.maxPoints(a,0,l));
    }
}
