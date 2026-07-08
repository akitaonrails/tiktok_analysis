package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class PendantWidgetResParams_OptTypeAdapter extends TypeAdapter<PendantWidgetResParams> {
    @Override // com.google.gson.TypeAdapter
    public final PendantWidgetResParams read(C09CU c09cu) {
        PendantWidgetResParams pendantWidgetResParams = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            pendantWidgetResParams = new PendantWidgetResParams("", "");
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "channel_name")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        pendantWidgetResParams.channel = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "file_name")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        pendantWidgetResParams.file = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return pendantWidgetResParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, PendantWidgetResParams pendantWidgetResParams) {
        PendantWidgetResParams pendantWidgetResParams2 = pendantWidgetResParams;
        if (pendantWidgetResParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("channel_name");
        c09dl.LJJJJJ(pendantWidgetResParams2.channel);
        c09dl.LJIILLIIL("file_name");
        c09dl.LJJJJJ(pendantWidgetResParams2.file);
        c09dl.LJII();
    }
}
