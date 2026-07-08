package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("enable_tt_capture")
public final class EnableTTCaptureSetting {
    public static final int DEFAULT = 1;
    public static final EnableTTCaptureSetting INSTANCE = new EnableTTCaptureSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("enable_tt_capture", DEFAULT) == 1;
    }
}
