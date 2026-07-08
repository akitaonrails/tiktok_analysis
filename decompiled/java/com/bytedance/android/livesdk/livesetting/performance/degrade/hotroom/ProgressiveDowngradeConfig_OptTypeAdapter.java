package com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class ProgressiveDowngradeConfig_OptTypeAdapter extends TypeAdapter<ProgressiveDowngradeConfig> {
    @Override // com.google.gson.TypeAdapter
    public final ProgressiveDowngradeConfig read(C09CU c09cu) {
        ProgressiveDowngradeConfig progressiveDowngradeConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            progressiveDowngradeConfig = new ProgressiveDowngradeConfig(40.0f, 60.0f);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "downgradeScoreThreshold")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        progressiveDowngradeConfig.setDowngradeScoreThreshold((float) c09cu.LJJIL());
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "upgradeScoreThreshold")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        progressiveDowngradeConfig.setUpgradeScoreThreshold((float) c09cu.LJJIL());
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return progressiveDowngradeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, ProgressiveDowngradeConfig progressiveDowngradeConfig) {
        ProgressiveDowngradeConfig progressiveDowngradeConfig2 = progressiveDowngradeConfig;
        if (progressiveDowngradeConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("downgradeScoreThreshold");
        c09dl.LJJJJ(Float.valueOf(progressiveDowngradeConfig2.getDowngradeScoreThreshold()));
        c09dl.LJIILLIIL("upgradeScoreThreshold");
        c09dl.LJJJJ(Float.valueOf(progressiveDowngradeConfig2.getUpgradeScoreThreshold()));
        c09dl.LJII();
    }
}
