package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class WindowPageConfig_OptTypeAdapter extends TypeAdapter<WindowPageConfig> {
    @Override // com.google.gson.TypeAdapter
    public final WindowPageConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        WindowPageConfig windowPageConfig = new WindowPageConfig(null, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "appearService")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    windowPageConfig.setAppearService(c09cu.LJJJZ());
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "disAppearService")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    windowPageConfig.setDisAppearService(c09cu.LJJJZ());
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return windowPageConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, WindowPageConfig windowPageConfig) {
        WindowPageConfig windowPageConfig2 = windowPageConfig;
        if (windowPageConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("appearService");
        c09dl.LJJJJJ(windowPageConfig2.getAppearService());
        c09dl.LJIILLIIL("disAppearService");
        c09dl.LJJJJJ(windowPageConfig2.getDisAppearService());
        c09dl.LJII();
    }
}
