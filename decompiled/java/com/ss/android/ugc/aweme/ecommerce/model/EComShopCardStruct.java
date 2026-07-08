package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class EComShopCardStruct {

    @C09CT("address_card_product")
    public List<AddressCardProducts> addressCardProduct;

    @C09CT("ad_struct")
    public final AwemeRawAd awemeRawAd;

    @C09CT("blue_v")
    public final Boolean blueV;

    @C09CT("brand_info")
    public final ShopBrandInfo brandInfo;

    @C09CT("doc_id")
    public String docId;

    @C09CT("is_official")
    public Boolean isOfficial;

    @C09CT("is_precision_search")
    public final Boolean isPrecisionSearch;

    @C09CT("live_entity")
    public Aweme liveEntity;

    @C09CT("live_schema")
    public String liveSchema;

    @C09CT("live_title")
    public String liveTitle;

    @C09CT("live_usercount_formatted")
    public String liveUserCountFormatted;

    @C09CT("oec_user_id")
    public String oecUserId;

    @C09CT("official_creator")
    public OfficialCreatorInfo officialCreator;

    @C09CT("product_source")
    public Integer productSource;

    @C09CT("products")
    public List<AddressCardProducts> products;

    @C09CT("profile_schema")
    public String profileSchema;

    @C09CT("room_id")
    public String roomId;

    @C09CT("shop_avatar_url")
    public String shopAvatarUrl;

    @C09CT("shop_card_common_style")
    public final Integer shopCardCommonStyle;

    @C09CT("shop_card_live_style")
    public final Integer shopCardLiveStyle;

    @C09CT("shop_card_category")
    public final List<ShopCardCategory> shopCategories;

    @C09CT("shop_exp_rate_percentile")
    public String shopExpRatePercentile;

    @C09CT("shop_exp_rate_top_display")
    public String shopExpRateTopDisplay;

    @C09CT("shop_id")
    public String shopId;

    @C09CT("shop_labels")
    public List<EComShopLabel> shopLabels;

    @C09CT("shop_name")
    public String shopName;

    @C09CT("shop_now")
    public final Long shopNowNum;

    @C09CT("shop_product_count")
    public Integer shopProductCount;

    @C09CT("shop_rate_display_style")
    public String shopRateDisplayStyle;

    @C09CT("shop_rating")
    public String shopRating;

    @C09CT("shop_review_count")
    public final String shopReviewCount;

    @C09CT("shop_schema")
    public String shopSchema;

    @C09CT("shop_show_rate_not_applicable")
    public Boolean shopShowRateNotApplicable;

    @C09CT("shop_tags")
    public List<EComShopLabel> shopTags;

    @C09CT("showcase_schema")
    public String showcaseSchema;

    @C09CT("starling_to_translated")
    public List<EComAddressCardStarlingToTranslated> starlingToTranslated;

    @C09CT("user_id")
    public String userId;

    @C09CT("user_info")
    public User userInfo;
}
