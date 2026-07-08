package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_subscription_context_wrapper")
public final class LiveSubscriptionContextWrapperSetting {
    public static final LiveSubscriptionContextWrapperSetting INSTANCE = new LiveSubscriptionContextWrapperSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_subscription_context_wrapper", DEFAULT);
    }
}
