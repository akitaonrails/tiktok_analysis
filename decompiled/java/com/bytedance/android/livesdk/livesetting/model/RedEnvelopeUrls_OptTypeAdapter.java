package com.bytedance.android.livesdk.livesetting.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class RedEnvelopeUrls_OptTypeAdapter extends TypeAdapter<RedEnvelopeUrls> {
    @Override // com.google.gson.TypeAdapter
    public final RedEnvelopeUrls read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        RedEnvelopeUrls redEnvelopeUrls = new RedEnvelopeUrls();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "short_touch")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    redEnvelopeUrls.shortTouchUrl = c09cu.LJJJZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "send")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    redEnvelopeUrls.sendUrl = c09cu.LJJJZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return redEnvelopeUrls;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, RedEnvelopeUrls redEnvelopeUrls) {
        RedEnvelopeUrls redEnvelopeUrls2 = redEnvelopeUrls;
        if (redEnvelopeUrls2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("short_touch");
        c09dl.LJJJJJ(redEnvelopeUrls2.shortTouchUrl);
        c09dl.LJIILLIIL("send");
        c09dl.LJJJJJ(redEnvelopeUrls2.sendUrl);
        c09dl.LJII();
    }
}
