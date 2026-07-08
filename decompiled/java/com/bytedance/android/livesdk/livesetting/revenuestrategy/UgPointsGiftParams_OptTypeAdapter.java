package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class UgPointsGiftParams_OptTypeAdapter extends TypeAdapter<UgPointsGiftParams> {
    @Override // com.google.gson.TypeAdapter
    public final UgPointsGiftParams read(C09CU c09cu) {
        UgPointsGiftParams ugPointsGiftParams = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            ugPointsGiftParams = new UgPointsGiftParams(5, "aweme://roma_redirect/?roma_group_key=roma_schema_group_incentive_tasks&roma_page_key=roma_schema_page_points_gift_faq");
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "delay_refresh_ug_balance_times")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        ugPointsGiftParams.delay = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "faq_schema")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        ugPointsGiftParams.schema = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return ugPointsGiftParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, UgPointsGiftParams ugPointsGiftParams) {
        UgPointsGiftParams ugPointsGiftParams2 = ugPointsGiftParams;
        if (ugPointsGiftParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("delay_refresh_ug_balance_times");
        c09dl.LJJJJ(Integer.valueOf(ugPointsGiftParams2.delay));
        c09dl.LJIILLIIL("faq_schema");
        c09dl.LJJJJJ(ugPointsGiftParams2.schema);
        c09dl.LJII();
    }
}
