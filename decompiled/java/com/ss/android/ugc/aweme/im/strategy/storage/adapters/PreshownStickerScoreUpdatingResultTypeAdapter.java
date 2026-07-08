package com.ss.android.ugc.aweme.im.strategy.storage.adapters;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerScoreUpdatingResult;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class PreshownStickerScoreUpdatingResultTypeAdapter extends TypeAdapter<PreshownStickerScoreUpdatingResult> {
    @Override // com.google.gson.TypeAdapter
    public final PreshownStickerScoreUpdatingResult read(C09CU c09cu) throws IOException {
        c09cu.LIZIZ();
        String strLJJJZ = null;
        int iLJJIZ = 0;
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "config_name")) {
                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                    c09cu.LJJJJJL();
                } else {
                    strLJJJZ = c09cu.LJJJZ();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "score_delta")) {
                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                    c09cu.LJJJJJL();
                } else {
                    iLJJIZ = c09cu.LJJIZ();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        PreshownStickerScoreUpdatingResult preshownStickerScoreUpdatingResult = new PreshownStickerScoreUpdatingResult(iLJJIZ);
        preshownStickerScoreUpdatingResult.setConfigName(strLJJJZ);
        return preshownStickerScoreUpdatingResult;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, PreshownStickerScoreUpdatingResult preshownStickerScoreUpdatingResult) {
        PreshownStickerScoreUpdatingResult preshownStickerScoreUpdatingResult2 = preshownStickerScoreUpdatingResult;
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("config_name");
        c09dl.LJJJJJ(preshownStickerScoreUpdatingResult2.getConfigName());
        c09dl.LJIILLIIL("score_delta");
        c09dl.LJJJJ(Integer.valueOf(preshownStickerScoreUpdatingResult2.getScoreDelta()));
        c09dl.LJII();
    }
}
