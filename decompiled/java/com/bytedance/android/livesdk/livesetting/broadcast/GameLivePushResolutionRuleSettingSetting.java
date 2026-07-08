package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C2188811AlT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "game_live_push_resolution_rule_setting")
public final class GameLivePushResolutionRuleSettingSetting {
    public static final GameLivePushResolutionRuleSettingSetting INSTANCE = new GameLivePushResolutionRuleSettingSetting();
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("game_live_push_resolution_rule_setting", DEFAULT);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : getValue()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("; ");
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
        }
        return sb.toString();
    }
}
