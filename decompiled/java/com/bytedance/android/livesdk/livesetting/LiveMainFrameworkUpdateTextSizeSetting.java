package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_main_frame_text_size")
public final class LiveMainFrameworkUpdateTextSizeSetting {
    public static final LiveMainFrameworkUpdateTextSizeSetting INSTANCE = new LiveMainFrameworkUpdateTextSizeSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_main_frame_text_size", true);

    public final boolean enable() {
        return value;
    }
}
