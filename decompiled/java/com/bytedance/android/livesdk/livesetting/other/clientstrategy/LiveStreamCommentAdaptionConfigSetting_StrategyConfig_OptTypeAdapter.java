package com.bytedance.android.livesdk.livesetting.other.clientstrategy;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.other.clientstrategy.LiveStreamCommentAdaptionConfigSetting;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveStreamCommentAdaptionConfigSetting_StrategyConfig_OptTypeAdapter extends TypeAdapter<LiveStreamCommentAdaptionConfigSetting.StrategyConfig> {
    @Override // com.google.gson.TypeAdapter
    public final LiveStreamCommentAdaptionConfigSetting.StrategyConfig read(C09CU c09cu) {
        LiveStreamCommentAdaptionConfigSetting.StrategyConfig strategyConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            strategyConfig = new LiveStreamCommentAdaptionConfigSetting.StrategyConfig("rule", "{\"version\":1,\"name\":\"stream_comment_adaption_v0\",\"type\":\"rule\",\"key_features\":[\"room_type\"],\"rules\":[{\"rule_id\":1,\"expression\":\"room_type != 0\",\"order\":1,\"result_value\":\"false\"}],\"default_result\":\"true\"}");
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
    public final void write(C09DL c09dl, LiveStreamCommentAdaptionConfigSetting.StrategyConfig strategyConfig) {
        LiveStreamCommentAdaptionConfigSetting.StrategyConfig strategyConfig2 = strategyConfig;
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
