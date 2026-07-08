package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class NegativeTestSettings_OptTypeAdapter extends TypeAdapter<NegativeTestSettings> {
    @Override // com.google.gson.TypeAdapter
    public final NegativeTestSettings read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        NegativeTestSettings negativeTestSettings = new NegativeTestSettings(0L, 0L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "cpu_load_rate")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    negativeTestSettings.cpuLoadRate = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "cpu_cycle")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    negativeTestSettings.cpuCycle = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return negativeTestSettings;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, NegativeTestSettings negativeTestSettings) throws IOException {
        NegativeTestSettings negativeTestSettings2 = negativeTestSettings;
        if (negativeTestSettings2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("cpu_load_rate");
        c09dl.LJJIZ(negativeTestSettings2.cpuLoadRate);
        c09dl.LJIILLIIL("cpu_cycle");
        c09dl.LJJIZ(negativeTestSettings2.cpuCycle);
        c09dl.LJII();
    }
}
