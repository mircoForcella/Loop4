import java.util.Random;

public class CustomNumber {
    private int number;


    public CustomNumber() {
        Random random = new Random();
        this.number = random.nextInt(1,12);
        System.out.println("Generated number : " + this.number);
    }

    public void getMultiplicationTable(){
        for(int i = 12; i != 0; i--){
            int multiplication = number * i;
            System.out.println(multiplication);
        }
    }
}
