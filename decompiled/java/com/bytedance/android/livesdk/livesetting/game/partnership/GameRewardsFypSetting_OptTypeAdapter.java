package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes15.dex */
public final class GameRewardsFypSetting_OptTypeAdapter extends TypeAdapter<GameRewardsFypSetting> {
    public final Gson LIZ;

    public GameRewardsFypSetting_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final GameRewardsFypSetting read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GameRewardsFypSetting gameRewardsFypSetting = new GameRewardsFypSetting(false, 10000L, 3000L, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1646898119:
                        if (strLJJJJ.equals("delay_show")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameRewardsFypSetting.delayTime = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -277952842:
                        if (strLJJJJ.equals("enable_pin_card")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameRewardsFypSetting.enableCard = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -251809642:
                        if (strLJJJJ.equals("show_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameRewardsFypSetting.duration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1169597462:
                        if (strLJJJJ.equals("disable_game_moment")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameRewardsFypSetting.disableGameMoment = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return gameRewardsFypSetting;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GameRewardsFypSetting gameRewardsFypSetting) throws IOException {
        GameRewardsFypSetting gameRewardsFypSetting2 = gameRewardsFypSetting;
        if (gameRewardsFypSetting2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_pin_card");
        c09dl.LJJJJJL(gameRewardsFypSetting2.enableCard);
        c09dl.LJIILLIIL("show_duration");
        c09dl.LJJIZ(gameRewardsFypSetting2.duration);
        c09dl.LJIILLIIL("delay_show");
        c09dl.LJJIZ(gameRewardsFypSetting2.delayTime);
        c09dl.LJIILLIIL("disable_game_moment");
        c09dl.LJJJJJL(gameRewardsFypSetting2.disableGameMoment);
        c09dl.LJII();
    }
}
