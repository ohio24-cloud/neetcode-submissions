class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen= new HashSet<>();
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                char number=board[i][j];
                if(number!='.')
                {
                    String boxKey=(i/3) + "-" + (j/3);
                 if(!seen.add(number + "found in row"+i)||                 !seen.add(number + "found in col"+j)||
                 !seen.add(number + "found in box"+boxKey))
                 {
                    return false;
                 }
            }
        }
        }
        return true;
        
    }
}
