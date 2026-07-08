package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_server_time_sync_enable")
public final class MatchTimeSyncSetting {
    public static final boolean DEFAULT = false;
    public static final MatchTimeSyncSetting INSTANCE = new MatchTimeSyncSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_server_time_sync_enable", DEFAULT);
    }
}
