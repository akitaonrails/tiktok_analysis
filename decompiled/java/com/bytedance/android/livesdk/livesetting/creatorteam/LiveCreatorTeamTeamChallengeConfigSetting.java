package com.bytedance.android.livesdk.livesetting.creatorteam;

import X.C09CT;
import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("creator_team_team_challenge_config")
public final class LiveCreatorTeamTeamChallengeConfigSetting {
    public static final LiveCreatorTeamTeamChallengeConfigSetting INSTANCE = new LiveCreatorTeamTeamChallengeConfigSetting();
    public static final LiveChallengeConfig DEFAULT = new LiveChallengeConfig();

    public static final class LiveChallengeConfig {
        public static final TypeAdapter ADAPTER = new LiveCreatorTeamTeamChallengeConfigSetting_LiveChallengeConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("live_team_challenge_room_cache_size")
        public int teamChallengeRoomSize = 70;

        @C09CT("live_team_challenge_gift_list")
        public List<Long> teamGiftList = C1697810uHb.LJIILJJIL(12357L, 12356L, 12355L);
    }

    public static final LiveChallengeConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveChallengeConfig liveChallengeConfig = DEFAULT;
        LiveChallengeConfig liveChallengeConfig2 = (LiveChallengeConfig) settingsManager.getValueSafely("creator_team_team_challenge_config", liveChallengeConfig);
        return liveChallengeConfig2 != null ? liveChallengeConfig2 : liveChallengeConfig;
    }

    public final LiveChallengeConfig getDEFAULT() {
        return DEFAULT;
    }
}
