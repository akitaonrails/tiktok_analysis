package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftGalleryEntranceResponse {

    @C09CT("data")
    public Data data;

    @C09CT("extra")
    public Extra extra;

    public static final class Data {

        @C09CT("all_sponsored")
        public boolean allSponsored;

        @C09CT("is_anchor_qualified")
        public boolean isAnchorQualified;

        @C09CT("lighted_gift_count")
        public long lightedGiftCount;

        @C09CT("period")
        public long period;

        @C09CT("play_entrance_effect")
        public boolean playEntranceEffect;

        @C09CT("style_info")
        public StyleInfo styleInfo;

        @C09CT("tag_info")
        public TagInfo tagInfo;

        @C09CT("total_gift_count")
        public long totalGiftCount;

        @C09CT("v23_style")
        public boolean v23Style;

        @C09CT("vault_info")
        public VaultInfo vaultInfo;

        @C09CT("gift_icon")
        public List<GiftIcon> giftIcon = new ArrayList();

        @C09CT("gift_gallery_main_page_scheme_url")
        public String giftGalleryMainPageSchemeUrl = "";

        @C09CT("anchor_ranking_league")
        public String anchorRankingLeague = "";

        @C09CT("gallery_ranking_league")
        public String galleryRankingLeague = "";

        public static final class AllLitBadge {

            @C09CT("background_color")
            public String backgroundColor = "";

            @C09CT("display_text")
            public GalleryEntranceDisplayText displayText;
        }

        public static final class GiftIcon {

            @C09CT("gift_id")
            public long giftId;

            @C09CT("icon_url")
            public String iconUrl = "";

            @C09CT("is_gray")
            public boolean isGray;
        }

        public static final class StyleInfo {

            @C09CT("all_lit_badge")
            public AllLitBadge allLitBadge;

            @C09CT("league_title")
            public GalleryEntranceDisplayText leagueTitle;

            @C09CT("gift_gallery_icon_url")
            public String giftGalleryIconUrl = "";

            @C09CT("background_color")
            public String backgroundColor = "";

            @C09CT("tint_color")
            public List<String> tintColor = new ArrayList();

            @C09CT("progress_bar_no_fill_color")
            public String progressBarNoFillColor = "";

            @C09CT("border_color")
            public String borderColor = "";
        }

        public static final class TagInfo {

            @C09CT("background_color")
            public String backgroundColor = "";

            @C09CT("border_argb")
            public String borderArgb = "";

            @C09CT("icon_url")
            public String iconUrl = "";

            @C09CT("text")
            public String text = "";

            @C09CT("text_color")
            public String textColor = "";
        }

        public static final class VaultInfo {

            @C09CT("end_time_s")
            public long endTimeS;

            @C09CT("premium_shop_id")
            public long premiumShopId;

            @C09CT("start_time_s")
            public long startTimeS;
        }
    }

    public static final class Extra {

        @C09CT("log_id")
        public String logId = "";
    }
}
