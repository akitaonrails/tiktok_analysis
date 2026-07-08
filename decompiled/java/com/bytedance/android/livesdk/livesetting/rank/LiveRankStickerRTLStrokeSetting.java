package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_rank_sticker_rtl_stroke_setting")
public final class LiveRankStickerRTLStrokeSetting {
    public static final LiveRankStickerRTLStrokeSetting INSTANCE = new LiveRankStickerRTLStrokeSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_rank_sticker_rtl_stroke_setting", DEFAULT);
    }
}
