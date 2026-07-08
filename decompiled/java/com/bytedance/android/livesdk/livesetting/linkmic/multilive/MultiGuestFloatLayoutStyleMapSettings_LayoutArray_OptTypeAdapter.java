package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestFloatLayoutStyleMapSettings;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestFloatLayoutStyleMapSettings_LayoutArray_OptTypeAdapter extends TypeAdapter<MultiGuestFloatLayoutStyleMapSettings.LayoutArray> {
    public final Gson LIZ;

    public MultiGuestFloatLayoutStyleMapSettings_LayoutArray_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final MultiGuestFloatLayoutStyleMapSettings.LayoutArray read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MultiGuestFloatLayoutStyleMapSettings.LayoutArray layoutArray = new MultiGuestFloatLayoutStyleMapSettings.LayoutArray();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "16_9")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    layoutArray.ratio16To9 = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "2_1")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    layoutArray.ratio2To1 = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return layoutArray;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MultiGuestFloatLayoutStyleMapSettings.LayoutArray layoutArray) {
        MultiGuestFloatLayoutStyleMapSettings.LayoutArray layoutArray2 = layoutArray;
        if (layoutArray2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("16_9");
        C473040Igo.LIZLLL(this.LIZ, c09dl, layoutArray2.ratio16To9, String.class);
        c09dl.LJIILLIIL("2_1");
        C473040Igo.LIZLLL(this.LIZ, c09dl, layoutArray2.ratio2To1, String.class);
        c09dl.LJII();
    }
}
