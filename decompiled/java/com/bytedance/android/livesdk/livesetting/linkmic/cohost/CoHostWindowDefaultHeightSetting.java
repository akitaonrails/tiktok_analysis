package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_window_default_height")
public final class CoHostWindowDefaultHeightSetting {
    public static final float DEFAULT = 0.5f;
    public static final CoHostWindowDefaultHeightSetting INSTANCE = new CoHostWindowDefaultHeightSetting();

    public final float getScreenRatioValue() {
        return SettingsManager.INSTANCE.getFloatValue("live_cohost_window_default_height", DEFAULT);
    }
}
