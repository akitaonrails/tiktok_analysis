package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_withdraw_application_using_sdk_info")
public final class CohostWithdrawApplicationUsingSDKInfo {
    public static final boolean DEFAULT = true;
    public static final CohostWithdrawApplicationUsingSDKInfo INSTANCE = new CohostWithdrawApplicationUsingSDKInfo();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_withdraw_application_using_sdk_info", DEFAULT);
    }
}
