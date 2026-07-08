package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_rank_bottom_show_arrow")
public final class LiveRankBottomShowArrowSetting {
    public static final LiveRankBottomShowArrowSetting INSTANCE = new LiveRankBottomShowArrowSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_rank_bottom_show_arrow", DEFAULT);
    }
}
