package com.bytedance.android.livesdk.livesetting.effect;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveEffectPerfMetricsParams_OptTypeAdapter extends TypeAdapter<LiveEffectPerfMetricsParams> {
    public final Gson LIZ;

    public LiveEffectPerfMetricsParams_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveEffectPerfMetricsParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveEffectPerfMetricsParams liveEffectPerfMetricsParams = new LiveEffectPerfMetricsParams(false, 1L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "enabled")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveEffectPerfMetricsParams.enabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "fps_collect_interval")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveEffectPerfMetricsParams.collectInterval = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return liveEffectPerfMetricsParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveEffectPerfMetricsParams liveEffectPerfMetricsParams) throws IOException {
        LiveEffectPerfMetricsParams liveEffectPerfMetricsParams2 = liveEffectPerfMetricsParams;
        if (liveEffectPerfMetricsParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enabled");
        c09dl.LJJJJJL(liveEffectPerfMetricsParams2.enabled);
        c09dl.LJIILLIIL("fps_collect_interval");
        c09dl.LJJIZ(liveEffectPerfMetricsParams2.collectInterval);
        c09dl.LJII();
    }
}
