package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_sticker_gift_timeout_duration")
public final class StickerGiftTimeoutSettings {
    public static final StickerGiftTimeoutSettings INSTANCE = new StickerGiftTimeoutSettings();
    public static final long DEFAULT = 30000;

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_sticker_gift_timeout_duration", DEFAULT);
    }
}
