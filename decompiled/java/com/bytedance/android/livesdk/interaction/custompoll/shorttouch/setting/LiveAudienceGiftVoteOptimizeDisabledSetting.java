package com.bytedance.android.livesdk.interaction.custompoll.shorttouch.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_audience_gift_vote_optimize_disabled")
public final class LiveAudienceGiftVoteOptimizeDisabledSetting {
    public static final int DEFAULT = 0;
    public static final LiveAudienceGiftVoteOptimizeDisabledSetting INSTANCE = new LiveAudienceGiftVoteOptimizeDisabledSetting();

    public final boolean disable() {
        return SettingsManager.INSTANCE.getIntValue("live_audience_gift_vote_optimize_disabled", DEFAULT) == 0;
    }
}
