package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_force_not_use_cache")
public final class LiveMatchForceNotUseCacheSetting {
    public static final boolean DEFAULT = true;
    public static final LiveMatchForceNotUseCacheSetting INSTANCE = new LiveMatchForceNotUseCacheSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_force_not_use_cache", DEFAULT);
    }
}
