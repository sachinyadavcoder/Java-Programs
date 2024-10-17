public class Generic {

    // A generic method with multiple type parameters
    public static <K, V> void printPair(K key, V value) {
        System.out.println("Key: " + key + ", Value: " + value);
    }

    public static void main(String[] args) {
        printPair("Age", 30);       // Key: Age, Value: 30
        printPair(100, "Apples");   // Key: 100, Value: Apples
    }
}

