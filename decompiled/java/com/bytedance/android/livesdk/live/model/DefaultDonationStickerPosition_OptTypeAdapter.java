package com.bytedance.android.livesdk.live.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class DefaultDonationStickerPosition_OptTypeAdapter extends TypeAdapter<DefaultDonationStickerPosition> {
    @Override // com.google.gson.TypeAdapter
    public final DefaultDonationStickerPosition read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        DefaultDonationStickerPosition defaultDonationStickerPosition = new DefaultDonationStickerPosition();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "x_ratio")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    defaultDonationStickerPosition.setXRatio((float) c09cu.LJJIL());
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "y_ratio")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    defaultDonationStickerPosition.setYRatio((float) c09cu.LJJIL());
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return defaultDonationStickerPosition;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, DefaultDonationStickerPosition defaultDonationStickerPosition) {
        DefaultDonationStickerPosition defaultDonationStickerPosition2 = defaultDonationStickerPosition;
        if (defaultDonationStickerPosition2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("x_ratio");
        c09dl.LJJJJ(Float.valueOf(defaultDonationStickerPosition2.getXRatio()));
        c09dl.LJIILLIIL("y_ratio");
        c09dl.LJJJJ(Float.valueOf(defaultDonationStickerPosition2.getYRatio()));
        c09dl.LJII();
    }
}
