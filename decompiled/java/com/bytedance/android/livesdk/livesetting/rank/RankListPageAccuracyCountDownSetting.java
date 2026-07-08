package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_rank_list_accuracy_count_down")
public final class RankListPageAccuracyCountDownSetting {
    public static final boolean DEFAULT = false;
    public static final RankListPageAccuracyCountDownSetting INSTANCE = new RankListPageAccuracyCountDownSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_rank_list_accuracy_count_down", DEFAULT);
    }
}
