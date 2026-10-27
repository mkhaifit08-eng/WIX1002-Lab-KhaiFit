public class T3Q3a {
    public static void main(String[] Args){
        int x=9, y=10;
        System.out.println("Expected: ");
        if (x < 10)  
        if (y > 10) 
        System.out.println("*****"); 
        else 
        System.out.println("#####"); 
        System.out.println("$$$$$"); 
        
        //The equivalent execution:
        System.out.println("Actual Execution: ");
        if (x < 10)  {
            if (y > 10) {
                System.out.println("*****"); 
            } else{
                System.out.println("#####"); 
            }
        }
            System.out.println("$$$$$"); 

    }
}
