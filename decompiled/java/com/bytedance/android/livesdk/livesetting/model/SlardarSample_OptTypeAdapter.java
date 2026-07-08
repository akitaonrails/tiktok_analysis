package com.bytedance.android.livesdk.livesetting.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class SlardarSample_OptTypeAdapter extends TypeAdapter<SlardarSample> {
    public final Gson LIZ;

    public SlardarSample_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final SlardarSample read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        SlardarSample slardarSample = new SlardarSample();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "live_slardar_is_sample_experiment")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    slardarSample.isExperiment = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "live_slardar_sample_list")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    slardarSample.sampleList = C473040Igo.LIZIZ(this.LIZ, c09cu, Double.TYPE);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return slardarSample;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, SlardarSample slardarSample) throws IOException {
        SlardarSample slardarSample2 = slardarSample;
        if (slardarSample2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("live_slardar_is_sample_experiment");
        c09dl.LJJJJJL(slardarSample2.isExperiment);
        c09dl.LJIILLIIL("live_slardar_sample_list");
        C473040Igo.LJ(this.LIZ, c09dl, slardarSample2.sampleList, Double.TYPE);
        c09dl.LJII();
    }
}
