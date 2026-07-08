package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_main_frame_typeface")
public final class LiveMainFrameworkUpdateTypefaceSetting {
    public static final LiveMainFrameworkUpdateTypefaceSetting INSTANCE = new LiveMainFrameworkUpdateTypefaceSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_main_frame_typeface", true);

    public final boolean enable() {
        return value;
    }
}
