public class Pawn {
    public static final String BLACK = "black";
    public static final String WHITE = "white";

    private String color;

    Pawn(String color) {
        this.color = color;
    }

    Pawn() {
        this(WHITE); // 생성자에서 같은 클래스의 다른 생성자를 호출한다.
    }

    public String getColor() {
        return color;
    }
}
