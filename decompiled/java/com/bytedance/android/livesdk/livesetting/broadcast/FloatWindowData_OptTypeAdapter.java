package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class FloatWindowData_OptTypeAdapter extends TypeAdapter<FloatWindowData> {
    @Override // com.google.gson.TypeAdapter
    public final FloatWindowData read(C09CU c09cu) {
        FloatWindowData floatWindowData = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            floatWindowData = new FloatWindowData(5);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "delay_time_in_seconds")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        floatWindowData.setDelayTimeInSeconds(c09cu.LJJIZ());
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return floatWindowData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FloatWindowData floatWindowData) {
        FloatWindowData floatWindowData2 = floatWindowData;
        if (floatWindowData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("delay_time_in_seconds");
        c09dl.LJJJJ(Integer.valueOf(floatWindowData2.getDelayTimeInSeconds()));
        c09dl.LJII();
    }
}
