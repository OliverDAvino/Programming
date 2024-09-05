public class TriangularPrismVolume {
    public static void main(String[]args){
        double base1 = 3;
        double base2 = 4;
        double base3 = 5;
        double height = 6;
        double s = ((base1+base2+base3)/2);
        double ab = Math.sqrt(s*(s-base1)*(s-base2)*(s-base3));
        double result = (ab*height);
        System.out.println(result);
    }
}
