public class Q7{
    public static void main(String[] args)
    {
        int[][] matrix = new int[10][10];
        matrix[0][1] = 9;
        matrix[2][0] = 3;
        System.out.println(matrix[0][1]);
        convert(matrix);
       for(int i=0;i<9;i++){
            for(int j=0;j<9;j++)
            {
        System.out.println(matrix[i][j]);
            }
        }

    }
    public static void convert(int[][] matrix)
    {
    boolean[] row = new boolean[matrix.length];
    boolean[] column = new boolean[matrix[0].length];
    for(int i=0;i<matrix.length;i++)
    {
        for(int j=0;j<matrix[0].length;j++)
        {
            if(matrix[i][j] == 0)
            {
                row[i]=true;
                column[j]=true;
            }

        }
    }
    for(int j = 0;j<row.length;j++)
    {
        if(row[j])
            nullifyRow(matrix, j);
    }
    for(int i = 0;i<column.length;i++)
    {
        if(column[i])
            nullifyColumn(matrix,i);
    }

    }
    public static void nullifyRow(int[][] matrix, int row)
    {
        for(int j = 0; j<matrix[0].length; j++)
        {
            matrix[row][j] = 0;
        }
    }
    public static void nullifyColumn(int[][] matrix, int column)
    {
        for(int i = 0; i<matrix.length;i++)
        {
            matrix[i][column] = 0;
        }
    }
}
