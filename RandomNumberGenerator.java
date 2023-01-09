import java.util.Random;
public class RandomNumbers{
        public static void main(String[] args) {
        	Random obj = new Random();
            for (int i = 0; i< 10; i++){
              int randomNumber = obj.nextInt(10);
              System.out.println("Random No : " + randomNumber); 
             }
     }
}
