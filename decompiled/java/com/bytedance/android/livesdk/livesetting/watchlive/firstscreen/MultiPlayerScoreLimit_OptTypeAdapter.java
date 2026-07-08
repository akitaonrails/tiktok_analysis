package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class MultiPlayerScoreLimit_OptTypeAdapter extends TypeAdapter<MultiPlayerScoreLimit> {
    @Override // com.google.gson.TypeAdapter
    public final MultiPlayerScoreLimit read(C09CU c09cu) {
        MultiPlayerScoreLimit multiPlayerScoreLimit = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            multiPlayerScoreLimit = new MultiPlayerScoreLimit(-1.0f, -1.0f);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "score_high")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        multiPlayerScoreLimit.scoreHigh = (float) c09cu.LJJIL();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "score_low")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        multiPlayerScoreLimit.scoreLow = (float) c09cu.LJJIL();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return multiPlayerScoreLimit;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MultiPlayerScoreLimit multiPlayerScoreLimit) {
        MultiPlayerScoreLimit multiPlayerScoreLimit2 = multiPlayerScoreLimit;
        if (multiPlayerScoreLimit2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("score_high");
        c09dl.LJJJJ(Float.valueOf(multiPlayerScoreLimit2.scoreHigh));
        c09dl.LJIILLIIL("score_low");
        c09dl.LJJJJ(Float.valueOf(multiPlayerScoreLimit2.scoreLow));
        c09dl.LJII();
    }
}
