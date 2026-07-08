package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_try_mode_release_setting")
public final class LiveTryModeReleaseSetting {
    public static final boolean DEFAULT = true;
    public static final LiveTryModeReleaseSetting INSTANCE = new LiveTryModeReleaseSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_try_mode_release_setting", DEFAULT);
    }
}
