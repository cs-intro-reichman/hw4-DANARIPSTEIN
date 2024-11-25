public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int count = 0;
        boolean arr[] = new boolean[n + 1];
        // בונה את המערך הראושני
        arr[0] = false;
        arr[1] = false;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = true;
        }
        int p = 2;
        while (p <= Math.sqrt(n)) {
            if (arr[p] == true) {
                for (int m = p + 1; m < arr.length; m++) {
                    if (m % p == 0)
                        arr[m] = false;
                }
            }
            p++;
        }
        for (int j = 2; j < arr.length; j++) {
            if (arr[j] == true) {
                count++;
                System.out.println(j);
            }
        }
        int presnt = (int) (100.0 * (double) count / (double) n);
        System.out.println("There are " + count + " primes between 2 and " + n + " (" +
        presnt + "% are primes)");

    }
}