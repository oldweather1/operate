package redis;

public class caculate {
    public static void main(String[] args) {
        //-1/6*log2(1/6) -5/6*log2(5/6)
        System.out.println(
                -(0.167)*Math.log10((0.167))/Math.log10(2)-(0.833)*Math.log10((0.833))/Math.log10(2)
        );
        System.out.println();
    }
}
