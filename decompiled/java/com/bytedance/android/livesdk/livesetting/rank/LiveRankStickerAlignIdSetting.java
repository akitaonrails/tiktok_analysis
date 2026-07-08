package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_rank_sticker_generate_id")
public final class LiveRankStickerAlignIdSetting {
    public static final LiveRankStickerAlignIdSetting INSTANCE = new LiveRankStickerAlignIdSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_rank_sticker_generate_id", DEFAULT);
    }
}
