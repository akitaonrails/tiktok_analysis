package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_fans_club_customized_sticker_first")
public final class LiveFansClubCustomizedStickerFirstSetting {
    public static final boolean DEFAULT = true;
    public static final LiveFansClubCustomizedStickerFirstSetting INSTANCE = new LiveFansClubCustomizedStickerFirstSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fans_club_customized_sticker_first", DEFAULT);
    }
}
