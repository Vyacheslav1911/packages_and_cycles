package ru.netology.sqr;

public class SQRService {
     public int calculate ( int dn, int up){
            int sqr = 0;

            for (int a = 10; a <= 99; a++) {
                int res = a * a;
                if (res >= dn) {
                    if (res <= up) {
                        sqr++;
                    }
                }
            }
            return sqr;
        }
    }