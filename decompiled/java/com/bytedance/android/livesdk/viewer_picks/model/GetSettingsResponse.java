package com.bytedance.android.livesdk.viewer_picks.model;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GetSettingsResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("active_in_music_campaign")
        public boolean activeInMusicCampaign;

        @C09CT("auto_start")
        public boolean autoStart;

        @C09CT("display_mode")
        public int displayMode;

        @C09CT("enable_auto_restart")
        public boolean enableAutoRestart;

        @C09CT("extra")
        public ProfileExtra extra;

        @C09CT("has_duration")
        public boolean hasDuration;

        @C09CT("has_score")
        public boolean hasScore;

        @C09CT("imported_template_id")
        public long importedTemplateId;

        @C09CT("is_default_settings")
        public boolean isDefaultSettings;

        @C09CT("music_campaign_ended")
        public boolean musicCampaignEnded;

        @C09CT("platform_config")
        public PlatformConfig platformConfig;

        @C09CT("round_duration_sec")
        public long roundDurationSec;

        @C09CT(Scene.SCENE_SERVICE)
        public int scene;

        @C09CT("taxonomy_tag_info")
        public TaxonomyTagInfo taxonomyTagInfo;

        @C09CT("template_banner_config")
        public TemplateBannerConfig templateBannerConfig;

        @C09CT("gift_pick_list")
        public List<GiftPickWithStatus> giftPickList = new ArrayList();

        @C09CT("campaign_info")
        public String campaignInfo = "";

        @C09CT("setting_name")
        public String settingName = "";

        @C09CT("imported_template_name")
        public String importedTemplateName = "";

        /* JADX INFO: loaded from: classes34.dex */
        public static final class PlatformConfig {

            @C09CT("max_gift_picks_count")
            public long maxGiftPicksCount;

            @C09CT("recommend_priority_request_gift_price")
            public long recommendPriorityRequestGiftPrice;

            @C09CT("recommended_performance_names")
            public List<String> recommendedPerformanceNames = new ArrayList();

            @C09CT("recommended_priority_request_gift_id")
            public long recommendedPriorityRequestGiftId;
        }

        public static final class TaxonomyTagInfo {

            @C09CT("level1_tag")
            public List<String> level1Tag = new ArrayList();

            @C09CT("level2_tag")
            public String level2Tag = "";
        }

        public static final class TemplateBannerConfig {

            @C09CT("template_id")
            public long templateId;

            @C09CT("icon_url")
            public String iconUrl = "";

            @C09CT("text")
            public String text = "";
        }
    }
}
