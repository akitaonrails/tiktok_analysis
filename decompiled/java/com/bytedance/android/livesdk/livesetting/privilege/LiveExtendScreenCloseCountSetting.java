package com.bytedance.android.livesdk.livesetting.privilege;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_extended_screen_close_count_threshold")
public final class LiveExtendScreenCloseCountSetting {
    public static final LiveExtendScreenCloseCountSetting INSTANCE = new LiveExtendScreenCloseCountSetting();
    public static final int DEFAULT = 3;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_extended_screen_close_count_threshold", DEFAULT);
    }
}
