package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_multi_invite_from_public_screen_guide_report")
public final class LiveSdkMultiInviteFromPublicScreenGuideReportSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSdkMultiInviteFromPublicScreenGuideReportSetting INSTANCE = new LiveSdkMultiInviteFromPublicScreenGuideReportSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_multi_invite_from_public_screen_guide_report", DEFAULT);
    }
}
