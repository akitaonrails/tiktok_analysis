package com.bytedance.android.livesdk.livesetting.decoration;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_sticker_audience_enable")
public final class StickerAudienceEnableSetting {
    public static final int DEFAULT = 0;
    public static final StickerAudienceEnableSetting INSTANCE = new StickerAudienceEnableSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_sticker_audience_enable", DEFAULT);
    }
}
