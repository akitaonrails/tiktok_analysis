package com.bytedance.android.livesdk.livesetting.other.clientstrategy;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.other.clientstrategy.LivePanGestureSpeed;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LivePanGestureSpeed_StrategyConfig_OptTypeAdapter extends TypeAdapter<LivePanGestureSpeed.StrategyConfig> {
    @Override // com.google.gson.TypeAdapter
    public final LivePanGestureSpeed.StrategyConfig read(C09CU c09cu) {
        LivePanGestureSpeed.StrategyConfig strategyConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            strategyConfig = new LivePanGestureSpeed.StrategyConfig("", "");
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "type")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        strategyConfig.type = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "detail")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        strategyConfig.detail = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return strategyConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LivePanGestureSpeed.StrategyConfig strategyConfig) {
        LivePanGestureSpeed.StrategyConfig strategyConfig2 = strategyConfig;
        if (strategyConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("type");
        c09dl.LJJJJJ(strategyConfig2.type);
        c09dl.LJIILLIIL("detail");
        c09dl.LJJJJJ(strategyConfig2.detail);
        c09dl.LJII();
    }
}
