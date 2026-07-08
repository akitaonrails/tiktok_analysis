package com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class FeedEcCardStyle {

    @C09CT("card_bg_center_color")
    public final String cardBgCenterColor;

    @C09CT("card_bg_end_color")
    public final String cardBgEndColor;

    @C09CT("card_bg_img")
    public final ImageUrlModel cardBgImg;

    @C09CT("card_bg_pendant_img")
    public final ImageUrlModel cardBgPendantImg;

    @C09CT("card_bg_start_color")
    public final String cardBgStartColor;

    @C09CT("card_btn_no_interest_bg_color")
    public final String cardBtnNoInterestBgColor;

    @C09CT("card_btn_no_interest_text")
    public final String cardBtnNoInterestText;

    @C09CT("card_btn_no_interest_text_color")
    public final String cardBtnNoInterestTextColor;

    @C09CT("card_btn_see_more_bg_color")
    public final String cardBtnSeeMoreBgColor;

    @C09CT("card_btn_see_more_schema")
    public final String cardBtnSeeMoreSchema;

    @C09CT("card_btn_see_more_text")
    public final String cardBtnSeeMoreText;

    @C09CT("card_btn_see_more_text_color")
    public final String cardBtnSeeMoreTextColor;

    @C09CT("card_content_bg_center_color")
    public final String cardContentBgCenterColor;

    @C09CT("card_content_bg_end_color")
    public final String cardContentBgEndColor;

    @C09CT("card_content_bg_img")
    public final ImageUrlModel cardContentBgImg;

    @C09CT("card_content_bg_start_color")
    public final String cardContentBgStartColor;

    @C09CT("card_content_product_style")
    public final List<Object> cardContentProductStyleList;

    @C09CT("card_countdown_style")
    public final List<Object> cardCountdownStyleList;

    @C09CT("card_subtitle_text")
    public final String cardSubtitleText;

    @C09CT("card_subtitle_text_color")
    public final String cardSubtitleTextColor;

    @C09CT("card_swipe_up_color")
    public final String cardSwipeUpColor;

    @C09CT("card_swipe_up_text")
    public final String cardSwipeUpText;

    @C09CT("card_title_text")
    public final String cardTitleText;

    @C09CT("card_title_text_color")
    public final String cardTitleTextColor;

    @C09CT("card_title_text_size")
    public final Float cardTitleTextSize;

    @C09CT("coupon_style")
    public final List<Object> couponStyle;

    @C09CT("pagecontrol_selected_color")
    public final String pageControllerSelectedColor;

    @C09CT("pagecontrol_not_selected_color")
    public final String pageControllerUnselectedColor;

    @C09CT("promotion_label_style")
    public final List<Object> promotionLabelStyle;

    @C09CT("card_subtitle_icon_img")
    public final ImageUrlModel subtitleIcon;

    @C09CT("card_title_icon_img")
    public final ImageUrlModel titleIcon;

    public FeedEcCardStyle() {
        this(null, null, null, null, null, null, Float.valueOf(24.0f), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedEcCardStyle)) {
            return false;
        }
        FeedEcCardStyle feedEcCardStyle = (FeedEcCardStyle) obj;
        return Intrinsics.LJFF(this.cardBgImg, feedEcCardStyle.cardBgImg) && Intrinsics.LJFF(this.cardBgStartColor, feedEcCardStyle.cardBgStartColor) && Intrinsics.LJFF(this.cardBgCenterColor, feedEcCardStyle.cardBgCenterColor) && Intrinsics.LJFF(this.cardBgEndColor, feedEcCardStyle.cardBgEndColor) && Intrinsics.LJFF(this.cardTitleText, feedEcCardStyle.cardTitleText) && Intrinsics.LJFF(this.cardTitleTextColor, feedEcCardStyle.cardTitleTextColor) && Intrinsics.LJFF(this.cardTitleTextSize, feedEcCardStyle.cardTitleTextSize) && Intrinsics.LJFF(this.cardSubtitleText, feedEcCardStyle.cardSubtitleText) && Intrinsics.LJFF(this.cardSubtitleTextColor, feedEcCardStyle.cardSubtitleTextColor) && Intrinsics.LJFF(this.cardBgPendantImg, feedEcCardStyle.cardBgPendantImg) && Intrinsics.LJFF(this.cardBtnNoInterestBgColor, feedEcCardStyle.cardBtnNoInterestBgColor) && Intrinsics.LJFF(this.cardBtnNoInterestText, feedEcCardStyle.cardBtnNoInterestText) && Intrinsics.LJFF(this.cardBtnNoInterestTextColor, feedEcCardStyle.cardBtnNoInterestTextColor) && Intrinsics.LJFF(this.cardBtnSeeMoreBgColor, feedEcCardStyle.cardBtnSeeMoreBgColor) && Intrinsics.LJFF(this.cardBtnSeeMoreText, feedEcCardStyle.cardBtnSeeMoreText) && Intrinsics.LJFF(this.cardBtnSeeMoreTextColor, feedEcCardStyle.cardBtnSeeMoreTextColor) && Intrinsics.LJFF(this.cardBtnSeeMoreSchema, feedEcCardStyle.cardBtnSeeMoreSchema) && Intrinsics.LJFF(this.cardSwipeUpText, feedEcCardStyle.cardSwipeUpText) && Intrinsics.LJFF(this.cardSwipeUpColor, feedEcCardStyle.cardSwipeUpColor) && Intrinsics.LJFF(this.cardContentBgImg, feedEcCardStyle.cardContentBgImg) && Intrinsics.LJFF(this.cardContentBgStartColor, feedEcCardStyle.cardContentBgStartColor) && Intrinsics.LJFF(this.cardContentBgCenterColor, feedEcCardStyle.cardContentBgCenterColor) && Intrinsics.LJFF(this.cardContentBgEndColor, feedEcCardStyle.cardContentBgEndColor) && Intrinsics.LJFF(this.cardCountdownStyleList, feedEcCardStyle.cardCountdownStyleList) && Intrinsics.LJFF(this.cardContentProductStyleList, feedEcCardStyle.cardContentProductStyleList) && Intrinsics.LJFF(this.titleIcon, feedEcCardStyle.titleIcon) && Intrinsics.LJFF(this.subtitleIcon, feedEcCardStyle.subtitleIcon) && Intrinsics.LJFF(this.promotionLabelStyle, feedEcCardStyle.promotionLabelStyle) && Intrinsics.LJFF(this.couponStyle, feedEcCardStyle.couponStyle) && Intrinsics.LJFF(this.pageControllerSelectedColor, feedEcCardStyle.pageControllerSelectedColor) && Intrinsics.LJFF(this.pageControllerUnselectedColor, feedEcCardStyle.pageControllerUnselectedColor);
    }

    public FeedEcCardStyle(ImageUrlModel imageUrlModel, String str, String str2, String str3, String str4, String str5, Float f, String str6, String str7, ImageUrlModel imageUrlModel2, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, ImageUrlModel imageUrlModel3, String str17, String str18, String str19, List<Object> list, List<Object> list2, ImageUrlModel imageUrlModel4, ImageUrlModel imageUrlModel5, List<Object> list3, List<Object> list4, String str20, String str21) {
        this.cardBgImg = imageUrlModel;
        this.cardBgStartColor = str;
        this.cardBgCenterColor = str2;
        this.cardBgEndColor = str3;
        this.cardTitleText = str4;
        this.cardTitleTextColor = str5;
        this.cardTitleTextSize = f;
        this.cardSubtitleText = str6;
        this.cardSubtitleTextColor = str7;
        this.cardBgPendantImg = imageUrlModel2;
        this.cardBtnNoInterestBgColor = str8;
        this.cardBtnNoInterestText = str9;
        this.cardBtnNoInterestTextColor = str10;
        this.cardBtnSeeMoreBgColor = str11;
        this.cardBtnSeeMoreText = str12;
        this.cardBtnSeeMoreTextColor = str13;
        this.cardBtnSeeMoreSchema = str14;
        this.cardSwipeUpText = str15;
        this.cardSwipeUpColor = str16;
        this.cardContentBgImg = imageUrlModel3;
        this.cardContentBgStartColor = str17;
        this.cardContentBgCenterColor = str18;
        this.cardContentBgEndColor = str19;
        this.cardCountdownStyleList = list;
        this.cardContentProductStyleList = list2;
        this.titleIcon = imageUrlModel4;
        this.subtitleIcon = imageUrlModel5;
        this.promotionLabelStyle = list3;
        this.couponStyle = list4;
        this.pageControllerSelectedColor = str20;
        this.pageControllerUnselectedColor = str21;
    }
}
