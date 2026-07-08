package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_rank_list_countdown_accuracy")
public final class LiveRankListCountdownAccuracySetting {
    public static final LiveRankListCountdownAccuracySetting INSTANCE = new LiveRankListCountdownAccuracySetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_rank_list_countdown_accuracy", DEFAULT);
    }
}
