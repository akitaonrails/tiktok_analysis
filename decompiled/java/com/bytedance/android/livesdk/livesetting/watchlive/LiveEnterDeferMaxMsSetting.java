package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_enter_defer_max_ms")
public final class LiveEnterDeferMaxMsSetting {
    public static final LiveEnterDeferMaxMsSetting INSTANCE = new LiveEnterDeferMaxMsSetting();
    public static final int DEFAULT = 1200;

    public final int value() {
        return SettingsManager.INSTANCE.getIntValue("live_enter_defer_max_ms", DEFAULT);
    }
}
