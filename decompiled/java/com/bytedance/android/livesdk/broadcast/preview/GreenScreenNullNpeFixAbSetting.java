package com.bytedance.android.livesdk.broadcast.preview;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "green_screen_null_npe_fix_ab")
public final class GreenScreenNullNpeFixAbSetting {
    public static final boolean DEFAULT = true;
    public static final GreenScreenNullNpeFixAbSetting INSTANCE = new GreenScreenNullNpeFixAbSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("green_screen_null_npe_fix_ab", DEFAULT);
    }
}
