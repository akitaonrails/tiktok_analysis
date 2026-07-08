package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class GameLivePartnershipDropsConfig_OptTypeAdapter extends TypeAdapter<GameLivePartnershipDropsConfig> {
    public final Gson LIZ;

    public GameLivePartnershipDropsConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final GameLivePartnershipDropsConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GameLivePartnershipDropsConfig gameLivePartnershipDropsConfig = new GameLivePartnershipDropsConfig(false, "", "", 1, true);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1372270885:
                        if (strLJJJJ.equals("enable_permanent_drops_share_item")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLivePartnershipDropsConfig.enablePermanentDropsShareItem = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1363186393:
                        if (strLJJJJ.equals("preview_card")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLivePartnershipDropsConfig.previewCard = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLivePartnershipDropsConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -192824519:
                        if (strLJJJJ.equals("drops_preview_show_cnt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLivePartnershipDropsConfig.dropsPreviewShowCnt = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1814856459:
                        if (strLJJJJ.equals("drops_card")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLivePartnershipDropsConfig.dropsCard = c09cu.LJJJZ();
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
        return gameLivePartnershipDropsConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GameLivePartnershipDropsConfig gameLivePartnershipDropsConfig) throws IOException {
        GameLivePartnershipDropsConfig gameLivePartnershipDropsConfig2 = gameLivePartnershipDropsConfig;
        if (gameLivePartnershipDropsConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(gameLivePartnershipDropsConfig2.enable);
        c09dl.LJIILLIIL("drops_card");
        c09dl.LJJJJJ(gameLivePartnershipDropsConfig2.dropsCard);
        c09dl.LJIILLIIL("preview_card");
        c09dl.LJJJJJ(gameLivePartnershipDropsConfig2.previewCard);
        c09dl.LJIILLIIL("drops_preview_show_cnt");
        c09dl.LJJJJ(Integer.valueOf(gameLivePartnershipDropsConfig2.dropsPreviewShowCnt));
        c09dl.LJIILLIIL("enable_permanent_drops_share_item");
        c09dl.LJJJJJL(gameLivePartnershipDropsConfig2.enablePermanentDropsShareItem);
        c09dl.LJII();
    }
}
