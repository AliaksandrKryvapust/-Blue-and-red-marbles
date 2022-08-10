public class Source {
    public static void main(String[] args) {
        int bs = 5;
        int rs =5;
        int be = 2;
        int re = 3;
        System.out.println(guessBlue(bs,rs,be,re)==0.6);
    }
    public static double guessBlue(int blueStart, int redStart, int bluePulled, int redPulled) {
        return (double) (blueStart - bluePulled) / (blueStart + redStart - bluePulled - redPulled);
    }
}
