public class Complex extends ScannerCalculator{
    static int summReal = a1 + a2;
    static int summImage=  b1 + b2;
    static int difReal = a1 - a2;
    static int difImage = b1 - b2;
    static int multiplyReal = a1*a2 - b1*b2;
    static int multiplyImage = a1*b2 - a2*b1;
    static int divideReal = ((a1*a2 + b1*b2)/(a2*a2+b2*b2));
    static int divideImage = ((a2*b1 - a1*b2)/(a2*a2+b2*b2));
}
