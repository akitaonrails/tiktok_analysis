package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("linkmic_sdk_logger_conf")
public final class LinkMicLoggerSdkReportSetting {
    public static final LinkMicLoggerSdkReportSetting INSTANCE = new LinkMicLoggerSdkReportSetting();
    public static final LinkMicLoggerReportConf DEFAULT = new LinkMicLoggerReportConf(true, "info");

    public final LinkMicLoggerReportConf getValue() {
        LinkMicLoggerReportConf linkMicLoggerReportConf = (LinkMicLoggerReportConf) SettingsManager.INSTANCE.getValueSafely(LinkMicLoggerSdkReportSetting.class);
        return linkMicLoggerReportConf == null ? DEFAULT : linkMicLoggerReportConf;
    }
}
