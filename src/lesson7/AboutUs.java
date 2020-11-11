package lesson7;

import javax.swing.*;
import java.awt.*;

public class AboutUs extends JFrame {

    private static final int WINDOW_WIDTH = 350;
    private static final int WINDOW_HEIGHT = 270;

    private MainWindow mainWindow;

    AboutUs(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        Rectangle gameWindowBounds = mainWindow.getBounds();
        int posX = (int) gameWindowBounds.getCenterX() - WINDOW_WIDTH / 2;
        int posY = (int) gameWindowBounds.getCenterY() - WINDOW_HEIGHT / 2;
        setLocation(posX, posY);
        setResizable(false);
        setTitle("Window about us");

        setVisible(false);

    }
}
