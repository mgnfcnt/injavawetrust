class Main {
    public static void main(String[] args) {
        Functor[] myArray = new Functor[10];

        myArray[5] = new DoTask();

        myArray[5].execute();
    }
}