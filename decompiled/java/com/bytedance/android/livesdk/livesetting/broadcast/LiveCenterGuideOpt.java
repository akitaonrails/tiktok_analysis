package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_center_guide_opt")
public final class LiveCenterGuideOpt {
    public static final int DEFAULT = 0;
    public static final LiveCenterGuideOpt INSTANCE = new LiveCenterGuideOpt();

    public final boolean closeGuide() {
        return SettingsManager.INSTANCE.getIntValue("live_center_guide_opt", DEFAULT) == 99;
    }

    public final boolean enable() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        int i = DEFAULT;
        return (settingsManager.getIntValue("live_center_guide_opt", i) == 1 || settingsManager.getIntValue("live_center_guide_opt", i) == 2) && LiveCenterOpt.INSTANCE.enable();
    }

    public final boolean showOverviewNow() {
        return SettingsManager.INSTANCE.getIntValue("live_center_guide_opt", DEFAULT) == 2 && LiveCenterOpt.INSTANCE.enable();
    }
}
