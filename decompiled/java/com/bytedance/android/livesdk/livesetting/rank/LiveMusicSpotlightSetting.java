package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.rank.model.RankUserAnchorCertificationInfo;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_music_spotlight_setting")
public final class LiveMusicSpotlightSetting {
    public static RankUserAnchorCertificationInfo certificationInfo;
    public static boolean isCreator;
    public static final LiveMusicSpotlightSetting INSTANCE = new LiveMusicSpotlightSetting();
    public static final Config DEFAULT = new Config(false, 3);

    private final Config getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Config config = DEFAULT;
        Config config2 = (Config) settingsManager.getValueSafely("live_music_spotlight_setting", config);
        return config2 != null ? config2 : config;
    }

    private final boolean isMusicLoverCreator() {
        RankUserAnchorCertificationInfo rankUserAnchorCertificationInfo = certificationInfo;
        return rankUserAnchorCertificationInfo != null && rankUserAnchorCertificationInfo.anchorCertificationType == 1 && rankUserAnchorCertificationInfo.anchorCertificationLevel == 1000;
    }

    private final boolean isMusicProCreator() {
        RankUserAnchorCertificationInfo rankUserAnchorCertificationInfo = certificationInfo;
        return rankUserAnchorCertificationInfo != null && rankUserAnchorCertificationInfo.anchorCertificationType == 1 && rankUserAnchorCertificationInfo.anchorCertificationLevel == 3000;
    }

    private final boolean isMusicSeedCreator() {
        RankUserAnchorCertificationInfo rankUserAnchorCertificationInfo = certificationInfo;
        return rankUserAnchorCertificationInfo != null && rankUserAnchorCertificationInfo.anchorCertificationType == 1 && rankUserAnchorCertificationInfo.anchorCertificationLevel <= 1 && rankUserAnchorCertificationInfo != null && rankUserAnchorCertificationInfo.isSeedFromDw;
    }

    private final boolean isMusicTalentCreator() {
        RankUserAnchorCertificationInfo rankUserAnchorCertificationInfo = certificationInfo;
        return rankUserAnchorCertificationInfo != null && rankUserAnchorCertificationInfo.anchorCertificationType == 1 && rankUserAnchorCertificationInfo.anchorCertificationLevel == 2000;
    }

    public final int availableRankingsUpperLimit() {
        if (!isCreator || getValue().isMusicSpotlightEnabled) {
            return getValue().availableRankingsUpperLimit;
        }
        return 2;
    }

    public final boolean isMusicSpotlightEnabled() {
        return isCreator || getValue().isMusicSpotlightEnabled;
    }

    public final String getCreatorTypeName() {
        if (!isMusicSpotlightEnabled()) {
            return null;
        }
        if (isMusicProCreator()) {
            return "music_pro";
        }
        if (isMusicTalentCreator()) {
            return "music_talent";
        }
        if (isMusicLoverCreator()) {
            return "music_lover";
        }
        if (isMusicSeedCreator()) {
            return "music_other";
        }
        return null;
    }

    public static final class Config {
        public static final TypeAdapter ADAPTER = new LiveMusicSpotlightSetting_Config_OptTypeAdapter(NormalGson.singleton());

        @C09CT("available_rankings_upper_limit")
        public int availableRankingsUpperLimit;

        @C09CT("is_music_spotlight_enabled")
        public boolean isMusicSpotlightEnabled;

        public Config() {
            this(false, 3);
        }

        public Config(boolean z, int i) {
            this.isMusicSpotlightEnabled = z;
            this.availableRankingsUpperLimit = i;
        }
    }

    public final void updateMusicTalentCreatorStatus(boolean z, RankUserAnchorCertificationInfo rankUserAnchorCertificationInfo) {
        isCreator = z;
        certificationInfo = rankUserAnchorCertificationInfo;
    }
}
