package com.bytedance.android.livesdk.livesetting.other;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
public final class GameRewardsEnhanceSetting_OptTypeAdapter extends TypeAdapter<GameRewardsEnhanceSetting> {
    public final Gson LIZ;

    public GameRewardsEnhanceSetting_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final GameRewardsEnhanceSetting read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GameRewardsEnhanceSetting gameRewardsEnhanceSetting = new GameRewardsEnhanceSetting(false, false, "", false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1049124275:
                        if (strLJJJJ.equals("drops_sticker_local_text_closed")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameRewardsEnhanceSetting.setDropsStickerLocalTextClosed(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -677879016:
                        if (strLJJJJ.equals("drops_sticker_id")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameRewardsEnhanceSetting.setDropsStickerId(c09cu.LJJJZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -277952842:
                        if (strLJJJJ.equals("enable_pin_card")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameRewardsEnhanceSetting.setEnablePinCard(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 747217537:
                        if (strLJJJJ.equals("enable_sticker")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameRewardsEnhanceSetting.setEnableSticker(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
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
        return gameRewardsEnhanceSetting;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GameRewardsEnhanceSetting gameRewardsEnhanceSetting) throws IOException {
        GameRewardsEnhanceSetting gameRewardsEnhanceSetting2 = gameRewardsEnhanceSetting;
        if (gameRewardsEnhanceSetting2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_sticker");
        c09dl.LJJJJJL(gameRewardsEnhanceSetting2.getEnableSticker());
        c09dl.LJIILLIIL("enable_pin_card");
        c09dl.LJJJJJL(gameRewardsEnhanceSetting2.getEnablePinCard());
        c09dl.LJIILLIIL("drops_sticker_id");
        c09dl.LJJJJJ(gameRewardsEnhanceSetting2.getDropsStickerId());
        c09dl.LJIILLIIL("drops_sticker_local_text_closed");
        c09dl.LJJJJJL(gameRewardsEnhanceSetting2.getDropsStickerLocalTextClosed());
        c09dl.LJII();
    }
}
