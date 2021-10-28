class Invalid
{
 public static void main(String args[])
 {
 char value='C';
 char upper=(char)(value-32);
 if(value>=65 && value<=90)
 {
  System.out.print("alphabet:" +value);
 }else if(value>=97 && value<=122)
 {
  System.out.print("alphabet:" +upper);
 }else
 {
 System.out.print("invalid");
 }
 }
} 