package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class TNCRequestConf_OptTypeAdapter extends TypeAdapter<TNCRequestConf> {
    public final Gson LIZ;

    public TNCRequestConf_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final TNCRequestConf read(C09CU c09cu) {
        TNCRequestConf tNCRequestConf = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            tNCRequestConf = new TNCRequestConf(false, 200);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "enabled")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        tNCRequestConf.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "timeout_ms")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        tNCRequestConf.timeoutMs = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return tNCRequestConf;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TNCRequestConf tNCRequestConf) throws IOException {
        TNCRequestConf tNCRequestConf2 = tNCRequestConf;
        if (tNCRequestConf2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enabled");
        c09dl.LJJJJJL(tNCRequestConf2.enable);
        c09dl.LJIILLIIL("timeout_ms");
        c09dl.LJJJJ(Integer.valueOf(tNCRequestConf2.timeoutMs));
        c09dl.LJII();
    }
}
