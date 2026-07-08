package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveEnterRoomBoostExp;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveEnterRoomBoostExp_LiveEnterRoomBoostConfig_OptTypeAdapter extends TypeAdapter<LiveEnterRoomBoostExp.LiveEnterRoomBoostConfig> {
    @Override // com.google.gson.TypeAdapter
    public final LiveEnterRoomBoostExp.LiveEnterRoomBoostConfig read(C09CU c09cu) {
        LiveEnterRoomBoostExp.LiveEnterRoomBoostConfig liveEnterRoomBoostConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            liveEnterRoomBoostConfig = new LiveEnterRoomBoostExp.LiveEnterRoomBoostConfig(0);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "cacheType")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveEnterRoomBoostConfig.setBoostType(c09cu.LJJIZ());
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return liveEnterRoomBoostConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveEnterRoomBoostExp.LiveEnterRoomBoostConfig liveEnterRoomBoostConfig) {
        LiveEnterRoomBoostExp.LiveEnterRoomBoostConfig liveEnterRoomBoostConfig2 = liveEnterRoomBoostConfig;
        if (liveEnterRoomBoostConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("cacheType");
        c09dl.LJJJJ(Integer.valueOf(liveEnterRoomBoostConfig2.getBoostType()));
        c09dl.LJII();
    }
}
