
public class MotherBoard {

    public static class USB {
        private String conectare = "Este conectat";
    }

    public static void main(String[] args) {

        USB usb = new USB();
        System.out.println(usb.conectare);

        MotherBoard motherBoard = new MotherBoard();
    }
}