package shape2;

public class Tryangle implements Shape {

  private String name;

  private Integer edgeLengthA;  // 辺の長さA

  private Integer edgeLengthB;

  private Integer edgeLengthC;

  public Tryangle(String name, Integer edgeLengthA, Integer edgeLengthB, Integer edgeLengthC) {
    this.name = name;
    this.edgeLengthA = edgeLengthA;
    this.edgeLengthB = edgeLengthB;
    this.edgeLengthC = edgeLengthC;
  }

  @Override
  public Double area() {
    return heronsFormula(edgeLengthA, edgeLengthB, edgeLengthC);
  }

  @Override
  public String getName() {
    return this.name;
  }

  private Double heronsFormula(Integer edgeLengthA, Integer edgeLengthB, Integer edgeLengthC) {
    Double s = (edgeLengthA + edgeLengthB + edgeLengthC) / 2.0;
    Double S = s * (s - edgeLengthA) * (s - edgeLengthB) * (s - edgeLengthC);

    return Math.sqrt(S);
  }
}
