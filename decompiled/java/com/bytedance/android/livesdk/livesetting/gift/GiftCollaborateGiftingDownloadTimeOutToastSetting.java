package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_collaborate_gifting_download_timeout_toast_setting")
public final class GiftCollaborateGiftingDownloadTimeOutToastSetting {
    public static final GiftCollaborateGiftingDownloadTimeOutToastSetting INSTANCE = new GiftCollaborateGiftingDownloadTimeOutToastSetting();
    public static final boolean DEFAULT = true;
    public static final boolean isEnabled = SettingsManager.INSTANCE.getBooleanValue("live_gift_collaborate_gifting_download_timeout_toast_setting", true);

    public final boolean isEnabled() {
        return isEnabled;
    }
}
