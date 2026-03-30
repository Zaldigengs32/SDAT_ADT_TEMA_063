import java.util.Date;

public class CobaDate {
    public static void main(String[] args) {
        Date curDate = new Date();
        System.out.println("Tanggal Sekarang : " + curDate.getDate() + "/" +
        (curDate.getMonth()+1) +
            '/'+(curDate.getYear()+1900));
    }
}