package com.bytedance.android.livesdk.livesetting.other;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class GamePartnershipPerformanceSample_OptTypeAdapter extends TypeAdapter<GamePartnershipPerformanceSample> {
    public final Gson LIZ;

    public GamePartnershipPerformanceSample_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final GamePartnershipPerformanceSample read(C09CU c09cu) {
        GamePartnershipPerformanceSample gamePartnershipPerformanceSample = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            gamePartnershipPerformanceSample = new GamePartnershipPerformanceSample(false, 3);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "open")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        gamePartnershipPerformanceSample.open = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "interval")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        gamePartnershipPerformanceSample.interval = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return gamePartnershipPerformanceSample;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GamePartnershipPerformanceSample gamePartnershipPerformanceSample) throws IOException {
        GamePartnershipPerformanceSample gamePartnershipPerformanceSample2 = gamePartnershipPerformanceSample;
        if (gamePartnershipPerformanceSample2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("open");
        c09dl.LJJJJJL(gamePartnershipPerformanceSample2.open);
        c09dl.LJIILLIIL("interval");
        c09dl.LJJJJ(Integer.valueOf(gamePartnershipPerformanceSample2.interval));
        c09dl.LJII();
    }
}
