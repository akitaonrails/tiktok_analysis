package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftOperation;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class GiftPage {

    @C09CT("backfill_gifts")
    public List<Gift> backfillGifts;

    @C09CT("client_can_reorder")
    public boolean clientCanReorder;

    @C09CT("display")
    public boolean display;

    @C09CT("event_name")
    public String eventName;

    @C09CT("favourite_gifts")
    public List<Gift> favouriteGifts;

    @C09CT("force_insert_metrics")
    public Map<Long, ForceInsertMetricsItem> forceInsertMetrics;

    @C09CT("force_insert_priority_map")
    public Map<Long, Long> forceInsertPriorityMap;

    @C09CT("frequently_used_gifts")
    public List<Gift> frequentlyUsedGifts;

    @C09CT("gift_dynamic_fields")
    public List<GiftDynamicField> giftDynamicFields;

    @C09CT("gifts")
    public List<Gift> gifts;

    @C09CT("groups_in_tab")
    public List<GiftGroupInTab> groupsInTab;

    @C09CT("match_game_gifts")
    public List<Gift> matchGameGifts;

    @C09CT("page_operation")
    public GiftOperation operation;

    @C09CT("page_name")
    public String pageName;

    @C09CT("page_instruction")
    public GiftPanelBanner pagePanelBanner;

    @C09CT("page_type")
    public int pageType;

    @C09CT("region")
    public String region;

    @C09CT("use_backfill_special_text")
    public boolean useBackfillSpecialText;

    public static final class GiftDynamicField {

        @C09CT("can_put_in_gift_box")
        public boolean canPutInGiftBox;

        @C09CT("gift_panel_banner")
        public GiftPanelBanner giftPanelBanner;

        @C09CT("gift_rank_recommend_info")
        public String giftRankRecommendInfo = "";

        @C09CT("gift_sponsor_info")
        public GiftSponsorInfo giftSponsorInfo;

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public long id;

        @C09CT("is_displayed_on_panel")
        public boolean isDisplayedOnPanel;

        public static final class GiftPanelBanner {

            @C09CT("banner_priority")
            public int bannerPriority;

            @C09CT("bg_color_values")
            public List<String> bgColorValues;

            @C09CT("bg_image")
            public ImageModel bgImage;

            @C09CT("display_text")
            public Text displayText;

            @C09CT("left_icon")
            public ImageModel leftIcon;

            @C09CT("schema_url")
            public String schemaUrl = "";

            @C09CT("banner_lynx_url")
            public String bannerLynxUrl = "";

            @C09CT("banner_lynx_extra")
            public String bannerLynxExtra = "";
        }

        public static final class GiftSponsorInfo {

            @C09CT("can_sponsor")
            public boolean canSponsor;

            @C09CT("current_count")
            public long currentCount;

            @C09CT("left_count_to_sponsor")
            public long leftCountToSponsor;

            @C09CT("sponsor_count")
            public long sponsorCount;

            @C09CT("sponsor_id")
            public long sponsorId;
        }
    }

    public static final class GiftGroupInTab {

        @C09CT("description")
        public Text description;

        @C09CT("group_in_tab")
        public int groupInTab;

        @C09CT("title")
        public Text title;
    }
}
