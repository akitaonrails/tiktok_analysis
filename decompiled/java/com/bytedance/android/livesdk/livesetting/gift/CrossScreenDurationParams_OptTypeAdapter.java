package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class CrossScreenDurationParams_OptTypeAdapter extends TypeAdapter<CrossScreenDurationParams> {
    public final Gson LIZ;

    public CrossScreenDurationParams_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final CrossScreenDurationParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        CrossScreenDurationParams crossScreenDurationParams = new CrossScreenDurationParams(0L, null, 3, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "default")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    crossScreenDurationParams.f31default = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "duration_info_list")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    crossScreenDurationParams.durationInfoList = C473040Igo.LIZ(this.LIZ, c09cu, DurationInfo.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return crossScreenDurationParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, CrossScreenDurationParams crossScreenDurationParams) throws IOException {
        CrossScreenDurationParams crossScreenDurationParams2 = crossScreenDurationParams;
        if (crossScreenDurationParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("default");
        c09dl.LJJIZ(crossScreenDurationParams2.f31default);
        c09dl.LJIILLIIL("duration_info_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, crossScreenDurationParams2.durationInfoList, DurationInfo.class);
        c09dl.LJII();
    }
}
