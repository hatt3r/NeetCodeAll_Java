class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> rowset = null;
        Set<Character> colset = null;
        for(int i =0;i<9;i++)
        {
            rowset = new HashSet<>();
            colset = new HashSet<>();
            for(int j=0;j<9;j++)
            {
                char r = board[i][j];
                char c = board[j][i];
                if(r!='.')
                {
                    if(rowset.contains(r))
                    {
                        return false;
                    }
                    else
                    {
                        rowset.add(r);
                    }
                }
                if(c!='.')
                {
                    if(colset.contains(c))
                    {
                        return false;
                    }
                    else
                    {
                        colset.add(c);
                    }
                }
            }
        }
        for(int i=0;i<9;i=i+3)
        {
            for(int j=0;j<9;j=j+3)
            {
                if(!checkBlock(i,j,board))
                {
                    return false;
                }
            }
        }
        return true;
    }
    private boolean checkBlock(int indI,int indJ,char[][] board)
    {
        Set<Character> blockset = new HashSet<>();
        int rows = indI +3;
        int cols = indJ +3;

        for(int i= indI;i<rows;i++)
        {
            for(int j=indJ;j<cols;j++)
            {
                if(board[i][j]=='.')
                {
                    continue;
                }
                if(blockset.contains(board[i][j]))
                {
                    return false;
                }
                blockset.add(board[i][j]);
            }
        }
        return true;
    }
}