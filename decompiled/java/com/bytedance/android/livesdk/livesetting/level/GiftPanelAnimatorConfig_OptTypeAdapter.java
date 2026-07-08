package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftPanelAnimatorConfig_OptTypeAdapter extends TypeAdapter<GiftPanelAnimatorConfig> {
    @Override // com.google.gson.TypeAdapter
    public final GiftPanelAnimatorConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GiftPanelAnimatorConfig giftPanelAnimatorConfig = new GiftPanelAnimatorConfig(0, "", "");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -208749548) {
                    if (iHashCode != 98615255) {
                        if (iHashCode == 738950403 && strLJJJJ.equals("channel")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftPanelAnimatorConfig.channel = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("grade")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            giftPanelAnimatorConfig.grade = c09cu.LJJIZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("light_name")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        giftPanelAnimatorConfig.lightName = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return giftPanelAnimatorConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GiftPanelAnimatorConfig giftPanelAnimatorConfig) {
        GiftPanelAnimatorConfig giftPanelAnimatorConfig2 = giftPanelAnimatorConfig;
        if (giftPanelAnimatorConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("grade");
        c09dl.LJJJJ(Integer.valueOf(giftPanelAnimatorConfig2.grade));
        c09dl.LJIILLIIL("light_name");
        c09dl.LJJJJJ(giftPanelAnimatorConfig2.lightName);
        c09dl.LJIILLIIL("channel");
        c09dl.LJJJJJ(giftPanelAnimatorConfig2.channel);
        c09dl.LJII();
    }
}
