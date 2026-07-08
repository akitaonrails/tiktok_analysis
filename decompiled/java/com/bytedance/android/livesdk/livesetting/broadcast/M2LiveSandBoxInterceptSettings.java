package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("m2live_sandbox_intercept_enable")
public final class M2LiveSandBoxInterceptSettings {
    public static final int DEFAULT = 0;
    public static final M2LiveSandBoxInterceptSettings INSTANCE = new M2LiveSandBoxInterceptSettings();

    public final int enabled() {
        return SettingsManager.INSTANCE.getIntValue("m2live_sandbox_intercept_enable", DEFAULT);
    }
}
