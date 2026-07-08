package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_rank_entrance_click_trigger_refresh")
public final class LiveRankEntranceClickTriggerRefreshSetting {
    public static final LiveRankEntranceClickTriggerRefreshSetting INSTANCE = new LiveRankEntranceClickTriggerRefreshSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_rank_entrance_click_trigger_refresh", DEFAULT);
    }
}
