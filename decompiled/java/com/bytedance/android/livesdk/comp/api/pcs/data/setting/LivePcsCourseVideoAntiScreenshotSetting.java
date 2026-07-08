package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_pcs_course_video_anti_screenshot_enable")
public final class LivePcsCourseVideoAntiScreenshotSetting {
    public static final boolean DEFAULT = true;
    public static final LivePcsCourseVideoAntiScreenshotSetting INSTANCE = new LivePcsCourseVideoAntiScreenshotSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_pcs_course_video_anti_screenshot_enable", DEFAULT);
    }
}
