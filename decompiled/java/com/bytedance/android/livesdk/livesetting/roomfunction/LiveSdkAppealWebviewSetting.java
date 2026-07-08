package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_sdk_appeal_webview")
public final class LiveSdkAppealWebviewSetting {
    public static final String DEFAULT = "";
    public static final LiveSdkAppealWebviewSetting INSTANCE = new LiveSdkAppealWebviewSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_sdk_appeal_webview", DEFAULT);
    }
}
