package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_slow_method_opt")
public final class LiveSlowMethodOpt {
    public static final boolean DEFAULT = false;
    public static final LiveSlowMethodOpt INSTANCE = new LiveSlowMethodOpt();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_slow_method_opt", DEFAULT);
    }
}
