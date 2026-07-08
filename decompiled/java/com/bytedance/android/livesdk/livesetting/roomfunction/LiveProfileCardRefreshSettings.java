package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_profile_card_refresh_settings")
public final class LiveProfileCardRefreshSettings {
    public static final boolean DEFAULT = true;
    public static final LiveProfileCardRefreshSettings INSTANCE = new LiveProfileCardRefreshSettings();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_profile_card_refresh_settings", DEFAULT);
    }
}
