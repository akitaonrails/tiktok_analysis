package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_enter_defer_opt")
public final class LiveEnterDeferOptSetting {
    public static final int DEFAULT = 0;
    public static final LiveEnterDeferOptSetting INSTANCE = new LiveEnterDeferOptSetting();

    public final int value() {
        return SettingsManager.INSTANCE.getIntValue("live_enter_defer_opt", DEFAULT);
    }
}
