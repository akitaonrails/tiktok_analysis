package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftGuideFansClubFallbackParams_OptTypeAdapter extends TypeAdapter<GiftGuideFansClubFallbackParams> {
    @Override // com.google.gson.TypeAdapter
    public final GiftGuideFansClubFallbackParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GiftGuideFansClubFallbackParams giftGuideFansClubFallbackParams = new GiftGuideFansClubFallbackParams("gift_guide_popup", 5655L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "guide_type")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    giftGuideFansClubFallbackParams.guideType = c09cu.LJJJZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "fallback_gift_id")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    giftGuideFansClubFallbackParams.fallbackGiftId = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return giftGuideFansClubFallbackParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GiftGuideFansClubFallbackParams giftGuideFansClubFallbackParams) throws IOException {
        GiftGuideFansClubFallbackParams giftGuideFansClubFallbackParams2 = giftGuideFansClubFallbackParams;
        if (giftGuideFansClubFallbackParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("guide_type");
        c09dl.LJJJJJ(giftGuideFansClubFallbackParams2.guideType);
        c09dl.LJIILLIIL("fallback_gift_id");
        c09dl.LJJIZ(giftGuideFansClubFallbackParams2.fallbackGiftId);
        c09dl.LJII();
    }
}
