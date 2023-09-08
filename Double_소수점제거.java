import java.text.DecimalFormat;

class Double_소수점제거 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.#####");
        System.out.println( df.format(1) );
        System.out.println( df.format(1.12) );
        System.out.println( df.format(1.912385) );
    }
}