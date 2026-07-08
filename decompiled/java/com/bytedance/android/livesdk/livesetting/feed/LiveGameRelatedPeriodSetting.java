package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("ttlive_broadcast_game_related_live_validity_period")
public final class LiveGameRelatedPeriodSetting {
    public static final LiveGameRelatedPeriodSetting INSTANCE = new LiveGameRelatedPeriodSetting();
    public static final long DEFAULT = 120000;

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("ttlive_broadcast_game_related_live_validity_period", DEFAULT);
    }
}
