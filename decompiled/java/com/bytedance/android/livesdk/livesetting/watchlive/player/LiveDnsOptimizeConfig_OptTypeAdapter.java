package com.bytedance.android.livesdk.livesetting.watchlive.player;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveDnsOptimizeConfig_OptTypeAdapter extends TypeAdapter<LiveDnsOptimizeConfig> {
    @Override // com.google.gson.TypeAdapter
    public final LiveDnsOptimizeConfig read(C09CU c09cu) {
        LiveDnsOptimizeConfig liveDnsOptimizeConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            liveDnsOptimizeConfig = new LiveDnsOptimizeConfig(0, 0);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "enable_check_dns")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveDnsOptimizeConfig.enableCheckDns = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "check_host_count")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveDnsOptimizeConfig.checkHostCount = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return liveDnsOptimizeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveDnsOptimizeConfig liveDnsOptimizeConfig) {
        LiveDnsOptimizeConfig liveDnsOptimizeConfig2 = liveDnsOptimizeConfig;
        if (liveDnsOptimizeConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_check_dns");
        c09dl.LJJJJ(Integer.valueOf(liveDnsOptimizeConfig2.enableCheckDns));
        c09dl.LJIILLIIL("check_host_count");
        c09dl.LJJJJ(Integer.valueOf(liveDnsOptimizeConfig2.checkHostCount));
        c09dl.LJII();
    }
}
