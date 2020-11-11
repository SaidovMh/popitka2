package lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {

    private static final int WINDOW_WIDTH = 507;
    private static final int WINDOW_HEIGHT = 555;
    private static final int WINDOW_POSX = 650;
    private static final int WINDOW_POSY = 270;

    private Setting settingWindow;
    private GameMap gameMap;
    private AboutUs winAboutUs;

    MainWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLocation(WINDOW_POSX, WINDOW_POSY);
        setTitle("Игра: Крестики-нолики");

        settingWindow = new Setting(this);
        gameMap = new GameMap();
        winAboutUs = new AboutUs(this);


        JButton btnStart = new JButton("Create new game");
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingWindow.setVisible(true);
            }
        });

        JButton btnAboutUs = new JButton("About us");
        btnAboutUs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                winAboutUs.setVisible(true);
            }
        });

        JButton btnExitGame = new JButton("Close");
        btnExitGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JButton btnThree = new JButton("Record");
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //WinRecord.setVisible(true);
            }
        });

        JButton btnFour = new JButton("Rules");
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // WinRules.setVisible(true);
            }
        });

        JPanel panelBottom = new JPanel();
        JPanel panelBottom2 = new JPanel();
        panelBottom.setLayout(new GridLayout(1, 2));
        panelBottom2.setLayout(new GridLayout(1, 3));
        panelBottom.add(btnStart);
        panelBottom.add(btnExitGame);
        panelBottom2.add(btnThree);
        panelBottom2.add(btnFour);
        panelBottom2.add(btnAboutUs);

        add(panelBottom, BorderLayout.SOUTH);
        add(panelBottom2, BorderLayout.NORTH);

        setResizable(false);
        setVisible(true);
    }

    void startNewGame(int mode, int fieldSizeX, int fieldSizeY, int winLength) {
        gameMap.startNewGame(mode, fieldSizeX, fieldSizeY, winLength);
    }

}
