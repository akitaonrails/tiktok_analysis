package com.bytedance.android.livesdk.livesetting.liveevent;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_event_countdown_sticker_title_enable")
public final class LiveEventCountdownStickerTitleEnableSetting {
    public static final boolean DEFAULT = false;
    public static final LiveEventCountdownStickerTitleEnableSetting INSTANCE = new LiveEventCountdownStickerTitleEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_event_countdown_sticker_title_enable", DEFAULT);
    }
}
