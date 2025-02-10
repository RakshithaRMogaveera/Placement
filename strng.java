import java.util.Scanner;
public class strng {
    public static char sub(String msg){
        if(msg==null || msg.isEmpty())
        return '\0';
    

    for( int i=0;i<msg.length()-1;i++){
        if(msg.charAt(i)==msg.charAt(i+1)){
        return '\0';
    }
    }
    return msg.charAt(0);
    }

public static void main (String[] args){
    Scanner str=new Scanner(System.in);
    System.out.println("Enter the String");
    String s=str.nextLine();
    char result=sub(s);
    if(result=='\0'){
    
        System.out.println("-1");
    }else{
        System.out.println(result);
    }

}
}