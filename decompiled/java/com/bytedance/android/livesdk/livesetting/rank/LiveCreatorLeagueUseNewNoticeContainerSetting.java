package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_creator_league_ranking_use_new_notice_container")
public final class LiveCreatorLeagueUseNewNoticeContainerSetting {
    public static final LiveCreatorLeagueUseNewNoticeContainerSetting INSTANCE = new LiveCreatorLeagueUseNewNoticeContainerSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_creator_league_ranking_use_new_notice_container", DEFAULT);
    }
}
