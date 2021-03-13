import java.util.*;

class ABC{
    
    Set<String> ss=new HashSet<>();
    int count=0;
    void permutation(String s, int l,int r)
    {
       if(l==r)
       {
           if(ss.contains(s)) return;
            else ss.add(s);
           System.out.println(s);
           count++;
           return;
       }
       
       for(int i=l;i<=r;i++)
       {
           s=interchange(s,l,i);
           permutation(s,l+1,r);
           s=interchange(s,l,i);
       }
       
    }
    
    String interchange(String s,int i,int l)
    {
        char a[]=s.toCharArray();  //converts string to array
        char temp=a[i];
        a[i]=a[l];
        a[l]=temp;
        return String.valueOf(a);  //converts array to string
    }
}


public class Main
{
	public static void main(String[] args) {
		
		ABC ab=new ABC();
		System.out.println("\nPossible combinations:\n");
		ab.permutation("545",0,2);
		System.out.println("\nTotal unique combinations:\n"+ab.count);
	}
}
