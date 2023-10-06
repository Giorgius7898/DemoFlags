import java.awt.*;

public class LibreriaBanderas {
    public static final int COLOR_YELLOW = new Color(250,201,20).getRGB();
    public static final int COLOR_BLUE = new Color(17,13,99).getRGB();
    public static final int COLOR_RED = new Color(196,0,15).getRGB();
    public static final int COLOR_BLACK = new Color(5,5,5).getRGB();
    public static final int COLOR_WHITE = new Color(255,255,255).getRGB();
    public static final int COLOR_GREEN = new Color(35,138,51).getRGB();
    public static int[][] createCOLFlag(int height, int width){
        int[][] flag = new int[height][width];
        int rowIni=0;
        int rowEnd=0;

        rowIni=0;
        rowEnd=(int)(height*0.50);

        for (int row=rowIni; row<rowEnd; row++){
            for(int cell=0; cell<flag[row].length; cell++){
                flag [row][cell]= COLOR_YELLOW;
            }
        }
        rowIni=(int)(height*0.50);
        rowEnd=(int)(height*0.75);
        for (int row=rowIni; row<rowEnd; row++){
            for(int cell=0; cell<flag[row].length; cell++){
                flag [row][cell]= COLOR_BLUE;
            }
        }
        rowIni=(int)(height*0.75);
        rowEnd=(int)(height);
        for (int row=rowIni; row<rowEnd; row++){
            for(int cell=0; cell<flag[row].length; cell++){
                flag [row][cell]= COLOR_RED;
            }

        }

        return flag;
    }
    public static int[][] createVENFlag(int height, int width){
        int[][] flag = new int[height][width];
        int rowIni=0;
        int rowEnd=0;

        rowIni=0;
        rowEnd=(int)(height*0.34);

        for (int row=rowIni; row<rowEnd; row++){
            for(int cell=0; cell<flag[row].length; cell++){
                flag [row][cell]= COLOR_YELLOW;
            }
        }
        rowIni=(int)(height*0.35);
        rowEnd=(int)(height*0.67);
        for (int row=rowIni; row<rowEnd; row++){
            for(int cell=0; cell<flag[row].length; cell++){
                flag [row][cell]= COLOR_BLUE;
            }
        }
        rowIni=(int)(height*0.68);
        rowEnd=(int)(height);
        for (int row=rowIni; row<rowEnd; row++){
            for(int cell=0; cell<flag[row].length; cell++){
                flag [row][cell]= COLOR_RED;
            }
        }
        return flag;
    }
    public static int[][] createPOLFlag(int height, int width){
        int[][] flag = new int[height][width];
        int rowIni=0;
        int rowEnd=0;

        rowIni=0;
        rowEnd=(int)(height*0.50);
        for (int row=rowIni; row<rowEnd; row++){
            for(int cell=0; cell<flag[row].length; cell++){
                flag [row][cell]= COLOR_WHITE;
            }
        }
        rowIni=(int)(height*0.50);
        rowEnd=(int)(height);
        for (int row=rowIni; row<rowEnd; row++){
            for(int cell=0; cell<flag[row].length; cell++){
                flag [row][cell]= COLOR_RED;
            }
        }
        return flag;
    }
    public static int[][] createPANFlag(int height, int width){
        int[][] flag = new int[height][width];
        int rowIni=0;
        int rowEnd=0;
        int cellIni=0;
        int cellEnd=0;

        rowIni=0;
        rowEnd=(int)(height);
        for (int row=rowIni; row<rowEnd; row++){
            for(int cell=0; cell<flag[row].length; cell++){
                flag [row][cell]= COLOR_WHITE;
            }
        }
        rowIni=0;
        rowEnd=(int)(height*0.50);
        for (int row=rowIni; row<rowEnd; row++){
            for(int cell=(int)(width*0.50); cell<flag[row].length; cell++){
                flag [row][cell]= COLOR_RED;
            }
        }
        rowIni=(int)(height*0.50);
        cellEnd=(int)(width*0.50);
        for (int row=rowIni; row<(int)(height); row++){
            for(int cell=cellIni; cell<cellEnd; cell++){
                flag [row][cell]= COLOR_BLUE;
            }
        }
        return flag;
    }
    public static int[][] createCHLFlag(int height, int width){
        int[][] flag = new int[height][width];
        int rowIni=0;
        int rowEnd=0;
        int cellIni=0;
        int cellEnd=0;

        rowIni=0;
        rowEnd=(int)(height);
        for (int row=rowIni; row<rowEnd; row++){
            for(int cell=0; cell<flag[row].length; cell++){
                flag [row][cell]= COLOR_WHITE;
            }
        }
        rowIni=0;
        rowEnd=(int)(height*0.50);
        for (int row=rowEnd; row<(int)(height); row++){
            for(int cell=cellIni; cell<flag[row].length; cell++){
                flag [row][cell]= COLOR_RED;
            }
        }
        rowIni=0;
        cellEnd=(int)(width*0.30);
        for (int row=rowIni; row<(int)(height*0.50); row++){
            for(int cell=cellIni; cell<cellEnd; cell++){
                flag [row][cell]= COLOR_BLUE;
            }
        }
        return flag;
    }
    public static int[][] createUSAFlag(int height, int width){
        int[][] flag = new int[height][width];
        int rowIni=0;
        int rowEnd=0;
        int cellIni=0;
        int cellEnd=0;

        rowIni=0;
        rowEnd=(int)(height);
        for (int row=rowIni; row<rowEnd; row++){
            for(int cell=0; cell<flag[row].length; cell++){
                flag [row][cell]= COLOR_WHITE;
            }
        }
        rowIni=0;
        rowEnd=(int)(height*0.50);
        for (int row=rowIni; row<(int)(height); row=row+2){
            for(int cell=cellIni; cell<flag[row].length; cell++){
                flag [row][cell]= COLOR_RED;
            }
        }
        rowIni=0;
        rowEnd=(int)(height*0.50);
        cellEnd=(int)(width*0.30);
        for (int row=rowIni; row<rowEnd; row++){
            for(int cell=cellIni; cell<cellEnd; cell++){
                flag [row][cell]= COLOR_BLUE;
            }
        }
        return flag;
    }
    public static int[][] createCZEFlag(int height, int width){
        int[][] flag = new int[height][width];
        int rowIni=0;
        int rowEnd=0;
        int cellIni=0;
        int cellEnd=0;

        rowIni=0;
        rowEnd=(int)(height);
        for (int row=rowIni; row<rowEnd; row++){
            for(int cell=rowIni; cell<flag[row].length; cell++){
                flag [row][cell]= COLOR_WHITE;
            }
        }
        rowIni=(int)(height*0.50);
        rowEnd=(int)(height);
        for (int row=rowIni; row<rowEnd; row++){
            for(int cell=cellIni; cell<flag[row].length; cell++){
                flag [row][cell]= COLOR_RED;
            }
        }
        rowIni=0;
        rowEnd=(int)(height);
        cellEnd=(int)(width*0.30);
        int valor=0;
        for (int row=rowIni; row<rowEnd; row++){
            for(int cell=cellIni; cell<cellEnd; cell++){
                    if (cell==0) {
                        flag[row][cell] = COLOR_BLUE;
                    cell=1;
                    }
                    cell++;
                }

            }
        return flag;
    }
}
