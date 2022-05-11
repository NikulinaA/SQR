import ru.netology.sqr.SQRService;

public class Main {

    public static void main(String[] args) {
        SQRService service = new SQRService();

        int minD = 200;
        int maxD = 300;

        int actual = service.calculate(minD, maxD);


        System.out.println(actual);

    }
}
