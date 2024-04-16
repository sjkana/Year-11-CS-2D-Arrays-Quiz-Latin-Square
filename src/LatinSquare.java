public class LatinSquare {

    /**
     *
     * @param rowSize
     * @return given the rowSize N (corresponding to an array of size N x N),
     *         calculate and return the sum of consecutive integers 1 + 2 + ... + N
     */
    public static int targetCheckSum1(int rowSize) {
        int sum=0;
        for(int i = 1; i<=rowSize; i++)
        {
            sum += i;
        }
        return sum;
    }

    /**
     *
     * @param rowSize
     * @return given the rowSize N (corresponding to an array of size N x N),
     *         calculate and return the product of consecutive integers 1 * 2 * ... * N
     */
    public static int targetCheckSum2(int rowSize) {
        int prod=1;
        for(int i = 1; i<=rowSize; i++)
        {
            prod = prod*i;
        }
        return prod;
    }


    /**
     *
     * @param array2d
     * @param checkSum1
     * @param checkSum2
     * @return whether or not every row's sum in array2d is equal to checkSum1,
     *         AND that every row's product in array2d is equal to checkSum2
     */
    public static boolean isLatinRows(int[][] array2d, int checkSum1, int checkSum2)
    {
        for(int i = 0; i<array2d.length; i++)
        {
            int rowSum = targetCheckSum1(array2d[i].length);
            int rowProd = targetCheckSum2(array2d[i].length);
            if((rowSum != checkSum1) || (rowProd != checkSum2))
            {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param array2d
     * @param checkSum1
     * @param checkSum2
     * @return whether or not every column's sum in array2d is equal to checkSum1,
     *         AND that every column's product in array2d is equal to checkSum2
     */

    public static boolean isLatinColumns(int[][] array2d, int checkSum1, int checkSum2) {
        for(int i = 0; i<array2d[i].length-1; i++)
        {
            int rowSum = targetCheckSum1(array2d.length);
            int rowProd = targetCheckSum2(array2d.length);
            if((rowSum != checkSum1) || (rowProd != checkSum2))
            {
                return false;
            }
        }
        return true;
    }


    /**
     *
     * @param array2d
     * @return whether array2d is a Latin square or not.
     *         Hint: make use of isLatinRows and isLatinColumns
     */
    public static boolean isLatinSquare(int[][] array2d)
    {
        int sum = targetCheckSum1(array2d.length);
        int prod = targetCheckSum2(array2d.length);
        return(isLatinRows(array2d, sum, prod) && isLatinColumns(array2d, sum, prod));
    }

    /** OPTIONAL (only do if you have time)
     *
     * @param array2d
     * @return whether or not array2d is a latin square
     *         as well as whether the sum and product of each of the two main diagonals is equal
     *         to the checkSums or not.
     *
     * NOTE: not all Latin squares are diagonal; for example, diagonal Latin squares do not exist for 2x2 or 3x3
     */
    public static boolean isDiagonalLatinSquare(int[][] array2d) {
        return false;
    }

}
