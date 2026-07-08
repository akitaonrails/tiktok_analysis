package com.bytedance.android.livesdk.livesetting.other.clientstrategy;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.other.clientstrategy.LiveEpiClientRulesSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveEpiClientRulesSetting_LiveStrategyParamsConfig_OptTypeAdapter extends TypeAdapter<LiveEpiClientRulesSetting.LiveStrategyParamsConfig> {
    public final Gson LIZ;

    public LiveEpiClientRulesSetting_LiveStrategyParamsConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveEpiClientRulesSetting.LiveStrategyParamsConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveEpiClientRulesSetting.LiveStrategyParamsConfig liveStrategyParamsConfig = new LiveEpiClientRulesSetting.LiveStrategyParamsConfig(false, 3000L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "enable")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveStrategyParamsConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "engine_freq")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveStrategyParamsConfig.engineFreq = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return liveStrategyParamsConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveEpiClientRulesSetting.LiveStrategyParamsConfig liveStrategyParamsConfig) throws IOException {
        LiveEpiClientRulesSetting.LiveStrategyParamsConfig liveStrategyParamsConfig2 = liveStrategyParamsConfig;
        if (liveStrategyParamsConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveStrategyParamsConfig2.enable);
        c09dl.LJIILLIIL("engine_freq");
        c09dl.LJJIZ(liveStrategyParamsConfig2.engineFreq);
        c09dl.LJII();
    }
}
