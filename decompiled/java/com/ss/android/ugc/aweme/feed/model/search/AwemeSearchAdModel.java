package com.ss.android.ugc.aweme.feed.model.search;

import X.C09CT;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class AwemeSearchAdModel implements Serializable {

    @C09CT("learn_more_bg_color")
    public final String SearchAdTransformButtonColor;

    @C09CT("button_text")
    public final String SearchAdTransformButtonText;

    @C09CT("ad_link_icon_style")
    public final Integer adLinkIconStyle;

    @C09CT("open_full_pdp_ad")
    public final Integer adPdpFullModeType;

    @C09CT("ec_pdp_sv_visibility_ad")
    public final Integer adPdpVideoShrinkType;

    @C09CT("animation_type")
    public final Integer animationType;

    @C09CT("auto_open_pdp_inflow")
    public final Boolean autoOpenPdpInflow;

    @C09CT("brand_safety_post_ids")
    public final List<String> brandSafetyPostIds;

    @C09CT("brand_safety_post_types")
    public final List<String> brandSafetyPostTypes;

    @C09CT("button_color_show_seconds")
    public final float buttonColorShowSeconds;

    @C09CT("can_show_in_detail_page")
    public final Boolean canShowInDetailPage;

    @C09CT("carousel_bg_style")
    public final Integer carouselBgStyle;

    @C09CT("carousel_product_info")
    public final List<SearchCarouselAdsProductInfo> carouselProductInfo;

    @C09CT("chain_param")
    public final Map<String, String> chainParamMap;

    @C09CT("display_type")
    public final Integer displayType;

    @C09CT("enable_follow_button")
    public final Boolean enableSearchFollowBtn;
    public Integer feedType;

    @C09CT("hybrid_card")
    public final SearchAdHybridModel hybridModel;

    @C09CT("auto_play")
    public final Boolean isAutoPlayEnable;

    @C09CT("is_ci_ad")
    public final Boolean isCiAd;

    @C09CT("is_horizontal")
    public final Boolean isHorizontal;

    @C09CT("is_mse_format")
    public final Boolean isMSEAd;

    @C09CT("is_precise_ad")
    public final Boolean isPreciseAd;

    @C09CT("is_v2l_with_product")
    public final Boolean isV2LWithProduct;

    @C09CT("mask_button_color")
    public final String maskBtnColor;

    @C09CT("mixed_creative_info")
    public final MixedCreativeCardStruct mixedCreativeCard;

    @C09CT("ole_pac_mixed_creative_info")
    public final OLEPACStruct olePACInfo;

    @C09CT("open_lp_playtime_threshold")
    public final long openLpPlaytimeThreshold;

    @C09CT("out_anchor")
    public final SearchAdOutAnchor outAnchor;

    @C09CT("out_label_text")
    public final String outLabelText;

    @C09CT("play_music_mode")
    public final Integer playMusicMode;

    @C09CT("cta_position")
    public final Integer preciseAdCTAPosition;

    @C09CT("carousel_for_search")
    public final SearchAdProductCarousel productCarousel;

    @C09CT("products_info")
    public final List<Product> productsInfo;
    public SearchAdPromotionAnchorInfo promotionAnchorInfo;
    public String searchAdCacheKey;

    @C09CT("search_ad_live_click_delay_time")
    public final Long searchAdLiveClickDelayTime;

    @C09CT("search_delivery_type")
    public final Integer searchDeliveryType;

    @C09CT("search_format_type")
    public final Integer searchFormatType;
    public String searchItemId;

    @C09CT("should_open_carousel_ad_detail")
    public final boolean shouldOpenCarouselAdDetail;

    @C09CT("should_track_stay_duration")
    public final Boolean shouldTrackStayDuration;

    @C09CT("show_button_seconds")
    public final float showButtonSeconds;

    @C09CT("show_mask_times")
    public final Integer showMaskTimes;

    @C09CT("button_color_show_seconds_single")
    public final Float singleBtnColorShowSeconds;

    @C09CT("watch_while_loading")
    public final SearchAdWatchWhileLoadingModel watchWhileLoading;

    public AwemeSearchAdModel() {
        this(Boolean.FALSE, 0, 0.0f, 0.0f, null, 2, null, Boolean.FALSE, Boolean.FALSE, 1, 1, Boolean.FALSE, Boolean.FALSE, null, Float.valueOf(0.0f), null, null, null, null, false, null, 0, 0, null, null, 0, 0L, null, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, null, null, Boolean.FALSE, null, null, null, Boolean.FALSE, null, null, null, null, null, null, null, new SearchAdPromotionAnchorInfo());
    }

    public final String getSearchAdTransformButtonColor() {
        return this.SearchAdTransformButtonColor;
    }

    public final String getSearchAdTransformButtonText() {
        return this.SearchAdTransformButtonText;
    }

    public final Boolean isAutoPlayEnable() {
        return this.isAutoPlayEnable;
    }

    public final Boolean isCiAd() {
        return this.isCiAd;
    }

    public final Boolean isHorizontal() {
        return this.isHorizontal;
    }

    public final Boolean isMSEAd() {
        return this.isMSEAd;
    }

    public final Boolean isPreciseAd() {
        return this.isPreciseAd;
    }

    public final Boolean isV2LWithProduct() {
        return this.isV2LWithProduct;
    }

    public final void setFeedType(Integer num) {
        this.feedType = num;
    }

    public final void setPromotionAnchorInfo(SearchAdPromotionAnchorInfo searchAdPromotionAnchorInfo) {
        this.promotionAnchorInfo = searchAdPromotionAnchorInfo;
    }

    public final void setSearchAdCacheKey(String str) {
        this.searchAdCacheKey = str;
    }

    public final void setSearchItemId(String str) {
        this.searchItemId = str;
    }

    public AwemeSearchAdModel(Boolean bool, Integer num, float f, float f2, String str, Integer num2, String str2, Boolean bool2, Boolean bool3, Integer num3, Integer num4, Boolean bool4, Boolean bool5, String str3, Float f3, SearchAdOutAnchor searchAdOutAnchor, SearchAdProductCarousel searchAdProductCarousel, List<Product> list, List<SearchCarouselAdsProductInfo> list2, boolean z, SearchAdWatchWhileLoadingModel searchAdWatchWhileLoadingModel, Integer num5, Integer num6, List<String> list3, List<String> list4, Integer num7, long j, SearchAdHybridModel searchAdHybridModel, Boolean bool6, Boolean bool7, Boolean bool8, Map<String, String> map, MixedCreativeCardStruct mixedCreativeCardStruct, Boolean bool9, Long l, Integer num8, Integer num9, Boolean bool10, Integer num10, String str4, OLEPACStruct oLEPACStruct, Integer num11, Integer num12, String str5, String str6, SearchAdPromotionAnchorInfo searchAdPromotionAnchorInfo) {
        this.isAutoPlayEnable = bool;
        this.animationType = num;
        this.showButtonSeconds = f;
        this.buttonColorShowSeconds = f2;
        this.SearchAdTransformButtonColor = str;
        this.showMaskTimes = num2;
        this.SearchAdTransformButtonText = str2;
        this.isPreciseAd = bool2;
        this.isHorizontal = bool3;
        this.preciseAdCTAPosition = num3;
        this.searchDeliveryType = num4;
        this.isCiAd = bool4;
        this.enableSearchFollowBtn = bool5;
        this.maskBtnColor = str3;
        this.singleBtnColorShowSeconds = f3;
        this.outAnchor = searchAdOutAnchor;
        this.productCarousel = searchAdProductCarousel;
        this.productsInfo = list;
        this.carouselProductInfo = list2;
        this.shouldOpenCarouselAdDetail = z;
        this.watchWhileLoading = searchAdWatchWhileLoadingModel;
        this.searchFormatType = num5;
        this.displayType = num6;
        this.brandSafetyPostIds = list3;
        this.brandSafetyPostTypes = list4;
        this.adLinkIconStyle = num7;
        this.openLpPlaytimeThreshold = j;
        this.hybridModel = searchAdHybridModel;
        this.canShowInDetailPage = bool6;
        this.autoOpenPdpInflow = bool7;
        this.isV2LWithProduct = bool8;
        this.chainParamMap = map;
        this.mixedCreativeCard = mixedCreativeCardStruct;
        this.shouldTrackStayDuration = bool9;
        this.searchAdLiveClickDelayTime = l;
        this.adPdpVideoShrinkType = num8;
        this.adPdpFullModeType = num9;
        this.isMSEAd = bool10;
        this.playMusicMode = num10;
        this.outLabelText = str4;
        this.olePACInfo = oLEPACStruct;
        this.carouselBgStyle = num11;
        this.feedType = num12;
        this.searchItemId = str5;
        this.searchAdCacheKey = str6;
        this.promotionAnchorInfo = searchAdPromotionAnchorInfo;
    }
}
