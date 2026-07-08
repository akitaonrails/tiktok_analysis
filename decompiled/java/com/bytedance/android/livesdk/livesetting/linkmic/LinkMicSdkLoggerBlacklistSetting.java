package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("linkmic_sdk_logger_blacklist_conf")
public final class LinkMicSdkLoggerBlacklistSetting {
    public static final LinkMicSdkLoggerBlacklistSetting INSTANCE = new LinkMicSdkLoggerBlacklistSetting();
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("linkmic_sdk_logger_blacklist_conf", DEFAULT);
    }
}
