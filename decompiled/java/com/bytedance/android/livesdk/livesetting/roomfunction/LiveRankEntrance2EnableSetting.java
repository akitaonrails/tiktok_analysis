package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_entrance_rank_2_disable")
public final class LiveRankEntrance2EnableSetting {
    public static final LiveRankEntrance2EnableSetting INSTANCE = new LiveRankEntrance2EnableSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_entrance_rank_2_disable", true);

    public final boolean disable() {
        return value;
    }
}
