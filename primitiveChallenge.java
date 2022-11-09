//create variables of type byte ,short and int and assign any valid value of your choice and then initialize the long data type variable
//the long variable should contain 50000+10*(sum of byte,short,int)
public class primitiveChallenge {
   public static void main(String[]args){
    byte myValue=12;
    short myOwnNum=45;
    int res=500;
    long myLongValue=50000+10*( (myValue)+  (myOwnNum)+(res));
    System.out.println(myLongValue);
   }
}
