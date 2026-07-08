package com.bytedance.android.livestrategy.config;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class StrategyConfig_OptTypeAdapter extends TypeAdapter<StrategyConfig> {
    public final Gson LIZ;

    public StrategyConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final StrategyConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        StrategyConfig strategyConfig = new StrategyConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "trigger_strategy_config")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    strategyConfig.setTriggerStrategyConfig((TriggerStrategyConfig) this.LIZ.LJIIJ(TriggerStrategyConfig.class).read(c09cu));
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "final_strategy_config")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    strategyConfig.setFinalStrategyConfig((FinalStrategyConfig) this.LIZ.LJIIJ(FinalStrategyConfig.class).read(c09cu));
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return strategyConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, StrategyConfig strategyConfig) {
        StrategyConfig strategyConfig2 = strategyConfig;
        if (strategyConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("trigger_strategy_config");
        this.LIZ.LJIIJ(TriggerStrategyConfig.class).write(c09dl, strategyConfig2.getTriggerStrategyConfig());
        c09dl.LJIILLIIL("final_strategy_config");
        this.LIZ.LJIIJ(FinalStrategyConfig.class).write(c09dl, strategyConfig2.getFinalStrategyConfig());
        c09dl.LJII();
    }
}
