package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("gift_guide_game_link_mic_mutex_enable")
public final class GiftGuideGameLinkMicMutexSetting {
    public static final boolean DEFAULT = true;
    public static final GiftGuideGameLinkMicMutexSetting INSTANCE = new GiftGuideGameLinkMicMutexSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("gift_guide_game_link_mic_mutex_enable", DEFAULT);
    }
}
