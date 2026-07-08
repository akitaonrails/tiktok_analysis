package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_opt_static_log")
public final class LiveStaticLogOptSetting {
    public static final boolean DEFAULT = false;
    public static final LiveStaticLogOptSetting INSTANCE = new LiveStaticLogOptSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_opt_static_log", DEFAULT);
    }
}
