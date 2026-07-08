package com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean.ProductCategory;
import com.ss.android.ugc.aweme.ecommerce.ug.common.model.DiversionImage;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class DiversionEntranceResCfg {

    @C09CT("avoid_ad_video")
    public final Boolean avoidAdVideo;

    @C09CT("avoid_search_suggest_word")
    public final Boolean avoidSearchSugWord;

    @C09CT("bg_dark")
    public final Boolean bgDark;

    @C09CT("button_image")
    public final String buttonImage;

    @C09CT("shop_now_text")
    public final String buttonText;

    @C09CT("da_params")
    public final Map<String, Object> daParams;

    @C09CT("duration")
    public final Long duration;

    @C09CT("find_more_text")
    public final String guideText;

    @C09CT("find_more_text_en")
    public final String guideTextEn;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("image")
    public final DiversionImage image;

    @C09CT("in_cart_feed_video_guide_type")
    public final Integer inCartFeedVideoGuideType;

    @C09CT("mall_landing_page")
    public final String mallLandingPage;

    @C09CT("no_cart_feed_video_guide_type")
    public final Integer noCartFeedVideoGuideType;

    @C09CT("pid_to_category")
    public final Map<String, ProductCategory> productCategory;

    @C09CT("fallback_reddot")
    public final CountCfg redDot;

    @C09CT("schema")
    public final String schema;

    @C09CT("scroll_text")
    public final String scrollText;

    @C09CT("shop_tab_bubble_style")
    public final Integer shopTabBubbleStyle;

    @C09CT("show_arrow")
    public final Boolean showArrow;

    @C09CT("show_product_images")
    public final Boolean showProductImages;

    @C09CT("text")
    public final String text;

    @C09CT("product_list")
    public final List<Object> videoAnchorProductFeatureList;

    @C09CT("video_anchor_product_list")
    public final List<VideoAnchorProduct> videoAnchorProductList;

    @C09CT("video_product_info")
    public final ProductRelation videoProductInfo;

    public final String toString() {
        return "DiversionEntranceResCfg(text=" + this.text + ", image=" + this.image + ", duration=" + this.duration + ", redDot=" + this.redDot + ", guideText=" + this.guideText + ", guideTextEn=" + this.guideTextEn + ", buttonText=" + this.buttonText + ", scrollText=" + this.scrollText + ", productCategory=" + this.productCategory + ", schema=" + this.schema + ", showProductImages=" + this.showProductImages + ", videoProductInfo=" + this.videoProductInfo + ", iconUrl=" + this.iconUrl + ", buttonImage=" + this.buttonImage + ", mallLandingPage=" + this.mallLandingPage + ", avoidAdVideo=" + this.avoidAdVideo + ", avoidSearchSugWord=" + this.avoidSearchSugWord + ", bgDark=" + this.bgDark + ", showArrow=" + this.showArrow + ", daParams=" + this.daParams + ", noCartFeedVideoGuideType=" + this.noCartFeedVideoGuideType + ", inCartFeedVideoGuideType=" + this.inCartFeedVideoGuideType + ", videoAnchorProductList=" + this.videoAnchorProductList + ", videoAnchorProductFeatureList=" + this.videoAnchorProductFeatureList + ", shopTabBubbleStyle=" + this.shopTabBubbleStyle + ')';
    }

    public DiversionEntranceResCfg(String str, DiversionImage diversionImage, Long l, CountCfg countCfg, String str2, String str3, String str4, String str5, Map<String, ProductCategory> map, String str6, Boolean bool, ProductRelation productRelation, String str7, String str8, String str9, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Map<String, ? extends Object> map2, Integer num, Integer num2, List<VideoAnchorProduct> list, List<Object> list2, Integer num3) {
        this.text = str;
        this.image = diversionImage;
        this.duration = l;
        this.redDot = countCfg;
        this.guideText = str2;
        this.guideTextEn = str3;
        this.buttonText = str4;
        this.scrollText = str5;
        this.productCategory = map;
        this.schema = str6;
        this.showProductImages = bool;
        this.videoProductInfo = productRelation;
        this.iconUrl = str7;
        this.buttonImage = str8;
        this.mallLandingPage = str9;
        this.avoidAdVideo = bool2;
        this.avoidSearchSugWord = bool3;
        this.bgDark = bool4;
        this.showArrow = bool5;
        this.daParams = map2;
        this.noCartFeedVideoGuideType = num;
        this.inCartFeedVideoGuideType = num2;
        this.videoAnchorProductList = list;
        this.videoAnchorProductFeatureList = list2;
        this.shopTabBubbleStyle = num3;
    }
}
