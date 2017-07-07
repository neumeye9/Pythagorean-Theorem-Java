import java.lang.Math;

class Pythagorean {
    public double calculateHypotenuse(int legA, int legB){
        double sidesSquared = (legA * legA) + (legB * legB);
        double squareRoot = Math.sqrt(sidesSquared);
        return squareRoot;
    }
}
    