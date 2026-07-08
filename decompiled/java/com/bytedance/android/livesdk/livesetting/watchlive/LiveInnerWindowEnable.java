package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("ttec_live_small_window_enable")
public final class LiveInnerWindowEnable {
    public static final boolean DEFAULT = false;
    public static final LiveInnerWindowEnable INSTANCE = new LiveInnerWindowEnable();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("ttec_live_small_window_enable", DEFAULT);
    }
}
