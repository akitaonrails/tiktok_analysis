package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveGiftComboNumberOptConfig_OptTypeAdapter extends TypeAdapter<LiveGiftComboNumberOptConfig> {
    @Override // com.google.gson.TypeAdapter
    public final LiveGiftComboNumberOptConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveGiftComboNumberOptConfig liveGiftComboNumberOptConfig = new LiveGiftComboNumberOptConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -148447941) {
                    if (iHashCode != 100893) {
                        if (iHashCode == 732616276 && strLJJJJ.equals("small_gift_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftComboNumberOptConfig.smallGiftThreshold = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("exp")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            liveGiftComboNumberOptConfig.exp = c09cu.LJJIZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("big_gift_threshold")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveGiftComboNumberOptConfig.bigGiftThreshold = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveGiftComboNumberOptConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveGiftComboNumberOptConfig liveGiftComboNumberOptConfig) {
        LiveGiftComboNumberOptConfig liveGiftComboNumberOptConfig2 = liveGiftComboNumberOptConfig;
        if (liveGiftComboNumberOptConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("exp");
        c09dl.LJJJJ(Integer.valueOf(liveGiftComboNumberOptConfig2.exp));
        c09dl.LJIILLIIL("small_gift_threshold");
        c09dl.LJJJJ(Integer.valueOf(liveGiftComboNumberOptConfig2.smallGiftThreshold));
        c09dl.LJIILLIIL("big_gift_threshold");
        c09dl.LJJJJ(Integer.valueOf(liveGiftComboNumberOptConfig2.bigGiftThreshold));
        c09dl.LJII();
    }
}
