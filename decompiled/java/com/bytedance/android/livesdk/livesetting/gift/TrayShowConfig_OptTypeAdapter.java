package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class TrayShowConfig_OptTypeAdapter extends TypeAdapter<TrayShowConfig> {
    public final Gson LIZ;

    public TrayShowConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final TrayShowConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TrayShowConfig trayShowConfig = new TrayShowConfig(null, 1, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            if (Intrinsics.LJFF(c09cu.LJJJJ(), "animation_duration")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    trayShowConfig.animationDuration = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return trayShowConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TrayShowConfig trayShowConfig) {
        TrayShowConfig trayShowConfig2 = trayShowConfig;
        if (trayShowConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("animation_duration");
        C473040Igo.LIZLLL(this.LIZ, c09dl, trayShowConfig2.animationDuration, Integer.TYPE);
        c09dl.LJII();
    }
}
