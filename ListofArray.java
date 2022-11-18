import java.util.ArrayList;
import java.util.Scanner;

public class ListofArray {
    ArrayList<String> names = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);

    
    public void add(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name:");
            String s = sc.nextLine();
            System.out.println();
            names.add(s);
            names.replaceAll(String::toUpperCase);
        }
        System.out.println(names);
    }

    
    public void remove(int pos) {
        
        names.remove(pos);
        System.out.println(names);
    }

    // public void get(int pos) {
    //     System.out.println(names.get(pos));
    // }
    public void printNames(){
        String str;
        int i,j;
        for ( i = 0; i < names.size(); i++)
      {
        str = names.get(i);
      
        for(j=0;j<str.length();j++){
        if(str.charAt(j)=='A' || str.charAt(j)=='E' || str.charAt(j)=='I' || str.charAt(j)=='U' || str.charAt(j)=='O')
        {
            System.out.println("The name "+str+" contains vowels "+"and the vowels are "+str.charAt(j));
        }
    
}
            int count;  
          
             
            char string[] = str.toCharArray();  
              
            System.out.println("Duplicate characters in a given string: ");  
            
            for(i = 0; i <string.length; i++) {  
                count = 1;  
                for(j = i+1; j <string.length; j++) {  
                    if(string[i] == string[j] && string[i] != ' ') {  
                        count++;  
                        //Set string[j] to 0 to avoid printing visited character  
                        string[j] = '0';  
                    }  
                }  
                
                if(count > 1 && string[i] != '0')  
                    System.out.println(string[i]);  
            } 
       
          

        }
            
        }
      
    

// System.out.println(name);
        
    
    

    public static void main(String args[]) {
        ListofArray la = new ListofArray();
        la.add(1);
        
        la.printNames();
    }
}