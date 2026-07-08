package com.bytedance.ies.ugc.aweme.rich.model.feed.model.search;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class AwemeSearchAdModel implements Serializable {

    @C09CT("learn_more_bg_color")
    public final String SearchAdTransformButtonColor;

    @C09CT("button_text")
    public final String SearchAdTransformButtonText;

    @C09CT("animation_type")
    public final Integer animationType;

    @C09CT("button_color_show_seconds")
    public final float buttonColorShowSeconds;

    @C09CT("carousel_product_info")
    public final List<Object> carouselProductInfo;

    @C09CT("enable_follow_button")
    public final Boolean enableSearchFollowBtn;

    @C09CT("auto_play")
    public final Boolean isAutoPlayEnable;

    @C09CT("is_ci_ad")
    public final Boolean isCiAd;

    @C09CT("is_horizontal")
    public final Boolean isHorizontal;

    @C09CT("is_precise_ad")
    public final Boolean isPreciseAd;

    @C09CT("mask_button_color")
    public final String maskBtnColor;

    @C09CT("out_anchor")
    public final SearchAdOutAnchor outAnchor;

    @C09CT("cta_position")
    public final Integer preciseAdCTAPosition;

    @C09CT("carousel_for_search")
    public final SearchAdProductCarousel productCarousel;

    @C09CT("products_info")
    public final List<Object> productsInfo;

    @C09CT("search_delivery_type")
    public final Integer searchDeliveryType;

    @C09CT("should_open_carousel_ad_detail")
    public final boolean shouldOpenCarouselAdDetail;

    @C09CT("show_button_seconds")
    public final float showButtonSeconds;

    @C09CT("show_mask_times")
    public final Integer showMaskTimes;

    @C09CT("button_color_show_seconds_single")
    public final Float singleBtnColorShowSeconds;

    @C09CT("watch_while_loading")
    public final SearchAdWatchWhileLoadingModel watchWhileLoading;

    public AwemeSearchAdModel() {
        this(Boolean.FALSE, 0, 0.0f, 0.0f, null, 2, null, Boolean.FALSE, Boolean.FALSE, 1, 1, Boolean.FALSE, Boolean.FALSE, null, Float.valueOf(0.0f), null, null, null, null, false, null);
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

    public final Boolean isPreciseAd() {
        return this.isPreciseAd;
    }

    public AwemeSearchAdModel(Boolean bool, Integer num, float f, float f2, String str, Integer num2, String str2, Boolean bool2, Boolean bool3, Integer num3, Integer num4, Boolean bool4, Boolean bool5, String str3, Float f3, SearchAdOutAnchor searchAdOutAnchor, SearchAdProductCarousel searchAdProductCarousel, List<Object> list, List<Object> list2, boolean z, SearchAdWatchWhileLoadingModel searchAdWatchWhileLoadingModel) {
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
    }
}
