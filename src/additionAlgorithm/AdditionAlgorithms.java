
package additionAlgorithm;

public class AdditionAlgorithms {
    
    public static void main(String[] args) {
        int[] a = {1, 0, 0};
        int[] b = {1, 0, 0};
        int[] c = add(a, b);
        
        // get the results
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]); 
        }
        System.out.println("");
    }
    
    static int[] add(int x[], int y[]) {
        // make sure the arrays are the same length
        assert (x.length == y.length);
        int carry = 0;
        int[] result = new int[x.length + 1];
        // we want the loop to start reading the number from right (end of array length) to left where index is 0
        for (int i = x.length - 1; i >= 0; i--) {
            int temp_res = x[i] + y[i] + carry; 
            if (temp_res >= 10) {
                result[i+1] = temp_res - 10;
                carry = 1;
            } else {
                result[i+1] = temp_res;
                carry = 0;
            }
        }
        result[0] = carry;
        return result;
    }
}
