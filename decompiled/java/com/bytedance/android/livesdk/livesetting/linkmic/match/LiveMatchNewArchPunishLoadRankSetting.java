package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_match_new_arch_punish_load_rank_setting")
public final class LiveMatchNewArchPunishLoadRankSetting {
    public static final boolean DEFAULT = true;
    public static final LiveMatchNewArchPunishLoadRankSetting INSTANCE = new LiveMatchNewArchPunishLoadRankSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_new_arch_punish_load_rank_setting", DEFAULT);
    }
}
