package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_enable_remote_dsl_file_setting")
public final class LinkMicSdkGeckoDslDownloadSetting {
    public static final boolean DEFAULT = false;
    public static final LinkMicSdkGeckoDslDownloadSetting INSTANCE = new LinkMicSdkGeckoDslDownloadSetting();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_enable_remote_dsl_file_setting", DEFAULT);
    }
}
