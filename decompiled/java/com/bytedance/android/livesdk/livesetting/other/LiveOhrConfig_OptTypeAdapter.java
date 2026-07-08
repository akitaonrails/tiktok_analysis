package com.bytedance.android.livesdk.livesetting.other;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveOhrConfig_OptTypeAdapter extends TypeAdapter<LiveOhrConfig> {
    public final Gson LIZ;

    public LiveOhrConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveOhrConfig read(C09CU c09cu) {
        LiveOhrConfig liveOhrConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            liveOhrConfig = new LiveOhrConfig(false);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "ohr_predict_enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveOhrConfig.ohrPredictEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return liveOhrConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveOhrConfig liveOhrConfig) throws IOException {
        LiveOhrConfig liveOhrConfig2 = liveOhrConfig;
        if (liveOhrConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("ohr_predict_enable");
        c09dl.LJJJJJL(liveOhrConfig2.ohrPredictEnable);
        c09dl.LJII();
    }
}
