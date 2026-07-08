package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_invite_list_performance_opt")
public final class LiveCoHostInviteListPerformanceOptSettings {
    public static final LiveCoHostInviteListPerformanceOptSettings INSTANCE = new LiveCoHostInviteListPerformanceOptSettings();
    public static final int DEFAULT = 15;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_cohost_invite_list_performance_opt", DEFAULT);

    public final boolean isEnable() {
        return value > 0;
    }
}
