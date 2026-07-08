package com.bytedance.android.livesdk.livesetting.game;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class DefaultHighLightCutConfig_OptTypeAdapter extends TypeAdapter<DefaultHighLightCutConfig> {
    @Override // com.google.gson.TypeAdapter
    public final DefaultHighLightCutConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        DefaultHighLightCutConfig defaultHighLightCutConfig = new DefaultHighLightCutConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            if (Intrinsics.LJFF(c09cu.LJJJJ(), "min_cut_interval")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    defaultHighLightCutConfig.setMinCutInterval(c09cu.LJJIZ());
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return defaultHighLightCutConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, DefaultHighLightCutConfig defaultHighLightCutConfig) {
        DefaultHighLightCutConfig defaultHighLightCutConfig2 = defaultHighLightCutConfig;
        if (defaultHighLightCutConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("min_cut_interval");
        c09dl.LJJJJ(Integer.valueOf(defaultHighLightCutConfig2.getMinCutInterval()));
        c09dl.LJII();
    }
}
