package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_creator_league_match_campaign_ranking_setting")
public final class LiveCreatorLeagueMatchCampaignRankingSetting {
    public static final LiveCreatorLeagueMatchCampaignRankingSetting INSTANCE = new LiveCreatorLeagueMatchCampaignRankingSetting();
    public static final Config DEFAULT = new Config(true, true, true, true, true, true);

    public final Config getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Config config = DEFAULT;
        Config config2 = (Config) settingsManager.getValueSafely("live_creator_league_match_campaign_ranking_setting", config);
        return config2 != null ? config2 : config;
    }

    public static final class Config {
        public static final TypeAdapter ADAPTER = new LiveCreatorLeagueMatchCampaignRankingSetting_Config_OptTypeAdapter(NormalGson.singleton());

        @C09CT("campaign_banner_init_data_handling_opt")
        public boolean campaignBannerInitDataHandlingOpt;

        @C09CT("campaign_banner_update_opt")
        public boolean campaignBannerUpdateOpt;

        @C09CT("creator_ranking_page_banner_icon_loading_opt")
        public boolean creatorRankingPageBannerIconLoadingOpt;

        @C09CT("creator_ranking_page_banner_layout_adaption_opt")
        public boolean creatorRankingPageBannerLayoutAdaptionOpt;

        @C09CT("creator_ranking_page_creator_labels_opt")
        public boolean creatorRankingPageCreatorLabelsOpt;

        @C09CT("creator_ranking_page_first_tab_style_adaption_opt")
        public boolean creatorRankingPageFirstTabStyleAdaptionOpt;

        public Config() {
            this(true, true, true, true, true, true);
        }

        public Config(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
            this.creatorRankingPageFirstTabStyleAdaptionOpt = z;
            this.creatorRankingPageBannerIconLoadingOpt = z2;
            this.creatorRankingPageBannerLayoutAdaptionOpt = z3;
            this.campaignBannerUpdateOpt = z4;
            this.campaignBannerInitDataHandlingOpt = z5;
            this.creatorRankingPageCreatorLabelsOpt = z6;
        }
    }
}
