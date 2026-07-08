package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_enable_per_push_interactive_stream")
public final class LiveEnablePerPushInteractiveStreamSetting {
    public static final boolean DEFAULT = true;
    public static final LiveEnablePerPushInteractiveStreamSetting INSTANCE = new LiveEnablePerPushInteractiveStreamSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_enable_per_push_interactive_stream", DEFAULT);
    }
}
