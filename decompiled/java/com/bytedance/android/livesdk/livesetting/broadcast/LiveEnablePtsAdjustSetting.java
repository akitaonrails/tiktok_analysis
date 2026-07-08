package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_enable_pts_adjust")
public final class LiveEnablePtsAdjustSetting {
    public static final boolean DEFAULT = false;
    public static final LiveEnablePtsAdjustSetting INSTANCE = new LiveEnablePtsAdjustSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_enable_pts_adjust", DEFAULT);
    }
}
