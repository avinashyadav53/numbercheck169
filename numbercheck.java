public class numbercheck {
    public static void checknumber(int num) {
        if (num > 0)
            System.out.println("Positive");
        else
            System.out.println("Zero");
    }

    public static void main(String[] args) {
        checknumber(-3);
    }
}