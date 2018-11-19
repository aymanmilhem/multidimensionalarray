/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multidimentsionalarray;

import java.util.Arrays;

/**
 *
 * @author omega
 */
public class MultiDimentsionalArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int boardDim = 8;
        char[][] board = new char[boardDim][boardDim];
        boolean isWhite = false;
        for (int y = 0; y < board.length; y++)
        {
            isWhite = !isWhite;
            for (int x = 0; x < board[y].length; x++)
            {
                if (isWhite) board[y][x] = 'W';
                if (!isWhite) board[y][x] = 'B';
                isWhite = !isWhite;
            }
        }
        for (int i = 0; i < board.length; i++)
        {
            System.out.println(Arrays.toString(board[i]));
        }
    }
    
}
