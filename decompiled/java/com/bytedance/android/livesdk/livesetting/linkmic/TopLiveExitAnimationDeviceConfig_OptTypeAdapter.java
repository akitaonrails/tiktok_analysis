package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class TopLiveExitAnimationDeviceConfig_OptTypeAdapter extends TypeAdapter<TopLiveExitAnimationDeviceConfig> {
    public final Gson LIZ;

    public TopLiveExitAnimationDeviceConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final TopLiveExitAnimationDeviceConfig read(C09CU c09cu) {
        TopLiveExitAnimationDeviceConfig topLiveExitAnimationDeviceConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            topLiveExitAnimationDeviceConfig = new TopLiveExitAnimationDeviceConfig(true, 0.0f);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        topLiveExitAnimationDeviceConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "score_low")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        topLiveExitAnimationDeviceConfig.scoreLow = (float) c09cu.LJJIL();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return topLiveExitAnimationDeviceConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TopLiveExitAnimationDeviceConfig topLiveExitAnimationDeviceConfig) throws IOException {
        TopLiveExitAnimationDeviceConfig topLiveExitAnimationDeviceConfig2 = topLiveExitAnimationDeviceConfig;
        if (topLiveExitAnimationDeviceConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(topLiveExitAnimationDeviceConfig2.enable);
        c09dl.LJIILLIIL("score_low");
        c09dl.LJJJJ(Float.valueOf(topLiveExitAnimationDeviceConfig2.scoreLow));
        c09dl.LJII();
    }
}
