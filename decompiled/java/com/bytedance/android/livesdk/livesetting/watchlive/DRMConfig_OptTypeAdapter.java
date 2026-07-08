package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class DRMConfig_OptTypeAdapter extends TypeAdapter<DRMConfig> {
    public final Gson LIZ;

    public DRMConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final DRMConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        DRMConfig dRMConfig = new DRMConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            if (Intrinsics.LJFF(c09cu.LJJJJ(), "enable")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    dRMConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return dRMConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, DRMConfig dRMConfig) throws IOException {
        DRMConfig dRMConfig2 = dRMConfig;
        if (dRMConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(dRMConfig2.enable);
        c09dl.LJII();
    }
}
