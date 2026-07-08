package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.level.FansClubSuperFanEmoteCapsuleSetting;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClubSuperFanEmoteCapsuleSetting_LiveSuperFanEmoteStarlingKey_OptTypeAdapter extends TypeAdapter<FansClubSuperFanEmoteCapsuleSetting.LiveSuperFanEmoteStarlingKey> {
    @Override // com.google.gson.TypeAdapter
    public final FansClubSuperFanEmoteCapsuleSetting.LiveSuperFanEmoteStarlingKey read(C09CU c09cu) {
        FansClubSuperFanEmoteCapsuleSetting.LiveSuperFanEmoteStarlingKey liveSuperFanEmoteStarlingKey = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            liveSuperFanEmoteStarlingKey = new FansClubSuperFanEmoteCapsuleSetting.LiveSuperFanEmoteStarlingKey("", "");
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "pattern")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveSuperFanEmoteStarlingKey.pattern = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "starling_key")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveSuperFanEmoteStarlingKey.key = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return liveSuperFanEmoteStarlingKey;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FansClubSuperFanEmoteCapsuleSetting.LiveSuperFanEmoteStarlingKey liveSuperFanEmoteStarlingKey) {
        FansClubSuperFanEmoteCapsuleSetting.LiveSuperFanEmoteStarlingKey liveSuperFanEmoteStarlingKey2 = liveSuperFanEmoteStarlingKey;
        if (liveSuperFanEmoteStarlingKey2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("pattern");
        c09dl.LJJJJJ(liveSuperFanEmoteStarlingKey2.pattern);
        c09dl.LJIILLIIL("starling_key");
        c09dl.LJJJJJ(liveSuperFanEmoteStarlingKey2.key);
        c09dl.LJII();
    }
}
