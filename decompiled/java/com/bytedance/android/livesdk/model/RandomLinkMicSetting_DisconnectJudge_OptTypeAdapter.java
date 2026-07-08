package com.bytedance.android.livesdk.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.model.RandomLinkMicSetting;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class RandomLinkMicSetting_DisconnectJudge_OptTypeAdapter extends TypeAdapter<RandomLinkMicSetting.DisconnectJudge> {
    @Override // com.google.gson.TypeAdapter
    public final RandomLinkMicSetting.DisconnectJudge read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        RandomLinkMicSetting.DisconnectJudge disconnectJudge = new RandomLinkMicSetting.DisconnectJudge();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "period")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    disconnectJudge.period = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "frequency")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    disconnectJudge.frequency = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return disconnectJudge;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, RandomLinkMicSetting.DisconnectJudge disconnectJudge) {
        RandomLinkMicSetting.DisconnectJudge disconnectJudge2 = disconnectJudge;
        if (disconnectJudge2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("period");
        c09dl.LJJJJ(Integer.valueOf(disconnectJudge2.period));
        c09dl.LJIILLIIL("frequency");
        c09dl.LJJJJ(Integer.valueOf(disconnectJudge2.frequency));
        c09dl.LJII();
    }
}
