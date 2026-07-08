package com.bytedance.android.livesdk.livesetting.liveevent;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_event_countdown_sticker_enable")
public final class LiveEventCountdownStickerEnableSetting {
    public static final boolean DEFAULT = false;
    public static final LiveEventCountdownStickerEnableSetting INSTANCE = new LiveEventCountdownStickerEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_event_countdown_sticker_enable", DEFAULT);
    }
}
