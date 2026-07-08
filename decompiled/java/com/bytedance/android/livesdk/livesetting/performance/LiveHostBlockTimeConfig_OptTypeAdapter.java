package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveHostBlockTimeConfig_OptTypeAdapter extends TypeAdapter<LiveHostBlockTimeConfig> {
    @Override // com.google.gson.TypeAdapter
    public final LiveHostBlockTimeConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveHostBlockTimeConfig liveHostBlockTimeConfig = new LiveHostBlockTimeConfig(100L, 100L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "execute_time")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveHostBlockTimeConfig.executeTime = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "block_time")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveHostBlockTimeConfig.blockTime = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return liveHostBlockTimeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveHostBlockTimeConfig liveHostBlockTimeConfig) throws IOException {
        LiveHostBlockTimeConfig liveHostBlockTimeConfig2 = liveHostBlockTimeConfig;
        if (liveHostBlockTimeConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("execute_time");
        c09dl.LJJIZ(liveHostBlockTimeConfig2.executeTime);
        c09dl.LJIILLIIL("block_time");
        c09dl.LJJIZ(liveHostBlockTimeConfig2.blockTime);
        c09dl.LJII();
    }
}
