package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_pad_multi_screen_close_to_close_drawer")
public final class LivePadMultiScreenCloseToCloseDrawerSetting {
    public static final boolean DEFAULT = false;
    public static final LivePadMultiScreenCloseToCloseDrawerSetting INSTANCE = new LivePadMultiScreenCloseToCloseDrawerSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_pad_multi_screen_close_to_close_drawer", DEFAULT);
    }
}
