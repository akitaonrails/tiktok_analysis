package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("linkmic_sdk_cancel_invite_record_timeout_Interval")
public final class LinkMicMultiGuestV3CancelInviteTimeoutInterval {
    public static final long DEFAULT = 118;
    public static final LinkMicMultiGuestV3CancelInviteTimeoutInterval INSTANCE = new LinkMicMultiGuestV3CancelInviteTimeoutInterval();

    public static final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("linkmic_sdk_cancel_invite_record_timeout_Interval", DEFAULT);
    }
}
