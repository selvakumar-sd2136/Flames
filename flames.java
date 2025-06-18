import java.util.Arrays;
import java.util.Scanner;
public class flames 
{
    public static void main(String [] sd)
    {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter name of person_1: ");
       String a=sc.nextLine();
       System.out.print("Enter name of person_2: ");
       String b=sc.nextLine();
        int count=0;
        char [] name_1=new char[a.length()];
        char [] name_2=new char[b.length()];
        for(int i=0;i<a.length();i++)
        {
            name_1[i]=a.charAt(i);
        }
    //   System.out.println(Arrays.toString(name_1));

      for(int i=0;i<b.length();i++)
      {
          name_2[i]=b.charAt(i);
      }
    // System.out.println(Arrays.toString(name_2));
    System.out.println("-----------------------------------------");
    // System.out.println("After removing common letters");
        for(int i=0;i<name_1.length;i++)
        {
            for(int j=0;j<name_2.length;j++)
            {
                if(name_1[i]==name_2[j])
                {
                    name_1[i]=0;
                    name_2[j]=0;
                }
            }
        }
        //    System.out.println("removing of common 1st: "+Arrays.toString(name_1));
        //    System.out.println("removing of common 2nd: "+Arrays.toString(name_2));
        //    System.out.println("-------------------------------------------------");
        for(int i=0;i<name_1.length;i++)
        {
            if(name_1[i]!=0)
            {
                count++;
            }
        }

        for(int i=0;i<name_2.length;i++)
        {
            if(name_2[i]!=0)
            {
               count++;
            }
        }
        System.out.println("counting of uncommon: "+count);
            if(count==0)
            {
             System.out.println("M-A-D-E for E-A-C-H-O-T-H-E-R");
            }
        char[] flames={'f','l','a','m','e','s'};
        int len=0;
        int temp=0;
        for(int i=0;i<flames.length;i++)
        {
            if(flames[i]!='0')
            {
                temp++;
            }
            if(temp==count)
            {
                len++;
                flames[i]='0';
                temp=0;
            }
            if(i==flames.length-1)
            {
                i=-1;
            }
            if(len==flames.length-1)
            {
                break;
            }
        }
        
        char fetch='s';
        for(int i=0;i<flames.length;i++)
         {
            if(flames[i]!='0')
            {
                fetch=flames[i];
            }
         }
        System.out.println("we get: "+fetch);
        System.out.println("<<<<<<<<< relationship >>>>>>>>>");
        switch(fetch)
        {
            case 'f':
            {
                System.out.println("===> F-R-I-E-N-D-S");
                break;
            }
            case 'l':
            {
                System.out.println("===> L-O-V-E");
                break;
            }
            case 'a':
            {
                System.out.println("===> A-F-F-E-C-T-I-O-N-");
                break;
            }
            case 'm':
            {
                System.out.println("===> M-A-R-R-I-A-G-E");
                break;
            }
            case 'e':
            {
                System.out.println("===> E-N-E-M-Y");
                break;
            }
            case 's':
            {
                System.out.println("===> S-I-S-T-E-R");
                break;
            }
            default:
            {
                System.out.println("===> E-R-R-O-R");
                break;
            }
        }
    }        
}


       
        



