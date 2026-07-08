package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_enable_fix_live_end")
public final class LiveEnableFixLiveEndSetting {
    public static final boolean DEFAULT = false;
    public static final LiveEnableFixLiveEndSetting INSTANCE = new LiveEnableFixLiveEndSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_enable_fix_live_end", DEFAULT);
    }
}
