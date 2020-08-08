package Week3;

public class Week3Task1 {
    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // compute the fibonacci of $n
    public int fibonacci(int n) {
        if(n == 0 || n == 1)
        {
            return n;
        }
        else if(n < 0)
        {
            return -1;
        }
        else
        {
            return fibonacci(n-2) + fibonacci(n-1);
        }
    }

    /**
     * print all prime numbers from 0 to $n use Sieve of Eratosthenes algorithm
     * useful link https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
     * notice that print each number in a line
     * @param n
     */
    public void sieveEratosthenes(int n) {
            boolean[] check = new boolean[n + 1];
            // Khởi tạo tất cả các số [2...N] đều là số nguyên tố
            for (int i = 2; i <= n; i++) {
                check[i] = true;
            }

            // Thuật toán sàng nguyên tố
            // Nếu một số là số nguyên tố, thì tất cả các bội của nó không phải số nguyên tố
            for (int i = 2; i <= n; i++) {
                if (check[i] == true) {
                    for (int j = 2 * i; j <= n; j += i) {
                        check[j] = false;
                    }
                }
            }
            // In ra các số là số nguyên tố
            for (int i = 2; i <= n; i++) {
                if (check[i] == true) {
                    System.out.print(i + " ");
                }
            }
    }
}
