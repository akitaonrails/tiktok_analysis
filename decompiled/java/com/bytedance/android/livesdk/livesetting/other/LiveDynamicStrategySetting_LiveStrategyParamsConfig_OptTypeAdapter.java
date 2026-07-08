package com.bytedance.android.livesdk.livesetting.other;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.other.LiveDynamicStrategySetting;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveDynamicStrategySetting_LiveStrategyParamsConfig_OptTypeAdapter extends TypeAdapter<LiveDynamicStrategySetting.LiveStrategyParamsConfig> {
    @Override // com.google.gson.TypeAdapter
    public final LiveDynamicStrategySetting.LiveStrategyParamsConfig read(C09CU c09cu) {
        LiveDynamicStrategySetting.LiveStrategyParamsConfig liveStrategyParamsConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            liveStrategyParamsConfig = new LiveDynamicStrategySetting.LiveStrategyParamsConfig(10L);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "strategy_over_time")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveStrategyParamsConfig.strategyOverTime = c09cu.LJJJ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return liveStrategyParamsConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveDynamicStrategySetting.LiveStrategyParamsConfig liveStrategyParamsConfig) throws IOException {
        LiveDynamicStrategySetting.LiveStrategyParamsConfig liveStrategyParamsConfig2 = liveStrategyParamsConfig;
        if (liveStrategyParamsConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("strategy_over_time");
        c09dl.LJJIZ(liveStrategyParamsConfig2.strategyOverTime);
        c09dl.LJII();
    }
}
