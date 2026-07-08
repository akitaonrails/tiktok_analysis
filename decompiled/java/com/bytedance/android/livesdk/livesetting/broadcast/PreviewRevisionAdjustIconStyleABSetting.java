package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "adjust_icon_style")
public final class PreviewRevisionAdjustIconStyleABSetting {
    public static final int DEFAULT = 0;
    public static final PreviewRevisionAdjustIconStyleABSetting INSTANCE = new PreviewRevisionAdjustIconStyleABSetting();

    public final boolean isMatch() {
        return SettingsManager.INSTANCE.getIntValue("adjust_icon_style", DEFAULT) != 0;
    }
}
