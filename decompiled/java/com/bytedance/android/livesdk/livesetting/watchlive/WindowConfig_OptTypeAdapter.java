package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class WindowConfig_OptTypeAdapter extends TypeAdapter<WindowConfig> {
    public final Gson LIZ;

    public WindowConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final WindowConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        WindowConfig windowConfig = new WindowConfig(null, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "lynx")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    windowConfig.setLynx(C473040Igo.LIZIZ(this.LIZ, c09cu, WindowPageConfig.class));
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "native")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    windowConfig.setNative(C473040Igo.LIZIZ(this.LIZ, c09cu, WindowPageConfig.class));
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return windowConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, WindowConfig windowConfig) {
        WindowConfig windowConfig2 = windowConfig;
        if (windowConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("lynx");
        C473040Igo.LJ(this.LIZ, c09dl, windowConfig2.getLynx(), WindowPageConfig.class);
        c09dl.LJIILLIIL("native");
        C473040Igo.LJ(this.LIZ, c09dl, windowConfig2.getNative(), WindowPageConfig.class);
        c09dl.LJII();
    }
}
