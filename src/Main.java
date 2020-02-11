import shape1.Tryangle;

public class Main {
    public static void main(String[] args){
      learn1();
    }

    private static void learn1() {
      // オブジェクトの作成
      Tryangle tryangle = new Tryangle("shape1-tryangle", 7, 6, 5);
      System.out.println(
          // %sは文字列を引数に取る。 %.4fは浮動小数点を引数にとり、.4fは小数点第四位で四捨五入を行う。
          String.format("%s: 面積->%.4f", tryangle.getName(), tryangle.area())
      );
    }
}
