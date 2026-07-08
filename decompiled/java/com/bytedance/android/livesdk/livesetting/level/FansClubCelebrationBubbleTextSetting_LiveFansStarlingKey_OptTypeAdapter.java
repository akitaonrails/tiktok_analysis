package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.level.FansClubCelebrationBubbleTextSetting;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClubCelebrationBubbleTextSetting_LiveFansStarlingKey_OptTypeAdapter extends TypeAdapter<FansClubCelebrationBubbleTextSetting.LiveFansStarlingKey> {
    @Override // com.google.gson.TypeAdapter
    public final FansClubCelebrationBubbleTextSetting.LiveFansStarlingKey read(C09CU c09cu) {
        FansClubCelebrationBubbleTextSetting.LiveFansStarlingKey liveFansStarlingKey = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            liveFansStarlingKey = new FansClubCelebrationBubbleTextSetting.LiveFansStarlingKey("", "");
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "pattern")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveFansStarlingKey.pattern = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "starling_key")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveFansStarlingKey.key = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return liveFansStarlingKey;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FansClubCelebrationBubbleTextSetting.LiveFansStarlingKey liveFansStarlingKey) {
        FansClubCelebrationBubbleTextSetting.LiveFansStarlingKey liveFansStarlingKey2 = liveFansStarlingKey;
        if (liveFansStarlingKey2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("pattern");
        c09dl.LJJJJJ(liveFansStarlingKey2.pattern);
        c09dl.LJIILLIIL("starling_key");
        c09dl.LJJJJJ(liveFansStarlingKey2.key);
        c09dl.LJII();
    }
}
