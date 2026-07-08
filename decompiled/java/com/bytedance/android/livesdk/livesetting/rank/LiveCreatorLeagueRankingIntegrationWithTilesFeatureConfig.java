package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CT;
import X.C1697810uHb;
import X.C20441214yg;
import X.C2188811AlT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_creator_league_ranking_integration_with_tiles_feature_opt")
public final class LiveCreatorLeagueRankingIntegrationWithTilesFeatureConfig {
    public static final Config DEFAULT;
    public static final LiveCreatorLeagueRankingIntegrationWithTilesFeatureConfig INSTANCE = new LiveCreatorLeagueRankingIntegrationWithTilesFeatureConfig();
    public static Config value;

    public static final class Config {
        public static final TypeAdapter ADAPTER = new LiveCreatorLeagueRankingIntegrationWithTilesFeatureConfig_Config_OptTypeAdapter(NormalGson.singleton());

        @C09CT("notice_close_frequency_control_in_seconds")
        public long noticeCloseFrequencyControlInSeconds;

        @C09CT("notice_opt")
        public boolean noticeOpt;

        @C09CT("notice_rank_type_check_opt")
        public boolean noticeRankTypeCheckOpt;

        @C09CT("notice_rank_type_list")
        public List<Integer> noticeRankTypeList;

        @C09CT("overall_opt")
        public boolean overallOpt;

        @C09CT("ranking_entrance_tiles_anim_opt")
        public boolean rankingEntranceTilesAnimOpt;

        @C09CT("ranking_page_bottom_bar_tiles_notice_opt")
        public boolean rankingPageBottomBarTilesNoticeOpt;

        @C09CT("ranking_page_tiles_service_opt")
        public boolean rankingPageTilesServiceOpt;

        @C09CT("ranking_tiles_page_opt")
        public boolean rankingTilesPageOpt;

        public Config() {
            this(false, false, false, false, new ArrayList(), 0L, false, false, false);
        }

        public Config(boolean z, boolean z2, boolean z3, boolean z4, List<Integer> list, long j, boolean z5, boolean z6, boolean z7) {
            this.overallOpt = z;
            this.rankingEntranceTilesAnimOpt = z2;
            this.noticeOpt = z3;
            this.noticeRankTypeCheckOpt = z4;
            this.noticeRankTypeList = list;
            this.noticeCloseFrequencyControlInSeconds = j;
            this.rankingPageTilesServiceOpt = z5;
            this.rankingPageBottomBarTilesNoticeOpt = z6;
            this.rankingTilesPageOpt = z7;
        }
    }

    static {
        Config config = new Config(false, true, true, true, C1697810uHb.LJIILJJIL(16), 86400L, true, true, true);
        DEFAULT = config;
        Config config2 = (Config) SettingsManager.INSTANCE.getValueSafely("live_creator_league_ranking_integration_with_tiles_feature_opt", config);
        if (config2 != null) {
            config = config2;
        }
        value = config;
    }

    public final long getNoticeCloseFrequencyControlInSeconds() {
        return value.noticeCloseFrequencyControlInSeconds;
    }

    public final boolean rankingEntranceTilesAnimOpt() {
        return value.rankingEntranceTilesAnimOpt;
    }

    public final boolean rankingPageBottomBarTilesNoticeOpt() {
        return LiveCreatorLeagueRankingIntegrationWithTilesSetting.INSTANCE.getValue() && value.rankingPageBottomBarTilesNoticeOpt;
    }

    public final boolean rankingPageTilesServiceOpt() {
        return LiveCreatorLeagueRankingIntegrationWithTilesSetting.INSTANCE.getValue() && value.rankingPageTilesServiceOpt;
    }

    public final boolean rankingTilesPageOpt() {
        return LiveCreatorLeagueRankingIntegrationWithTilesSetting.INSTANCE.getValue() && value.rankingTilesPageOpt;
    }

    public final boolean useNewNoticeContainer(int i) {
        String str;
        if (LiveCreatorLeagueUseNewNoticeContainerSetting.INSTANCE.getValue()) {
            return value.noticeRankTypeList.contains(Integer.valueOf(i));
        }
        if (LiveCreatorLeagueRankingIntegrationWithTilesSetting.INSTANCE.getValue() && value.noticeOpt) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("use ");
            Config config = value;
            if (config.noticeRankTypeCheckOpt && !config.noticeRankTypeList.contains(Integer.valueOf(i))) {
                str = "old";
            } else {
                str = "new";
            }
            sbLIZ.append(str);
            sbLIZ.append(" notice container");
            C20441214yg.LIZIZ("Creator League Ranking And Tiles", C2188811AlT.LIZIZ(sbLIZ));
            Config config2 = value;
            if (!config2.noticeRankTypeCheckOpt || config2.noticeRankTypeList.contains(Integer.valueOf(i))) {
                return true;
            }
            return false;
        }
        C20441214yg.LIZIZ("Creator League Ranking And Tiles", "use old notice container");
        return false;
    }
}
