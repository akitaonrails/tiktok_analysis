package com.bytedance.android.livesdk.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class ScorePiecewise_OptTypeAdapter extends TypeAdapter<ScorePiecewise> {
    @Override // com.google.gson.TypeAdapter
    public final ScorePiecewise read(C09CU c09cu) {
        ScorePiecewise scorePiecewise = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            scorePiecewise = new ScorePiecewise(0.0f, 0.0f);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "e")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        scorePiecewise.setEdge((float) c09cu.LJJIL());
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "f")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        scorePiecewise.setFactor((float) c09cu.LJJIL());
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return scorePiecewise;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, ScorePiecewise scorePiecewise) {
        ScorePiecewise scorePiecewise2 = scorePiecewise;
        if (scorePiecewise2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("e");
        c09dl.LJJJJ(Float.valueOf(scorePiecewise2.getEdge()));
        c09dl.LJIILLIIL("f");
        c09dl.LJJJJ(Float.valueOf(scorePiecewise2.getFactor()));
        c09dl.LJII();
    }
}
