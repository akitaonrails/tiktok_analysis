package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("linkmic_sdk_cancel_invite_timer")
public final class LinkMicMultiGuestV3ServiceCancelInviteTimerSetting {
    public static final long DEFAULT = 120;
    public static final LinkMicMultiGuestV3ServiceCancelInviteTimerSetting INSTANCE = new LinkMicMultiGuestV3ServiceCancelInviteTimerSetting();

    public static final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("linkmic_sdk_cancel_invite_timer", DEFAULT);
    }
}
