package shape1;

/**
 * 三角形オブジェクト
 */
public class Tryangle {
  // フィールド
  private String name;

  private Integer edgeLengthA;  // 辺の長さA

  private Integer edgeLengthB;

  private Integer edgeLengthC;

  // コンストラクタ
  public Tryangle(String name, Integer edgeLengthA, Integer edgeLengthB, Integer edgeLengthC) {
    this.name = name;
    this.edgeLengthA = edgeLengthA;
    this.edgeLengthB = edgeLengthB;
    this.edgeLengthC = edgeLengthC;
  }

  // メソッド
  public Double area() {
    return this.heronsFormula(edgeLengthA, edgeLengthB, edgeLengthC);
  }

  // getter(メソッドの一つ)
  public String getName() {
    return this.name;
  }

  // private method
  private Double heronsFormula(Integer edgeLengthA, Integer edgeLengthB, Integer edgeLengthC) {
    Double s = (edgeLengthA + edgeLengthB + edgeLengthC) / 2.0;
    Double S = s * (s - edgeLengthA) * (s - edgeLengthB) * (s - edgeLengthC);

    return Math.sqrt(S);
  }
}
