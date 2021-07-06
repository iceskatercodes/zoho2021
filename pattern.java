public class Patern
{ 
  static void print(String str) 
  { 
    char[] str1 = str.toCharArray();
    String temp=" ";
    int middle=str1.length/2;
    for (int k = middle; k < str1.length; k++) 
    { 
      
      temp=temp+str.charAt(k);
    }

    for (int k =0; k <middle; k++) 
    { 
      temp=temp+str.charAt(k);
    }
    for (int i = 0; i <= str1.length; i++) 
    { 
      for(int j=(str1.length-i); j>=0; j--)
      { 
        System.out.print(" "); 
      } 

      for(int j=0; j<=i; j++)
      {
          System.out.print(temp.charAt(j));
      }

      System.out.println(); 
    } 
  } 
  
  public static void main (String[] args) 
  { 
    String str = "WELCOME"; 
    print(str); 
    System.out.println(""); 
    
    String str1 = "WATER"; 
    print(str1); 
  } 
} 
