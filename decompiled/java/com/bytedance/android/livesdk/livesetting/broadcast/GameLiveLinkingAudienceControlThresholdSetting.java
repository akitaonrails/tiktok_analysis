package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C13LQ;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "game_live_linking_audience_control_threshold")
public final class GameLiveLinkingAudienceControlThresholdSetting {
    public static final GameLiveLinkingAudienceControlThresholdSetting INSTANCE = new GameLiveLinkingAudienceControlThresholdSetting();
    public static final int[] DEFAULT = {5, 4};

    public final int getESRBThreshold() {
        int[] iArr = (int[]) SettingsManager.INSTANCE.getValueSafely("game_live_linking_audience_control_threshold", DEFAULT);
        if (iArr != null) {
            return iArr[1];
        }
        return 4;
    }

    public final int getPEGIThreshold() {
        Integer numLJJI;
        int[] iArr = (int[]) SettingsManager.INSTANCE.getValueSafely("game_live_linking_audience_control_threshold", DEFAULT);
        if (iArr == null || (numLJJI = C13LQ.LJJI(iArr)) == null) {
            return 5;
        }
        return numLJJI.intValue();
    }
}
