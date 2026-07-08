package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveEndOptConfig_OptTypeAdapter extends TypeAdapter<LiveEndOptConfig> {
    @Override // com.google.gson.TypeAdapter
    public final LiveEndOptConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveEndOptConfig liveEndOptConfig = new LiveEndOptConfig(0, 500L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "enable_live_end_opt")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveEndOptConfig.enableLiveEndOpt = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "live_end_timeout")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveEndOptConfig.liveEndTimeout = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return liveEndOptConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveEndOptConfig liveEndOptConfig) throws IOException {
        LiveEndOptConfig liveEndOptConfig2 = liveEndOptConfig;
        if (liveEndOptConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_live_end_opt");
        c09dl.LJJJJ(Integer.valueOf(liveEndOptConfig2.enableLiveEndOpt));
        c09dl.LJIILLIIL("live_end_timeout");
        c09dl.LJJIZ(liveEndOptConfig2.liveEndTimeout);
        c09dl.LJII();
    }
}
