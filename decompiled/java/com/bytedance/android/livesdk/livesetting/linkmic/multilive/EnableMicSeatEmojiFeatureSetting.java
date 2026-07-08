package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("enable_mic_seat_emoji_feature")
public final class EnableMicSeatEmojiFeatureSetting {
    public static final int DEFAULT = 0;
    public static final EnableMicSeatEmojiFeatureSetting INSTANCE = new EnableMicSeatEmojiFeatureSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("enable_mic_seat_emoji_feature", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
