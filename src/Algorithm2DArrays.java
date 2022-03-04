import java.util.ArrayList;

public class Algorithm2DArrays {
    public static boolean isFound(int[][] arr, int target) {
        for (int [] row : arr)
        {
            for (int num : row)
            {
                if(num == target)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static int countElementsWithSubstring(String[][] arr, String searchStr) {
        int count = 0;
        for (String[] row : arr)
        {
            for (String word : row)
            {
                if (word.indexOf(searchStr) != -1)
                {
                    count++;
                }
            }
        }
        return count;
    }

    public static int replaceEvensWithZero(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
                if (arr[i][j] % 2 == 0)
                {
                    arr[i][j] = 0;
                    count++;
                }
            }
        }
        return count;
    }

    public static int sumForRow(int[][] arr, int row) {
        int sum = 0;
        for (int num : arr[row])
        {
            sum += num;
        }
        return sum;
    }

    public static int sumForColumn(int[][] arr, int col) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr [i][col];
        }
        return sum;
    }

    public static int[][] printNumberGrid(int rows, int cols) {
        int [] [] grid = new int [rows] [cols];
        int num = 0;
        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid[0].length; j++)
            {
                grid [i][j] = num;
                num++;
            }
        }
        for (int[] row : grid)
        {
            for (int element : row)
            {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        return grid;
    }

    public static String[][] gridOfXandO(int n) {
        String [][] grid = new String [n][n];
        int num = 0;
        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid[0].length; j++)
            {
                if (num % 2 == 0)
                {
                    grid [i][j] = "X ";
                }
                else
                {
                    grid [i][j] = "O ";
                }
                num++;
            }
        }
        return grid;
    }

    public static ArrayList<String> findStringsOfLength(String[][] wordChart, int len) {
        ArrayList<String> lenWords = new ArrayList<>();
        for (String[] row : wordChart)
        {
            for (String word : row)
            {
                if(word.length() == len)
                {
                    lenWords.add(word);
                }
            }
        }
        return lenWords;
    }
}


