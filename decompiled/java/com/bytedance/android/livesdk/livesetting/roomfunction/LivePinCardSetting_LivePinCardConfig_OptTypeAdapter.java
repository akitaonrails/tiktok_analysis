package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.roomfunction.LivePinCardSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes15.dex */
public final class LivePinCardSetting_LivePinCardConfig_OptTypeAdapter extends TypeAdapter<LivePinCardSetting.LivePinCardConfig> {
    public final Gson LIZ;

    public LivePinCardSetting_LivePinCardConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LivePinCardSetting.LivePinCardConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LivePinCardSetting.LivePinCardConfig livePinCardConfig = new LivePinCardSetting.LivePinCardConfig(false, 14, 90, 76, 94);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1503762376:
                        if (strLJJJJ.equals("card_height_default")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePinCardConfig.defaultHeight = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -631653812:
                        if (strLJJJJ.equals("enable_qa")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePinCardConfig.enableQA = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 643418843:
                        if (strLJJJJ.equals("card_height_max")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePinCardConfig.maxHeight = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 643419081:
                        if (strLJJJJ.equals("card_height_min")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePinCardConfig.minHeight = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 674389153:
                        if (strLJJJJ.equals("card_radius")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePinCardConfig.radius = c09cu.LJJIZ();
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
        return livePinCardConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LivePinCardSetting.LivePinCardConfig livePinCardConfig) throws IOException {
        LivePinCardSetting.LivePinCardConfig livePinCardConfig2 = livePinCardConfig;
        if (livePinCardConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_qa");
        c09dl.LJJJJJL(livePinCardConfig2.enableQA);
        c09dl.LJIILLIIL("card_radius");
        c09dl.LJJJJ(Integer.valueOf(livePinCardConfig2.radius));
        c09dl.LJIILLIIL("card_height_default");
        c09dl.LJJJJ(Integer.valueOf(livePinCardConfig2.defaultHeight));
        c09dl.LJIILLIIL("card_height_min");
        c09dl.LJJJJ(Integer.valueOf(livePinCardConfig2.minHeight));
        c09dl.LJIILLIIL("card_height_max");
        c09dl.LJJJJ(Integer.valueOf(livePinCardConfig2.maxHeight));
        c09dl.LJII();
    }
}
