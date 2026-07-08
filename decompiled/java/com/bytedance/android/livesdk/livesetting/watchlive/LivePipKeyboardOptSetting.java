package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_pip_keyboard_opt")
public final class LivePipKeyboardOptSetting {
    public static final boolean DEFAULT = false;
    public static final LivePipKeyboardOptSetting INSTANCE = new LivePipKeyboardOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_pip_keyboard_opt", DEFAULT);
    }
}
