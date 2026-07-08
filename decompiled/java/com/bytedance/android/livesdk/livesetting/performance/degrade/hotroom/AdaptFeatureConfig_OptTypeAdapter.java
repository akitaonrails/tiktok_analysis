package com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class AdaptFeatureConfig_OptTypeAdapter extends TypeAdapter<AdaptFeatureConfig> {
    public final Gson LIZ;

    public AdaptFeatureConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final AdaptFeatureConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        AdaptFeatureConfig adaptFeatureConfig = new AdaptFeatureConfig(false, null, 3, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "enable")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    adaptFeatureConfig.setEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "adapt_key_list")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    adaptFeatureConfig.setAdaptKeyList(C473040Igo.LIZ(this.LIZ, c09cu, String.class));
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return adaptFeatureConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, AdaptFeatureConfig adaptFeatureConfig) throws IOException {
        AdaptFeatureConfig adaptFeatureConfig2 = adaptFeatureConfig;
        if (adaptFeatureConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(adaptFeatureConfig2.getEnable());
        c09dl.LJIILLIIL("adapt_key_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, adaptFeatureConfig2.getAdaptKeyList(), String.class);
        c09dl.LJII();
    }
}
