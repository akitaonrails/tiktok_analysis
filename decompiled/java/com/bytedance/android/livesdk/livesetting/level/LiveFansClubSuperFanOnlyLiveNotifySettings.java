package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_superfan_only_live_notify")
public final class LiveFansClubSuperFanOnlyLiveNotifySettings {
    public static final boolean DEFAULT = true;
    public static final LiveFansClubSuperFanOnlyLiveNotifySettings INSTANCE = new LiveFansClubSuperFanOnlyLiveNotifySettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_superfan_only_live_notify", DEFAULT);
    }
}
