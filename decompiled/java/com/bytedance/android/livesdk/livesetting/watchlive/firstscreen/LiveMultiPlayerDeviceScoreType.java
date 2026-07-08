package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("multi_player_audience_device_score")
public final class LiveMultiPlayerDeviceScoreType {
    public static final boolean DEFAULT = false;
    public static final LiveMultiPlayerDeviceScoreType INSTANCE = new LiveMultiPlayerDeviceScoreType();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_player_audience_device_score", DEFAULT);
    }
}
