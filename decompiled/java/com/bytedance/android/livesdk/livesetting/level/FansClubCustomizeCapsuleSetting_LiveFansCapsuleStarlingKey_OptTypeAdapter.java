package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.level.FansClubCustomizeCapsuleSetting;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClubCustomizeCapsuleSetting_LiveFansCapsuleStarlingKey_OptTypeAdapter extends TypeAdapter<FansClubCustomizeCapsuleSetting.LiveFansCapsuleStarlingKey> {
    @Override // com.google.gson.TypeAdapter
    public final FansClubCustomizeCapsuleSetting.LiveFansCapsuleStarlingKey read(C09CU c09cu) {
        FansClubCustomizeCapsuleSetting.LiveFansCapsuleStarlingKey liveFansCapsuleStarlingKey = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            liveFansCapsuleStarlingKey = new FansClubCustomizeCapsuleSetting.LiveFansCapsuleStarlingKey("", "");
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "pattern")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveFansCapsuleStarlingKey.pattern = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "starling_key")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveFansCapsuleStarlingKey.key = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return liveFansCapsuleStarlingKey;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FansClubCustomizeCapsuleSetting.LiveFansCapsuleStarlingKey liveFansCapsuleStarlingKey) {
        FansClubCustomizeCapsuleSetting.LiveFansCapsuleStarlingKey liveFansCapsuleStarlingKey2 = liveFansCapsuleStarlingKey;
        if (liveFansCapsuleStarlingKey2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("pattern");
        c09dl.LJJJJJ(liveFansCapsuleStarlingKey2.pattern);
        c09dl.LJIILLIIL("starling_key");
        c09dl.LJJJJJ(liveFansCapsuleStarlingKey2.key);
        c09dl.LJII();
    }
}
