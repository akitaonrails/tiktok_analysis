package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveMatchOptNtpParams_OptTypeAdapter extends TypeAdapter<LiveMatchOptNtpParams> {
    @Override // com.google.gson.TypeAdapter
    public final LiveMatchOptNtpParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveMatchOptNtpParams liveMatchOptNtpParams = new LiveMatchOptNtpParams(1, 21600000L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "enable")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveMatchOptNtpParams.enable = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "max_update_ntp_interval")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveMatchOptNtpParams.maxUpdateNetInterval = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return liveMatchOptNtpParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveMatchOptNtpParams liveMatchOptNtpParams) throws IOException {
        LiveMatchOptNtpParams liveMatchOptNtpParams2 = liveMatchOptNtpParams;
        if (liveMatchOptNtpParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJ(Integer.valueOf(liveMatchOptNtpParams2.enable));
        c09dl.LJIILLIIL("max_update_ntp_interval");
        c09dl.LJJIZ(liveMatchOptNtpParams2.maxUpdateNetInterval);
        c09dl.LJII();
    }
}
