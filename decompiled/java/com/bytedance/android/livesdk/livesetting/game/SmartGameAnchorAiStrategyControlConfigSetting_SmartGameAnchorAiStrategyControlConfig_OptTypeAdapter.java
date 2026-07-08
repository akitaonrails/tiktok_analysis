package com.bytedance.android.livesdk.livesetting.game;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C2097608Jq;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.game.SmartGameAnchorAiStrategyControlConfigSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class SmartGameAnchorAiStrategyControlConfigSetting_SmartGameAnchorAiStrategyControlConfig_OptTypeAdapter extends TypeAdapter<SmartGameAnchorAiStrategyControlConfigSetting.SmartGameAnchorAiStrategyControlConfig> {
    public final Gson LIZ;

    public SmartGameAnchorAiStrategyControlConfigSetting_SmartGameAnchorAiStrategyControlConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final SmartGameAnchorAiStrategyControlConfigSetting.SmartGameAnchorAiStrategyControlConfig read(C09CU c09cu) {
        SmartGameAnchorAiStrategyControlConfigSetting.SmartGameAnchorAiStrategyControlConfig smartGameAnchorAiStrategyControlConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            smartGameAnchorAiStrategyControlConfig = new SmartGameAnchorAiStrategyControlConfigSetting.SmartGameAnchorAiStrategyControlConfig(C2097608Jq.LJ());
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "anchor_config_map")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        smartGameAnchorAiStrategyControlConfig.anchorConfigMap = C473040Igo.LIZIZ(this.LIZ, c09cu, SmartGameAnchorAiStrategyControlConfigSetting.AnchorStrategyConfig.class);
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return smartGameAnchorAiStrategyControlConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, SmartGameAnchorAiStrategyControlConfigSetting.SmartGameAnchorAiStrategyControlConfig smartGameAnchorAiStrategyControlConfig) {
        SmartGameAnchorAiStrategyControlConfigSetting.SmartGameAnchorAiStrategyControlConfig smartGameAnchorAiStrategyControlConfig2 = smartGameAnchorAiStrategyControlConfig;
        if (smartGameAnchorAiStrategyControlConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("anchor_config_map");
        C473040Igo.LJ(this.LIZ, c09dl, smartGameAnchorAiStrategyControlConfig2.anchorConfigMap, SmartGameAnchorAiStrategyControlConfigSetting.AnchorStrategyConfig.class);
        c09dl.LJII();
    }
}
