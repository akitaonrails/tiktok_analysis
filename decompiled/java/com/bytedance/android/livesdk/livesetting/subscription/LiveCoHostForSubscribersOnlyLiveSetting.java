package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_enable_cohost_for_sub_only_live")
public final class LiveCoHostForSubscribersOnlyLiveSetting {
    public static final boolean DEFAULT = false;
    public static final LiveCoHostForSubscribersOnlyLiveSetting INSTANCE = new LiveCoHostForSubscribersOnlyLiveSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_enable_cohost_for_sub_only_live", DEFAULT);
    }
}
