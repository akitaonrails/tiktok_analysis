package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "optimize_click_preview_banner")
public final class OptimizeClickPreviewBannerSetting {
    public static final int DEFAULT = 0;
    public static final OptimizeClickPreviewBannerSetting INSTANCE = new OptimizeClickPreviewBannerSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("optimize_click_preview_banner", DEFAULT) > 0;
    }

    public final boolean isV2() {
        return SettingsManager.INSTANCE.getIntValue("optimize_click_preview_banner", DEFAULT) == 2;
    }
}
