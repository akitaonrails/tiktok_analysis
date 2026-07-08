package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("alog_to_applog_switch")
public final class LinkMicALogToAppLogSetting {
    public static final boolean DEFAULT = false;
    public static final LinkMicALogToAppLogSetting INSTANCE = new LinkMicALogToAppLogSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("alog_to_applog_switch", DEFAULT);
    }
}
