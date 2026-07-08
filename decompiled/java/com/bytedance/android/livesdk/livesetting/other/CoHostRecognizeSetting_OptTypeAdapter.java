package com.bytedance.android.livesdk.livesetting.other;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class CoHostRecognizeSetting_OptTypeAdapter extends TypeAdapter<CoHostRecognizeSetting> {
    public final Gson LIZ;

    public CoHostRecognizeSetting_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final CoHostRecognizeSetting read(C09CU c09cu) {
        CoHostRecognizeSetting coHostRecognizeSetting = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            coHostRecognizeSetting = new CoHostRecognizeSetting(false, true);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "isLog")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        coHostRecognizeSetting.isLog = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "isNewCheck")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        coHostRecognizeSetting.isNewCheck = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return coHostRecognizeSetting;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, CoHostRecognizeSetting coHostRecognizeSetting) throws IOException {
        CoHostRecognizeSetting coHostRecognizeSetting2 = coHostRecognizeSetting;
        if (coHostRecognizeSetting2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("isLog");
        c09dl.LJJJJJL(coHostRecognizeSetting2.isLog);
        c09dl.LJIILLIIL("isNewCheck");
        c09dl.LJJJJJL(coHostRecognizeSetting2.isNewCheck);
        c09dl.LJII();
    }
}
