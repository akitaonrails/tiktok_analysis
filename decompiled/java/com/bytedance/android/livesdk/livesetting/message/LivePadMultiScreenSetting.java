package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_pad_multi_screen")
public final class LivePadMultiScreenSetting {
    public static final boolean DEFAULT = false;
    public static final LivePadMultiScreenSetting INSTANCE = new LivePadMultiScreenSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_pad_multi_screen", DEFAULT);
    }
}
