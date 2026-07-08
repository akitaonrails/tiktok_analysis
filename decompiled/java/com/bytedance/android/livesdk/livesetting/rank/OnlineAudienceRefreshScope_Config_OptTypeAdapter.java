package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.rank.OnlineAudienceRefreshScope;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class OnlineAudienceRefreshScope_Config_OptTypeAdapter extends TypeAdapter<OnlineAudienceRefreshScope.Config> {
    @Override // com.google.gson.TypeAdapter
    public final OnlineAudienceRefreshScope.Config read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        OnlineAudienceRefreshScope.Config config = new OnlineAudienceRefreshScope.Config(5L, 1L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "max")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    config.maxInterval = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "min")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    config.minInterval = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return config;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, OnlineAudienceRefreshScope.Config config) throws IOException {
        OnlineAudienceRefreshScope.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("max");
        c09dl.LJJIZ(config2.maxInterval);
        c09dl.LJIILLIIL("min");
        c09dl.LJJIZ(config2.minInterval);
        c09dl.LJII();
    }
}
