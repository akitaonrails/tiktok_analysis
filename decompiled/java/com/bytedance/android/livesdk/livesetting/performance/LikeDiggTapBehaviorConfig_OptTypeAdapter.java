package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LikeDiggTapBehaviorConfig_OptTypeAdapter extends TypeAdapter<LikeDiggTapBehaviorConfig> {
    @Override // com.google.gson.TypeAdapter
    public final LikeDiggTapBehaviorConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LikeDiggTapBehaviorConfig likeDiggTapBehaviorConfig = new LikeDiggTapBehaviorConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "digg_tap_alpha_start_alpha")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    likeDiggTapBehaviorConfig.diggTapStartAlpha = (float) c09cu.LJJIL();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "digg_tap_alpha_end_alpha")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    likeDiggTapBehaviorConfig.diggTapEndAlpha = (float) c09cu.LJJIL();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return likeDiggTapBehaviorConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LikeDiggTapBehaviorConfig likeDiggTapBehaviorConfig) {
        LikeDiggTapBehaviorConfig likeDiggTapBehaviorConfig2 = likeDiggTapBehaviorConfig;
        if (likeDiggTapBehaviorConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("digg_tap_alpha_start_alpha");
        c09dl.LJJJJ(Float.valueOf(likeDiggTapBehaviorConfig2.diggTapStartAlpha));
        c09dl.LJIILLIIL("digg_tap_alpha_end_alpha");
        c09dl.LJJJJ(Float.valueOf(likeDiggTapBehaviorConfig2.diggTapEndAlpha));
        c09dl.LJII();
    }
}
