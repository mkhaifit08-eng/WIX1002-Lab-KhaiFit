public class T3Q3b {
    public static void main(String[] Args){
        int x=9, y=10;

        //The question
        System.out.println("Expected outcome: ");
        if (x < 10) {
        if (y < 10)  
        System.out.println("*****"); 
        else{ 
        System.out.println("#####"); 
        System.out.println("$$$$$");  
        }} 

        //The equivalent outcome
        System.out.println("Actual Execution: ");
        if (x < 10) {
            if (y < 10)  
                System.out.println("*****"); 
            else{ 
                System.out.println("#####"); 
                System.out.println("$$$$$");  
            }
        } 



    }
}
