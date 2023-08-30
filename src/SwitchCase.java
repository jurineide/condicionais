public class SwitchCase {
    public static void main(String[] args) {
        String sigla = "Z";
        switch (sigla){
            case "B":{
                System.out.println("esse é o B");
                break;
            }
            case "C":{
                System.out.println("esse é o C");
                break;
            }
            case "D":{
                System.out.println("esse é o D");
                break;
            }
            case "A":{
                System.out.println(" esse é o A");
                break;
            }
            default: {
               System.out.println( "esse não existe");
            }
        }
    }
    
}
