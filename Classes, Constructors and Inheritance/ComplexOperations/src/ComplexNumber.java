public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        this.real = getReal() + real;
        this.imaginary = getImaginary() + imaginary;
    }

    public void add(ComplexNumber complexNumber) {
        this.real += complexNumber.getReal();
        this.imaginary += complexNumber.getImaginary();
    }


    public void subtract(ComplexNumber complex) {
        this.real -= complex.getReal();
        this.imaginary -= complex.getImaginary();

    }

    public void subtract(double real, double imaginary) {
        this.real = getReal() - real;
        this.imaginary = getImaginary() - imaginary;
    }
}


