package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveMatchCountDownOptConfig_OptTypeAdapter extends TypeAdapter<LiveMatchCountDownOptConfig> {
    public final Gson LIZ;

    public LiveMatchCountDownOptConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveMatchCountDownOptConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveMatchCountDownOptConfig liveMatchCountDownOptConfig = new LiveMatchCountDownOptConfig(false, 1000L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "enable_optimize")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveMatchCountDownOptConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "refresh_interval_ms")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveMatchCountDownOptConfig.refreshIntervalMs = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return liveMatchCountDownOptConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveMatchCountDownOptConfig liveMatchCountDownOptConfig) throws IOException {
        LiveMatchCountDownOptConfig liveMatchCountDownOptConfig2 = liveMatchCountDownOptConfig;
        if (liveMatchCountDownOptConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_optimize");
        c09dl.LJJJJJL(liveMatchCountDownOptConfig2.enable);
        c09dl.LJIILLIIL("refresh_interval_ms");
        c09dl.LJJIZ(liveMatchCountDownOptConfig2.refreshIntervalMs);
        c09dl.LJII();
    }
}
