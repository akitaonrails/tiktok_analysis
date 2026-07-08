package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class PerfConfig_OptTypeAdapter extends TypeAdapter<PerfConfig> {
    public final Gson LIZ;

    public PerfConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final PerfConfig read(C09CU c09cu) {
        PerfConfig perfConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            perfConfig = new PerfConfig(false, false);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "enableInflaterOpt")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        perfConfig.enableInflaterOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "enableMemClean")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        perfConfig.enableMemClean = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return perfConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, PerfConfig perfConfig) throws IOException {
        PerfConfig perfConfig2 = perfConfig;
        if (perfConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enableInflaterOpt");
        c09dl.LJJJJJL(perfConfig2.enableInflaterOpt);
        c09dl.LJIILLIIL("enableMemClean");
        c09dl.LJJJJJL(perfConfig2.enableMemClean);
        c09dl.LJII();
    }
}
