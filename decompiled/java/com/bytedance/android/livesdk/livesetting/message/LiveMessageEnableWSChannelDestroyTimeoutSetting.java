package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_message_enable_wschannel_destroy_timeout")
public final class LiveMessageEnableWSChannelDestroyTimeoutSetting {
    public static final boolean DEFAULT = false;
    public static final LiveMessageEnableWSChannelDestroyTimeoutSetting INSTANCE = new LiveMessageEnableWSChannelDestroyTimeoutSetting();

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_message_enable_wschannel_destroy_timeout", DEFAULT);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
