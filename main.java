import java.util.Scanner; 
public class Main{
  
  public static void main(String[] args) {
    System.out.println("Please input  a positive integer:");
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    int cont = 1;
    String numstr;
    int numdig;
    int sum=0;
    int maxdig=0;
    while(cont==1){
      numstr=Integer.toString(num);
    for(int i = 0; i < numstr.length();i++){
      if (Character.getNumericValue(numstr.charAt(i)) > maxdig){
        maxdig=Character.getNumericValue(numstr.charAt(i))+1;
      }
    if(numstr.charAt(i) == '9'||numstr.length()==1){
      cont=0;
    }else{
      numdig=Integer.parseInt(String.valueOf(numstr.charAt(i)));
       sum+=numdig*Math.pow(maxdig,numstr.length()-i-1);
    }
      }
      num=sum;
    }
    System.out.println(num);
  }
}
