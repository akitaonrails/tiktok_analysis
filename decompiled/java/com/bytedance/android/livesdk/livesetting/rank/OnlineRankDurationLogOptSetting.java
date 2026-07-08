package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("audience_list_duration_log_opt")
public final class OnlineRankDurationLogOptSetting {
    public static final boolean DEFAULT = true;
    public static final OnlineRankDurationLogOptSetting INSTANCE = new OnlineRankDurationLogOptSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("audience_list_duration_log_opt", DEFAULT);
    }
}
