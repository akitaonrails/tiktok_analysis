package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C13LQ;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "game_live_linking_audience_control_later_threshold")
public final class GameLiveLinkingAudienceControlLaterThresholdSetting {
    public static final GameLiveLinkingAudienceControlLaterThresholdSetting INSTANCE = new GameLiveLinkingAudienceControlLaterThresholdSetting();
    public static final int[] DEFAULT = {3, 5};

    public final int getSingleThreshold() {
        Integer numLJJI;
        int[] iArr = (int[]) SettingsManager.INSTANCE.getValueSafely("game_live_linking_audience_control_later_threshold", DEFAULT);
        if (iArr == null || (numLJJI = C13LQ.LJJI(iArr)) == null) {
            return 3;
        }
        return numLJJI.intValue();
    }

    public final int getTotalThreshold() {
        int[] iArr = (int[]) SettingsManager.INSTANCE.getValueSafely("game_live_linking_audience_control_later_threshold", DEFAULT);
        if (iArr != null) {
            return iArr[1];
        }
        return 5;
    }
}
