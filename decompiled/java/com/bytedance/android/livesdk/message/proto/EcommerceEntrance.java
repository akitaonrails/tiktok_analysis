package com.bytedance.android.livesdk.message.proto;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class EcommerceEntrance {

    @C09CT("creator_type")
    public int creatorType;

    @C09CT("entrance_type")
    public int entranceType;

    @C09CT("schema")
    public String schema = "";

    @C09CT("shop_entrance_info")
    public ShopEntranceInfo shopEntranceInfo;

    @C09CT("showcase_entrance_info")
    public ShowcaseEntranceInfo showcaseEntranceInfo;

    @C09CT("view_version")
    public int viewVersion;

    /* JADX INFO: loaded from: classes.dex */
    public static final class SellingPoint {

        @C09CT("selling_point_type")
        public int sellingPointType;

        @C09CT("show_text")
        public String showText = "";
    }

    public static final class ShopEntranceInfo {

        @C09CT("exp_rate_percentile")
        public int expRatePercentile;

        @C09CT("rate_display_style")
        public int rateDisplayStyle;

        @C09CT("selling_point")
        public List<SellingPoint> sellingPoint;

        @C09CT("show_rate_not_applicable")
        public boolean showRateNotApplicable;

        @C09CT("sold_count")
        public long soldCount;

        @C09CT("store_label")
        public StoreLabel storeLabel;

        @C09CT("exp_rate_top_display")
        public String expRateTopDisplay = "";

        @C09CT("shop_id")
        public String shopId = "";

        @C09CT("shop_name")
        public String shopName = "";

        @C09CT("shop_rating")
        public String shopRating = "";

        @C09CT("format_sold_count")
        public String formatSoldCount = "";

        public static final class StoreLabel {

            @C09CT("is_bytemall")
            public boolean isBytemall;

            @C09CT("official_label")
            public StoreOfficialLabel officialLabel;

            @C09CT("shop_identity_label")
            public StoreIdentityLabel shopIdentityLabel;

            public static final class StoreIdentityLabel {

                @C09CT("identity_logo_dark")
                public ShopLabelImage identityLogoDark;

                @C09CT("identity_logo_light")
                public ShopLabelImage identityLogoLight;

                @C09CT("label_type")
                public int labelType;

                @C09CT("identity_label_text")
                public String identityLabelText = "";

                @C09CT("identity_label_bg_color_light")
                public String identityLabelBgColorLight = "";

                @C09CT("identity_label_bg_color_dark")
                public String identityLabelBgColorDark = "";

                @C09CT("identity_label_text_color_light")
                public String identityLabelTextColorLight = "";

                @C09CT("identity_label_text_color_dark")
                public String identityLabelTextColorDark = "";

                @C09CT("shop_explanation_page_schema")
                public String shopExplanationPageSchema = "";

                @C09CT("shop_identity_label_key")
                public String shopIdentityLabelKey = "";

                public static final class ShopLabelImage {

                    @C09CT("height")
                    public int height;

                    @C09CT("thumb_uri_list")
                    public List<String> thumbUriList;

                    @C09CT("url_list")
                    public List<String> urlList;

                    @C09CT("width")
                    public int width;

                    @C09CT("minetype")
                    public String minetype = "";

                    @C09CT("thumb_uri")
                    public String thumbUri = "";

                    @C09CT("uri")
                    public String uri = "";

                    @C09CT("color")
                    public String color = "";
                }
            }

            public static final class StoreOfficialLabel {

                @C09CT("label_image_dark")
                public ShopLabelImage labelImageDark;

                @C09CT("label_image_light")
                public ShopLabelImage labelImageLight;

                @C09CT("label_type")
                public int labelType;

                @C09CT("label_type_str")
                public String labelTypeStr = "";

                public static final class ShopLabelImage {

                    @C09CT("height")
                    public int height;

                    @C09CT("thumb_uri_list")
                    public List<String> thumbUriList;

                    @C09CT("url_list")
                    public List<String> urlList;

                    @C09CT("width")
                    public int width;

                    @C09CT("minetype")
                    public String minetype = "";

                    @C09CT("thumb_uri")
                    public String thumbUri = "";

                    @C09CT("uri")
                    public String uri = "";

                    @C09CT("color")
                    public String color = "";
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class ShowcaseEntranceInfo {

        @C09CT("creator_score_profile")
        public User.CreatorScoreProfile creatorScoreProfile;

        @C09CT("selling_point")
        public List<SellingPoint> sellingPoint;

        @C09CT("sold_count")
        public long soldCount;

        @C09CT("format_sold_count")
        public String formatSoldCount = "";

        @C09CT("showcase_name")
        public String showcaseName = "";
    }
}
