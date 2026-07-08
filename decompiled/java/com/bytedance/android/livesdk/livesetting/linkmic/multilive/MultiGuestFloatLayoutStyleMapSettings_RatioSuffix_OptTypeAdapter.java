package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestFloatLayoutStyleMapSettings;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestFloatLayoutStyleMapSettings_RatioSuffix_OptTypeAdapter extends TypeAdapter<MultiGuestFloatLayoutStyleMapSettings.RatioSuffix> {
    @Override // com.google.gson.TypeAdapter
    public final MultiGuestFloatLayoutStyleMapSettings.RatioSuffix read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MultiGuestFloatLayoutStyleMapSettings.RatioSuffix ratioSuffix = new MultiGuestFloatLayoutStyleMapSettings.RatioSuffix();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            if (Intrinsics.LJFF(c09cu.LJJJJ(), "2_1")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    ratioSuffix.ratio2To1 = c09cu.LJJJZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return ratioSuffix;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MultiGuestFloatLayoutStyleMapSettings.RatioSuffix ratioSuffix) {
        MultiGuestFloatLayoutStyleMapSettings.RatioSuffix ratioSuffix2 = ratioSuffix;
        if (ratioSuffix2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("2_1");
        c09dl.LJJJJJ(ratioSuffix2.ratio2To1);
        c09dl.LJII();
    }
}
