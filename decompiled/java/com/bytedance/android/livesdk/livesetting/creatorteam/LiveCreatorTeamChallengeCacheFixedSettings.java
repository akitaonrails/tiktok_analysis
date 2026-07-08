package com.bytedance.android.livesdk.livesetting.creatorteam;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_creator_team_challenge_cache_fixed_switch")
public final class LiveCreatorTeamChallengeCacheFixedSettings {
    public static final boolean DEFAULT = true;
    public static final LiveCreatorTeamChallengeCacheFixedSettings INSTANCE = new LiveCreatorTeamChallengeCacheFixedSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_creator_team_challenge_cache_fixed_switch", DEFAULT);
    }
}
