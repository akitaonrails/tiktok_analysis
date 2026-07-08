package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_tiktok_studio_landing_opt")
public final class LiveHostLocateLiveCenterSetting {
    public static final LiveHostLocateLiveCenterSetting INSTANCE = new LiveHostLocateLiveCenterSetting();
    public static final boolean DEFAULT = false;
    public static final boolean enable = SettingsManager.INSTANCE.getBooleanValue("live_tiktok_studio_landing_opt", DEFAULT);

    public static /* synthetic */ void getEnable$annotations() {
    }

    public static final boolean getEnable() {
        return enable;
    }
}
