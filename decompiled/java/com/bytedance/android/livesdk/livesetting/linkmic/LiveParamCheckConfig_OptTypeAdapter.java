package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveParamCheckConfig_OptTypeAdapter extends TypeAdapter<LiveParamCheckConfig> {
    public final Gson LIZ;

    public LiveParamCheckConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveParamCheckConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveParamCheckConfig liveParamCheckConfig = new LiveParamCheckConfig(true, new LiveParamCheckDebugConfig(false, null, 3, null));
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "enable")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveParamCheckConfig.setEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "debug_config")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveParamCheckConfig.setDebugConfig((LiveParamCheckDebugConfig) this.LIZ.LJIIJ(LiveParamCheckDebugConfig.class).read(c09cu));
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return liveParamCheckConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveParamCheckConfig liveParamCheckConfig) throws IOException {
        LiveParamCheckConfig liveParamCheckConfig2 = liveParamCheckConfig;
        if (liveParamCheckConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveParamCheckConfig2.getEnable());
        c09dl.LJIILLIIL("debug_config");
        this.LIZ.LJIIJ(LiveParamCheckDebugConfig.class).write(c09dl, liveParamCheckConfig2.getDebugConfig());
        c09dl.LJII();
    }
}
