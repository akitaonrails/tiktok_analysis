package com.bytedance.android.livesdk.livesetting.other;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftGuideOpenPredictService_OptTypeAdapter extends TypeAdapter<GiftGuideOpenPredictService> {
    @Override // com.google.gson.TypeAdapter
    public final GiftGuideOpenPredictService read(C09CU c09cu) {
        GiftGuideOpenPredictService giftGuideOpenPredictService = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            giftGuideOpenPredictService = new GiftGuideOpenPredictService("live_gift_guide_client_collect", 0);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "business_name")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        giftGuideOpenPredictService.businessName = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        giftGuideOpenPredictService.enable = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return giftGuideOpenPredictService;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GiftGuideOpenPredictService giftGuideOpenPredictService) {
        GiftGuideOpenPredictService giftGuideOpenPredictService2 = giftGuideOpenPredictService;
        if (giftGuideOpenPredictService2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("business_name");
        c09dl.LJJJJJ(giftGuideOpenPredictService2.businessName);
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJ(Integer.valueOf(giftGuideOpenPredictService2.enable));
        c09dl.LJII();
    }
}
