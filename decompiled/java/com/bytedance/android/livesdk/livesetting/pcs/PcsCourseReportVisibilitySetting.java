package com.bytedance.android.livesdk.livesetting.pcs;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("pcs_course_report_visibility")
public final class PcsCourseReportVisibilitySetting {
    public static final boolean DEFAULT = false;
    public static final PcsCourseReportVisibilitySetting INSTANCE = new PcsCourseReportVisibilitySetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("pcs_course_report_visibility", DEFAULT);
    }
}
