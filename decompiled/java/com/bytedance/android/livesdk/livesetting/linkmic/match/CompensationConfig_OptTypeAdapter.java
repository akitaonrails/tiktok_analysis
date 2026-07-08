package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class CompensationConfig_OptTypeAdapter extends TypeAdapter<CompensationConfig> {
    public final Gson LIZ;

    public CompensationConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final CompensationConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        CompensationConfig compensationConfig = new CompensationConfig(true, 5L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "enable")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    compensationConfig.compensateEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "time_interval")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    compensationConfig.compensateTimeSec = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return compensationConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, CompensationConfig compensationConfig) throws IOException {
        CompensationConfig compensationConfig2 = compensationConfig;
        if (compensationConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(compensationConfig2.compensateEnable);
        c09dl.LJIILLIIL("time_interval");
        c09dl.LJJIZ(compensationConfig2.compensateTimeSec);
        c09dl.LJII();
    }
}
