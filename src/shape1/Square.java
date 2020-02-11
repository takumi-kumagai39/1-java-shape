package shape1;

/**
 * 四角形オブジェクト
 */
public class Square {
  // オブジェクト生成後、一切替わることのないフィールドであるならば、finalをつけることで明示できる
  private final String name;

  private final Integer edgeAB;

  private final Integer edgeBC;

  private final Integer edgeCD;

  private final Integer edgeAD;

  public Square(String name, Integer edgeAB, Integer edgeBC, Integer edgeCD, Integer edgeAD) {
    this.name = name;
    this.edgeAB = edgeAB;
    this.edgeBC = edgeBC;
    this.edgeCD = edgeCD;
    this.edgeAD = edgeAD;
  }

  public Double area(){
    return brahmaguptasFormula(edgeAB, edgeBC, edgeCD, edgeAD);
  }

  public String getName(){
    return this.name;
  }

  // 四角形の辺から面積を求めるブラーマグプタの公式
  private Double brahmaguptasFormula(Integer ab, Integer bc, Integer cd, Integer ad) {
    Double s = (ab + bc + cd + ad) / 2.0;
    Double S = (s - ab) * (s - bc) * (s - cd) * (s - ad);
    return Math.sqrt(S);
  }
}
