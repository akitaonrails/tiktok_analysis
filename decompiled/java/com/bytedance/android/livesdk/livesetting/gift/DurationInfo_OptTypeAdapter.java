package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class DurationInfo_OptTypeAdapter extends TypeAdapter<DurationInfo> {
    @Override // com.google.gson.TypeAdapter
    public final DurationInfo read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        DurationInfo durationInfo = new DurationInfo(0L, 0L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "gift_id")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    durationInfo.giftId = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "duration")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    durationInfo.duration = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return durationInfo;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, DurationInfo durationInfo) throws IOException {
        DurationInfo durationInfo2 = durationInfo;
        if (durationInfo2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("gift_id");
        c09dl.LJJIZ(durationInfo2.giftId);
        c09dl.LJIILLIIL("duration");
        c09dl.LJJIZ(durationInfo2.duration);
        c09dl.LJII();
    }
}
