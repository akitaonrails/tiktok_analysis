package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("linkmic_low_cap_fps_setting")
public final class LinkMicLowCapFpsSetting {
    public static final boolean DEFAULT = false;
    public static final LinkMicLowCapFpsSetting INSTANCE = new LinkMicLowCapFpsSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_low_cap_fps_setting", DEFAULT);
    }
}
