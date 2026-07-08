package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class LiveCatchBeansLoadMetricsConfig_OptTypeAdapter extends TypeAdapter<LiveCatchBeansLoadMetricsConfig> {
    public final Gson LIZ;

    public LiveCatchBeansLoadMetricsConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveCatchBeansLoadMetricsConfig read(C09CU c09cu) {
        LiveCatchBeansLoadMetricsConfig liveCatchBeansLoadMetricsConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            liveCatchBeansLoadMetricsConfig = new LiveCatchBeansLoadMetricsConfig(false, 0.8f);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "enabled")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveCatchBeansLoadMetricsConfig.enabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "timeout_trigger_threshold")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveCatchBeansLoadMetricsConfig.timeoutTriggerThreshold = (float) c09cu.LJJIL();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return liveCatchBeansLoadMetricsConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveCatchBeansLoadMetricsConfig liveCatchBeansLoadMetricsConfig) throws IOException {
        LiveCatchBeansLoadMetricsConfig liveCatchBeansLoadMetricsConfig2 = liveCatchBeansLoadMetricsConfig;
        if (liveCatchBeansLoadMetricsConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enabled");
        c09dl.LJJJJJL(liveCatchBeansLoadMetricsConfig2.enabled);
        c09dl.LJIILLIIL("timeout_trigger_threshold");
        c09dl.LJJJJ(Float.valueOf(liveCatchBeansLoadMetricsConfig2.timeoutTriggerThreshold));
        c09dl.LJII();
    }
}
