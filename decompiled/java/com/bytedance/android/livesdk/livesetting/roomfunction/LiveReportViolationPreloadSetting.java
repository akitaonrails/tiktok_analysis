package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_report_violation_preload_enable")
public final class LiveReportViolationPreloadSetting {
    public static final boolean DEFAULT = false;
    public static final LiveReportViolationPreloadSetting INSTANCE;
    public static final boolean enable;

    public static /* synthetic */ void getEnable$annotations() {
    }

    static {
        LiveReportViolationPreloadSetting liveReportViolationPreloadSetting = new LiveReportViolationPreloadSetting();
        INSTANCE = liveReportViolationPreloadSetting;
        enable = liveReportViolationPreloadSetting.getValue();
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_report_violation_preload_enable", DEFAULT);
    }

    public static final boolean getEnable() {
        return enable;
    }
}
