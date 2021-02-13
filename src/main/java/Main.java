import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String s;
        s = aport("косточка", 20);
        System.out.println(s);
    }

    static String aport(String str, int amount) {
        String result;
        result = "Пожёванная " + str + ", количество " + amount;
//        result = String.format("Пожёванная %s, количество $d", str, amount);
        return result;
    }

}
