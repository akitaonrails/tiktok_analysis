package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.performance.LiveLastNPerfFeatureSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveLastNPerfFeatureSetting_LastNPerfFeatureConfig_OptTypeAdapter extends TypeAdapter<LiveLastNPerfFeatureSetting.LastNPerfFeatureConfig> {
    public final Gson LIZ;

    public LiveLastNPerfFeatureSetting_LastNPerfFeatureConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveLastNPerfFeatureSetting.LastNPerfFeatureConfig read(C09CU c09cu) {
        LiveLastNPerfFeatureSetting.LastNPerfFeatureConfig lastNPerfFeatureConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            lastNPerfFeatureConfig = new LiveLastNPerfFeatureSetting.LastNPerfFeatureConfig(true, 5);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        lastNPerfFeatureConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "last_n_record_count")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        lastNPerfFeatureConfig.lastN = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return lastNPerfFeatureConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveLastNPerfFeatureSetting.LastNPerfFeatureConfig lastNPerfFeatureConfig) throws IOException {
        LiveLastNPerfFeatureSetting.LastNPerfFeatureConfig lastNPerfFeatureConfig2 = lastNPerfFeatureConfig;
        if (lastNPerfFeatureConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(lastNPerfFeatureConfig2.enable);
        c09dl.LJIILLIIL("last_n_record_count");
        c09dl.LJJJJ(Integer.valueOf(lastNPerfFeatureConfig2.lastN));
        c09dl.LJII();
    }
}
