package gitpack;

public class Second {
    public static void main(String[] args) {
        int x = 45;
        int y = 21;
        System.out.println(deltaBetweenSquares(Long.valueOf(x), Long.valueOf(y)));
        System.out.println(StrictMath.pow(x,2) - StrictMath.pow(y,2));
        System.out.println("x^2 - y^2 = x^2 - 2xy + y^2");

    }

    private static String deltaBetweenSquares(Long value1, Long value2) {
        return String.format("%d^2 - %d^2 = %d\n if value1 - value2 = 1", value1, value2, 2*(value2-1)+3);
    }

}
