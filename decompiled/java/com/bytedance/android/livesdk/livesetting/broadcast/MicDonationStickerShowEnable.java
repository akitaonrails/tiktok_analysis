package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("ttlive_mic_shield_donation_sticker")
public final class MicDonationStickerShowEnable {
    public static final boolean DEFAULT = true;
    public static final MicDonationStickerShowEnable INSTANCE = new MicDonationStickerShowEnable();

    public final boolean inExp() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_mic_shield_donation_sticker", DEFAULT);
    }
}
