package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int sqr = service.calculate(400, 500);
        System.out.println(sqr);
    }
}
