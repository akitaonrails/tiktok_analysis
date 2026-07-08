package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenDowngradeSetting;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LivePublicScreenDowngradeSetting_DowngradeConfig_OptTypeAdapter extends TypeAdapter<LivePublicScreenDowngradeSetting.DowngradeConfig> {
    @Override // com.google.gson.TypeAdapter
    public final LivePublicScreenDowngradeSetting.DowngradeConfig read(C09CU c09cu) {
        LivePublicScreenDowngradeSetting.DowngradeConfig downgradeConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            downgradeConfig = new LivePublicScreenDowngradeSetting.DowngradeConfig(1.0f, 1.0f);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "downgrade_qps_factor")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        downgradeConfig.setDowngradeQpsFactor((float) c09cu.LJJIL());
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "downgrade_first_interval_factor")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        downgradeConfig.setDowngradeFirstIntervalFactor((float) c09cu.LJJIL());
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return downgradeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LivePublicScreenDowngradeSetting.DowngradeConfig downgradeConfig) {
        LivePublicScreenDowngradeSetting.DowngradeConfig downgradeConfig2 = downgradeConfig;
        if (downgradeConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("downgrade_qps_factor");
        c09dl.LJJJJ(Float.valueOf(downgradeConfig2.getDowngradeQpsFactor()));
        c09dl.LJIILLIIL("downgrade_first_interval_factor");
        c09dl.LJJJJ(Float.valueOf(downgradeConfig2.getDowngradeFirstIntervalFactor()));
        c09dl.LJII();
    }
}
