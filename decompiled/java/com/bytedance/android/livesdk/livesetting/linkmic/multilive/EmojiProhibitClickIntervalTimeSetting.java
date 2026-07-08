package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("emoji_prohibit_click_interval_time")
public final class EmojiProhibitClickIntervalTimeSetting {
    public static final int DEFAULT = 1000;
    public static final EmojiProhibitClickIntervalTimeSetting INSTANCE = new EmojiProhibitClickIntervalTimeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("emoji_prohibit_click_interval_time", DEFAULT);
    }
}
