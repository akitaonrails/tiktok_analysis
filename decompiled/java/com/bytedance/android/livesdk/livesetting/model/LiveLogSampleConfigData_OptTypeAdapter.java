package com.bytedance.android.livesdk.livesetting.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveLogSampleConfigData_OptTypeAdapter extends TypeAdapter<LiveLogSampleConfigData> {
    public final Gson LIZ;

    public LiveLogSampleConfigData_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveLogSampleConfigData read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveLogSampleConfigData liveLogSampleConfigData = new LiveLogSampleConfigData();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            if (Intrinsics.LJFF(c09cu.LJJJJ(), "live_integrated_tracker_dolphin_configuration_sample_list")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveLogSampleConfigData.sampleConfigList = C473040Igo.LIZIZ(this.LIZ, c09cu, Double.TYPE);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return liveLogSampleConfigData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveLogSampleConfigData liveLogSampleConfigData) {
        LiveLogSampleConfigData liveLogSampleConfigData2 = liveLogSampleConfigData;
        if (liveLogSampleConfigData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("live_integrated_tracker_dolphin_configuration_sample_list");
        C473040Igo.LJ(this.LIZ, c09dl, liveLogSampleConfigData2.sampleConfigList, Double.TYPE);
        c09dl.LJII();
    }
}
