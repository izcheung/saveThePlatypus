package ca.bcit.comp2522.termproject.flappyplatypus;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Player {
    public static ImageView player() {
        Image platypus = new Image("https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp" +
                ".com/f/0d96a16a-1811-4c6b-aa05-cafa3cfe446b/daidbk1-c256d6f4-ed34-4a00-ac65-f2fc52c83b34.png/v1/fill/w_400,h_362,q_80,strp/platypus_pixel_art_by_draculooloo_daidbk1-fullview.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9MzYyIiwicGF0aCI6IlwvZlwvMGQ5NmExNmEtMTgxMS00YzZiLWFhMDUtY2FmYTNjZmU0NDZiXC9kYWlkYmsxLWMyNTZkNmY0LWVkMzQtNGEwMC1hYzY1LWYyZmM1MmM4M2IzNC5wbmciLCJ3aWR0aCI6Ijw9NDAwIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmltYWdlLm9wZXJhdGlvbnMiXX0.IFcWos_tFJy-CWeAWEYg_YUD6CnAwv6wCg8cWCQVsK0", true);
        Run.player = new ImageView(platypus);
        Run.player.setFitWidth(80);
        Run.player.setFitHeight(80);
        Run.player.setPreserveRatio(true);

        final int platypusStartXCoordinate = 20;
        final int platypusStartYCoordinate = 450;
        Run.player.setX(platypusStartXCoordinate);
        Run.player.setY(platypusStartYCoordinate);
        return Run.player;
    }
}
