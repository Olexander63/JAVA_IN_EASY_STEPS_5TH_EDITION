package Elements;

public class Main {

    public static void main(String[] args) {
        int[] kios_q1 = {42000, 48000, 50000};
        int[] kios_q2 = {52000, 58000, 60000};
        int[] kios_q3 = {46000, 49000, 58000};
        int[] kios_q4 = {50000, 51000, 61000};

        int[] outlet_q1 = {57000, 63000, 60000};
        int[] outlet_q2 = {70000, 67000, 73000};
        int[] outlet_q3 = {67000, 65000, 62000};
        int[] outlet_q4 = {72000, 69000, 75000};

        int[] sum = new int[12];
        int total = 0;

        for (int i = 0; i < kios_q1.length; i++) {
        sum[i]  = kios_q1[i] + outlet_q1[i];
        sum[i+3] = kios_q2[i] + outlet_q2[i];
        sum[i+6] = kios_q3[i] + outlet_q3[i];
        sum[i+9] = kios_q4[i] + outlet_q4[i];
        }

        for (int i  = 0; i < sum.length; i++){
            System.out.println("Месяц" + (i+1) +" обьем продаж:\t" +sum[i]);
            total += sum[i];
        }
        System.out.println("ОБЩИЙ ОБЬЕМ ПРОДАЖ ЗА ГОД\t" +total);
    }
}
