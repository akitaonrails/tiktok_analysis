package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class SkinGiftConfig_OptTypeAdapter extends TypeAdapter<SkinGiftConfig> {
    @Override // com.google.gson.TypeAdapter
    public final SkinGiftConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        SkinGiftConfig skinGiftConfig = new SkinGiftConfig(0L, "", 0L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1468661111) {
                    if (iHashCode != 116076) {
                        if (iHashCode == 27409034 && strLJJJJ.equals("gift_id")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                skinGiftConfig.giftID = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("uri")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            skinGiftConfig.uri = c09cu.LJJJZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("effect_id")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        skinGiftConfig.effectID = c09cu.LJJJ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return skinGiftConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, SkinGiftConfig skinGiftConfig) throws IOException {
        SkinGiftConfig skinGiftConfig2 = skinGiftConfig;
        if (skinGiftConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("gift_id");
        c09dl.LJJIZ(skinGiftConfig2.giftID);
        c09dl.LJIILLIIL("uri");
        c09dl.LJJJJJ(skinGiftConfig2.uri);
        c09dl.LJIILLIIL("effect_id");
        c09dl.LJJIZ(skinGiftConfig2.effectID);
        c09dl.LJII();
    }
}
