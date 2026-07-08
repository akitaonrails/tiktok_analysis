package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_music_gift_enable")
public final class LiveGiftMusicSetting {
    public static final boolean DEFAULT = false;
    public static final LiveGiftMusicSetting INSTANCE = new LiveGiftMusicSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_music_gift_enable", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
