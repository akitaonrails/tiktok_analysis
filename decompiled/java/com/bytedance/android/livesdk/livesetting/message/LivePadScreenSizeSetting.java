package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_pad_screen_mini_inch")
public final class LivePadScreenSizeSetting {
    public static final float DEFAULT = 0.0f;
    public static final LivePadScreenSizeSetting INSTANCE = new LivePadScreenSizeSetting();

    public final float getValue() {
        return SettingsManager.INSTANCE.getFloatValue("live_pad_screen_mini_inch", DEFAULT);
    }
}
