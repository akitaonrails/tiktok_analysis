package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_rank_post_sticker_center_model_enable")
public final class LiveRankPostStickerCenterDataEnableSetting {
    public static final LiveRankPostStickerCenterDataEnableSetting INSTANCE = new LiveRankPostStickerCenterDataEnableSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_rank_post_sticker_center_model_enable", DEFAULT);
    }
}
