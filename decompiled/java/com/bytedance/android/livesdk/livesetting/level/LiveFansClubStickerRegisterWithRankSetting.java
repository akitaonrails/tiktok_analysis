package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_fans_club_sticker_register_with_rank")
public final class LiveFansClubStickerRegisterWithRankSetting {
    public static final boolean DEFAULT = true;
    public static final LiveFansClubStickerRegisterWithRankSetting INSTANCE = new LiveFansClubStickerRegisterWithRankSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fans_club_sticker_register_with_rank", DEFAULT);
    }
}
