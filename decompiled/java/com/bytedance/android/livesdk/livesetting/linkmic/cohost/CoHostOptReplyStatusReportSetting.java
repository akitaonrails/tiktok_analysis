package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "cohost_opt_reply_status_report_setting")
public final class CoHostOptReplyStatusReportSetting {
    public static final boolean DEFAULT = true;
    public static final CoHostOptReplyStatusReportSetting INSTANCE = new CoHostOptReplyStatusReportSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_opt_reply_status_report_setting", DEFAULT);
    }
}
