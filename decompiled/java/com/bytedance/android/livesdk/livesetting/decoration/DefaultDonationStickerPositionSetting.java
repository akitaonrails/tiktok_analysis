package com.bytedance.android.livesdk.livesetting.decoration;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.live.model.DefaultDonationStickerPosition;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("default_donation_sticker_position")
public final class DefaultDonationStickerPositionSetting {
    public static final DefaultDonationStickerPositionSetting INSTANCE = new DefaultDonationStickerPositionSetting();
    public static final DefaultDonationStickerPosition DEFAULT = new DefaultDonationStickerPosition();

    public final DefaultDonationStickerPosition getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        DefaultDonationStickerPosition defaultDonationStickerPosition = DEFAULT;
        DefaultDonationStickerPosition defaultDonationStickerPosition2 = (DefaultDonationStickerPosition) settingsManager.getValueSafely("default_donation_sticker_position", defaultDonationStickerPosition);
        return defaultDonationStickerPosition2 != null ? defaultDonationStickerPosition2 : defaultDonationStickerPosition;
    }
}
