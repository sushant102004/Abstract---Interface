abstract class Bank {
    abstract int getROI();
}

class SBI extends Bank {
    int getROI(){
        return 6;
    }
}

class PNB extends Bank {
    int getROI(){
        return 8;
    }
}

class ABS {
    public static void main(String args[]){
        SBI sbi = new SBI();
        PNB pnb = new PNB();

        System.out.println("SBI: " + sbi.getROI());
        System.out.println("PNB: " + pnb.getROI());
    }
}