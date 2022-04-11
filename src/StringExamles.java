import java.nio.charset.StandardCharsets;

public class StringExamles {
    public static void main(String[] args) {
        String doniyor = "Doniyor ";
        System.out.println(doniyor.toLowerCase());//so'zlarni kichik harfga ogrib beradi
        System.out.println(doniyor.toUpperCase());//so'zlarni katta harflarga ogirib beradi
        System.out.println(doniyor.charAt(2));//2 indexidagi belgini qaytaradi
        String familiya = "Qalandarov";
        System.out.println(doniyor.concat(familiya));
        String link = "         ";
        System.out.println(link.hashCode());
        System.out.println(link.codePointBefore(2));
        System.out.println(link.isEmpty());
        System.out.println(link.isBlank());
        System.out.println(link.equals(doniyor));

    }
}
