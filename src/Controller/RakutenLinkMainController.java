package Controller;

import View.RakutenLinkMainView;
import javax.swing.*;

/**
 * Created by ChenLetian on 4/1/16.
 * RakutenLink的主Controller类
 */
public class RakutenLinkMainController {

    private RakutenLinkMainView mainView;

    public RakutenLinkMainController() {
        mainView = mainViewStatic;
    }




    // Below is the setup of the application
    private static JFrame frame;
    private static RakutenLinkMainView mainViewStatic;

    public static void main(String[] args) {
        frame = new JFrame("RakutenLinkMainView");
        mainViewStatic = new RakutenLinkMainView();
        frame.setContentPane(mainViewStatic.RakutenLinkMainView);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
