package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_fans_club_stickers_parse")
public final class LiveFansClubStickerParseSetting {
    public static final boolean DEFAULT = false;
    public static final LiveFansClubStickerParseSetting INSTANCE = new LiveFansClubStickerParseSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fans_club_stickers_parse", DEFAULT);
    }
}
