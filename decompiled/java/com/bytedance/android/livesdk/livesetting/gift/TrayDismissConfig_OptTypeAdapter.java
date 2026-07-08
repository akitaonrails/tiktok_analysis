package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class TrayDismissConfig_OptTypeAdapter extends TypeAdapter<TrayDismissConfig> {
    public final Gson LIZ;

    public TrayDismissConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final TrayDismissConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TrayDismissConfig trayDismissConfig = new TrayDismissConfig(null, 1, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            if (Intrinsics.LJFF(c09cu.LJJJJ(), "animation_duration")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    trayDismissConfig._animationDuration = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return trayDismissConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TrayDismissConfig trayDismissConfig) {
        TrayDismissConfig trayDismissConfig2 = trayDismissConfig;
        if (trayDismissConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("animation_duration");
        C473040Igo.LIZLLL(this.LIZ, c09dl, trayDismissConfig2._animationDuration, Integer.TYPE);
        c09dl.LJII();
    }
}
