package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.level.FansClubUpgradeMemberLevelSetting;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClubUpgradeMemberLevelSetting_LiveFansBubbleStarlingKey_OptTypeAdapter extends TypeAdapter<FansClubUpgradeMemberLevelSetting.LiveFansBubbleStarlingKey> {
    @Override // com.google.gson.TypeAdapter
    public final FansClubUpgradeMemberLevelSetting.LiveFansBubbleStarlingKey read(C09CU c09cu) {
        FansClubUpgradeMemberLevelSetting.LiveFansBubbleStarlingKey liveFansBubbleStarlingKey = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            liveFansBubbleStarlingKey = new FansClubUpgradeMemberLevelSetting.LiveFansBubbleStarlingKey("", "");
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "pattern")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveFansBubbleStarlingKey.pattern = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "starling_key")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveFansBubbleStarlingKey.key = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return liveFansBubbleStarlingKey;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FansClubUpgradeMemberLevelSetting.LiveFansBubbleStarlingKey liveFansBubbleStarlingKey) {
        FansClubUpgradeMemberLevelSetting.LiveFansBubbleStarlingKey liveFansBubbleStarlingKey2 = liveFansBubbleStarlingKey;
        if (liveFansBubbleStarlingKey2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("pattern");
        c09dl.LJJJJJ(liveFansBubbleStarlingKey2.pattern);
        c09dl.LJIILLIIL("starling_key");
        c09dl.LJJJJJ(liveFansBubbleStarlingKey2.key);
        c09dl.LJII();
    }
}
