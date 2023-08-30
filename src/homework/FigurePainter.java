package homework;
class twodarray {
    public static void main(String[] args) {

        System.out.println("1"); // 1 orinak
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println(" ");

        System.out.println("2"); // 2-rd orinak

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("3"); // 3-rd orinak
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("4"); // 4-rd orinak
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("5"); // 5-rd orinak
        System.out.println("chi stacvel");
    }
}

