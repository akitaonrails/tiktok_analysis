package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveMatchFallbackConfigData_OptTypeAdapter extends TypeAdapter<LiveMatchFallbackConfigData> {
    @Override // com.google.gson.TypeAdapter
    public final LiveMatchFallbackConfigData read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveMatchFallbackConfigData liveMatchFallbackConfigData = new LiveMatchFallbackConfigData(60L, 2L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "fallback_max_duration")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveMatchFallbackConfigData.maxDuration = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "fallback_interval")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveMatchFallbackConfigData.interval = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return liveMatchFallbackConfigData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveMatchFallbackConfigData liveMatchFallbackConfigData) throws IOException {
        LiveMatchFallbackConfigData liveMatchFallbackConfigData2 = liveMatchFallbackConfigData;
        if (liveMatchFallbackConfigData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("fallback_max_duration");
        c09dl.LJJIZ(liveMatchFallbackConfigData2.maxDuration);
        c09dl.LJIILLIIL("fallback_interval");
        c09dl.LJJIZ(liveMatchFallbackConfigData2.interval);
        c09dl.LJII();
    }
}
