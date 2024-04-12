package ca.bcit.comp2522.termproject.flappyplatypus;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;

public class Player extends ImageView implements PlayerBehavior {

    public final int MOVE = 15;
    private static Player player;

    private Player(Image image) {
        super(image);
        setFitWidth(80);
        setFitHeight(80);
        setPreserveRatio(true);
        setX(20);
        setY(450);
    }

    public static Player getInstance() {
        if (player == null) {
            Image platypusImage = new Image("https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp" +
                    ".com/f/0d96a16a-1811-4c6b-aa05-cafa3cfe446b/daidbk1-c256d6f4-ed34-4a00-ac65-f2fc52c83b34.png/v1/fill/w_400,h_362,q_80,strp/platypus_pixel_art_by_draculooloo_daidbk1-fullview.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9MzYyIiwicGF0aCI6IlwvZlwvMGQ5NmExNmEtMTgxMS00YzZiLWFhMDUtY2FmYTNjZmU0NDZiXC9kYWlkYmsxLWMyNTZkNmY0LWVkMzQtNGEwMC1hYzY1LWYyZmM1MmM4M2IzNC5wbmciLCJ3aWR0aCI6Ijw9NDAwIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmltYWdlLm9wZXJhdGlvbnMiXX0.IFcWos_tFJy-CWeAWEYg_YUD6CnAwv6wCg8cWCQVsK0", true);
            player = new Player(platypusImage);
        }
        return player;
    }

    public void processKeyPress(final KeyEvent event) {
        switch (event.getCode()) {
            case UP:
                setY(getY() - MOVE);
                break;
            case DOWN:
                setY(getY() + MOVE);
                break;
            case RIGHT:
                setX(getX() + MOVE);
                break;
            case LEFT:
                setX(getX() - MOVE);
                break;
            default:
                break;
        }
    }
}
