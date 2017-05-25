package com.protonail;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(Main.class);
    }

    public void start(Stage primaryStage) throws Exception {
        MenuItem menuItem1 = new MenuItem("1");
        menuItem1.setGraphic(new ImageView("/com/protonail/icons/1.png"));

        MenuItem menuItem2 = new MenuItem("2");
        menuItem2.setGraphic(new ImageView("/com/protonail/icons/2.png"));

        Menu iconsMenu = new Menu("Icons");
        iconsMenu.getItems().addAll(menuItem1, menuItem2);

        MenuBar menuBar = new MenuBar();
        menuBar.setUseSystemMenuBar(true);
        menuBar.getMenus().add(iconsMenu);

        Scene scene = new Scene(menuBar);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
