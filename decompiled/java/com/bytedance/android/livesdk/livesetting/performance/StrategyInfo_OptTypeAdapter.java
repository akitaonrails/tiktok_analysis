package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class StrategyInfo_OptTypeAdapter extends TypeAdapter<StrategyInfo> {
    public final Gson LIZ;

    public StrategyInfo_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final StrategyInfo read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        StrategyInfo strategyInfo = new StrategyInfo();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "upgrade_metrics_score")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    strategyInfo.upgradeMetricsStrategy = C473040Igo.LIZ(this.LIZ, c09cu, Metrics2BizMapping.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "downgrade_metrics_score")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    strategyInfo.downgradeMetricsStrategy = C473040Igo.LIZ(this.LIZ, c09cu, Metrics2BizMapping.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return strategyInfo;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, StrategyInfo strategyInfo) {
        StrategyInfo strategyInfo2 = strategyInfo;
        if (strategyInfo2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("upgrade_metrics_score");
        C473040Igo.LIZLLL(this.LIZ, c09dl, strategyInfo2.upgradeMetricsStrategy, Metrics2BizMapping.class);
        c09dl.LJIILLIIL("downgrade_metrics_score");
        C473040Igo.LIZLLL(this.LIZ, c09dl, strategyInfo2.downgradeMetricsStrategy, Metrics2BizMapping.class);
        c09dl.LJII();
    }
}
