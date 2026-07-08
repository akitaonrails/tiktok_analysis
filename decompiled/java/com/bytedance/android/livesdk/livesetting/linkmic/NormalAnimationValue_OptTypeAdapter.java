package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class NormalAnimationValue_OptTypeAdapter extends TypeAdapter<NormalAnimationValue> {
    @Override // com.google.gson.TypeAdapter
    public final NormalAnimationValue read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        NormalAnimationValue normalAnimationValue = new NormalAnimationValue(null, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "disappear_duration")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    normalAnimationValue.disappearDuration = Integer.valueOf(c09cu.LJJIZ());
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "appear_duration")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    normalAnimationValue.appearDuration = Integer.valueOf(c09cu.LJJIZ());
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return normalAnimationValue;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, NormalAnimationValue normalAnimationValue) {
        NormalAnimationValue normalAnimationValue2 = normalAnimationValue;
        if (normalAnimationValue2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("disappear_duration");
        c09dl.LJJJJ(normalAnimationValue2.disappearDuration);
        c09dl.LJIILLIIL("appear_duration");
        c09dl.LJJJJ(normalAnimationValue2.appearDuration);
        c09dl.LJII();
    }
}
