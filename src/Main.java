import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {
        int[][] flag = {};
        flag = LibreriaBanderas.createCOLFlag(12,20);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag = LibreriaBanderas.createVENFlag(12,20);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag = LibreriaBanderas.createPOLFlag(12,20);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag = LibreriaBanderas.createPANFlag(12,20);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag = LibreriaBanderas.createCHLFlag(12,20);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag = LibreriaBanderas.createUSAFlag(12,20);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag = LibreriaBanderas.createCZEFlag(12,20);
        JOptionPaneArrays.showColorArray2D(null,flag);
    }
}