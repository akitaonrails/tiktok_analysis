package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_rank_sticker_center_model_filter")
public final class LiveRankStickerCenterFilterSetting {
    public static final LiveRankStickerCenterFilterSetting INSTANCE = new LiveRankStickerCenterFilterSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_rank_sticker_center_model_filter", DEFAULT);
    }
}
