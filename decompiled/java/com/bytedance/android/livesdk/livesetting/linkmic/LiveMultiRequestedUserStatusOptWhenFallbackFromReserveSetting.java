package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_multi_requested_user_status_opt_when_fallback_from_reserve")
public final class LiveMultiRequestedUserStatusOptWhenFallbackFromReserveSetting {
    public static final boolean DEFAULT = true;
    public static final LiveMultiRequestedUserStatusOptWhenFallbackFromReserveSetting INSTANCE = new LiveMultiRequestedUserStatusOptWhenFallbackFromReserveSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMultiRequestedUserStatusOptWhenFallbackFromReserveSetting.class);
    }
}
