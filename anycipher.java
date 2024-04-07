import java.util.*;

 // Compiler version JDK 11.0.2

 class anycipher
 {
   public static void main(String args[])
   { 
    
    String e;
    Scanner ob= new Scanner(System.in);
    int i,n,j=0,t;
    
    System.out.println("enter key without spaces");
    e=ob.nextLine();
    for(n=0;n<=j;n++)
    {
    int z;
    String P;
    
    System.out.println("entertext(without spaces)");
    P=ob.next();
    
    System.out.println("encryption - 1 decryption - 2");
    z=ob.nextInt();
   int b=e.length();
    int[] a = new int[b];;
    for(i=0;i<b;i++)
    {
      int h=e.charAt(i);
      a[i]=h-96;
    }
    
    int l =P.length();
    int[] r = new int[l];;
    for(i=0;i<l;i++)
    {
      
      r[i]=i%b;
       
    }
    if(z==1)
    {
    System.out.print("ciphertext(without spaces) is: ");
    
    for(i=0;i<l;i++)
    {
     int k=r[i];
      int f=P.charAt(i);
     int d=  f + a[k];
     if(d>122)
     d=96+(d-122);
     char c = (char)d;
      System.out.print(c);
     
    }
   }
   if(z==2)
   {
    System.out.print("plaintext(without spaces) is: ");
    
    for(i=0;i<l;i++)
    {
     int k=r[i];
      int f=P.charAt(i);
     int d=  f - a[k];
     if(d<97)
     d=122-(96-d);
     char c = (char)d;
      System.out.print(c);
     
    }
   }
   
   System.out.println("\n  if you wish to continue press 1 ");
   t=ob.nextInt();
   if(t==1)
   j++;
   }
 }
 }
