package com.bytedance.android.livesdk.livesetting.other;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class SmoothClearScreenConfig_OptTypeAdapter extends TypeAdapter<SmoothClearScreenConfig> {
    public final Gson LIZ;

    public SmoothClearScreenConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final SmoothClearScreenConfig read(C09CU c09cu) {
        SmoothClearScreenConfig smoothClearScreenConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            smoothClearScreenConfig = new SmoothClearScreenConfig(false, false);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "smooth_gesture")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        smoothClearScreenConfig.smoothGesture = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "optimize_animation")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        smoothClearScreenConfig.optimizeAnimation = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return smoothClearScreenConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, SmoothClearScreenConfig smoothClearScreenConfig) throws IOException {
        SmoothClearScreenConfig smoothClearScreenConfig2 = smoothClearScreenConfig;
        if (smoothClearScreenConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("smooth_gesture");
        c09dl.LJJJJJL(smoothClearScreenConfig2.smoothGesture);
        c09dl.LJIILLIIL("optimize_animation");
        c09dl.LJJJJJL(smoothClearScreenConfig2.optimizeAnimation);
        c09dl.LJII();
    }
}
