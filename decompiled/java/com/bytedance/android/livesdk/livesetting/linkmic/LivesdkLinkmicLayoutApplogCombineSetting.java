package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes21.dex */
@SettingsKey("livesdk_linkmic_layout_applog_combine")
public final class LivesdkLinkmicLayoutApplogCombineSetting {
    public static final int DEFAULT = 0;
    public static final LivesdkLinkmicLayoutApplogCombineSetting INSTANCE = new LivesdkLinkmicLayoutApplogCombineSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("livesdk_linkmic_layout_applog_combine", DEFAULT);
    }

    public final boolean isChannelIdMismatchReportEnable() {
        return (getValue() & 2) != 0;
    }

    public final boolean isDslDownloadFailedReportEnable() {
        return (getValue() & 16) != 0;
    }

    public final boolean isDslLoadFailedReportEnable() {
        return (getValue() & 32) != 0;
    }

    public final boolean isLayoutNotFoundReportEnable() {
        return (getValue() & 8) != 0;
    }

    public final boolean isLinkUserNotFoundReportEnable() {
        return (getValue() & 4) != 0;
    }
}
