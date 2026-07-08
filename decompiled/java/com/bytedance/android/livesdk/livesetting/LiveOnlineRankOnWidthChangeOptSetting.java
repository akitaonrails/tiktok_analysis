package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_online_audience_on_width_change_opt")
public final class LiveOnlineRankOnWidthChangeOptSetting {
    public static final LiveOnlineRankOnWidthChangeOptSetting INSTANCE = new LiveOnlineRankOnWidthChangeOptSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_online_audience_on_width_change_opt", true);

    public final boolean enable() {
        return value;
    }
}
