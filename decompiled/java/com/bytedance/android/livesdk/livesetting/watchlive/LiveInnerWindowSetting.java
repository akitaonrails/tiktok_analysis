package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_inner_window")
public final class LiveInnerWindowSetting {
    public static final boolean DEFAULT = false;
    public static final LiveInnerWindowSetting INSTANCE = new LiveInnerWindowSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_inner_window", DEFAULT);
    }
}
