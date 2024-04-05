package ca.bcit.comp2522.termproject.JavaFXGame;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Player {

    protected ImageView imageView;
    private int x;
    private int y;
    protected static Player player;

    private Player(ImageView imageView, int x, int y) {
        this.imageView = imageView;
        this.x = x;
        this.y = y;
    }

    public static Player getInstance() {
        if (player == null) {
            final int x = 20;
            final int y = 450;
            Image platypusImage = new Image("https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp" +
                    ".com/f/0d96a16a-1811-4c6b-aa05-cafa3cfe446b/daidbk1-c256d6f4-ed34-4a00-ac65-f2fc52c83b34.png/v1/fill/w_400,h_362,q_80,strp/platypus_pixel_art_by_draculooloo_daidbk1-fullview.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9MzYyIiwicGF0aCI6IlwvZlwvMGQ5NmExNmEtMTgxMS00YzZiLWFhMDUtY2FmYTNjZmU0NDZiXC9kYWlkYmsxLWMyNTZkNmY0LWVkMzQtNGEwMC1hYzY1LWYyZmM1MmM4M2IzNC5wbmciLCJ3aWR0aCI6Ijw9NDAwIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmltYWdlLm9wZXJhdGlvbnMiXX0.IFcWos_tFJy-CWeAWEYg_YUD6CnAwv6wCg8cWCQVsK0", true);
            ImageView platypusImageView = new ImageView(platypusImage);
            platypusImageView.setFitWidth(80);
            platypusImageView.setFitHeight(80);
            platypusImageView.setPreserveRatio(true);
            platypusImageView.setX(x);
            platypusImageView.setY(y);
            player = new Player(platypusImageView, x, y);
        }
        return player;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
