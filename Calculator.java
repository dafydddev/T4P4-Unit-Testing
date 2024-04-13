package fi.utu.dafydd;

class Calculator {
    private int result;

    public Calculator() {
        reset();
    }

    public void reset() {
        this.result = 0;
    }

    public int getResult() {
        return this.result;
    }

    public void add(int value) {
        this.result += value;
    }

    public void subtract(int value) {
        this.result -= value;
    }

    public void multiply(int value) {
        this.result *= value;
    }

    public void exponent(int value) {
        int base = this.result;
        this.result = 1;
        for (int i = 0; i < value; i++) {
            multiply(base);
        }
    }
}