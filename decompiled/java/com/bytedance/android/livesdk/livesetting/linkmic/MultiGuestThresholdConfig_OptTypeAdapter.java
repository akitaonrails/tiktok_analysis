package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C1697810uHb;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class MultiGuestThresholdConfig_OptTypeAdapter extends TypeAdapter<MultiGuestThresholdConfig> {
    public final Gson LIZ;

    public MultiGuestThresholdConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final MultiGuestThresholdConfig read(C09CU c09cu) {
        MultiGuestThresholdConfig multiGuestThresholdConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            multiGuestThresholdConfig = new MultiGuestThresholdConfig(C1697810uHb.LJIIJJI(1, 5, 10, 30, 50), 39999);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "options")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        multiGuestThresholdConfig.options = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "max_coins")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        multiGuestThresholdConfig.maxCoins = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return multiGuestThresholdConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MultiGuestThresholdConfig multiGuestThresholdConfig) {
        MultiGuestThresholdConfig multiGuestThresholdConfig2 = multiGuestThresholdConfig;
        if (multiGuestThresholdConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("options");
        C473040Igo.LIZLLL(this.LIZ, c09dl, multiGuestThresholdConfig2.options, Integer.TYPE);
        c09dl.LJIILLIIL("max_coins");
        c09dl.LJJJJ(Integer.valueOf(multiGuestThresholdConfig2.maxCoins));
        c09dl.LJII();
    }
}
