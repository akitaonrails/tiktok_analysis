package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_collaborate_gifting_download_timeout_mock_setting")
public final class GiftCollaborateGiftingDownloadTimeOutMockSetting {
    public static final boolean DEFAULT = false;
    public static final GiftCollaborateGiftingDownloadTimeOutMockSetting INSTANCE = new GiftCollaborateGiftingDownloadTimeOutMockSetting();
    public static final boolean MOCK = true;

    public static final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_gift_collaborate_gifting_download_timeout_mock_setting", DEFAULT);
    }
}
