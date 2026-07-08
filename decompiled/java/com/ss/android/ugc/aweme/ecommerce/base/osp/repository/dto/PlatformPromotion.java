package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PlatformPromotion {

    @C09CT("bonus_info")
    public BonusInfo bonusInfo;

    @C09CT("coupon_schema")
    public String couponSchema;

    @C09CT("coupon_status")
    public String couponStatus;

    @C09CT("da_info")
    public String daInfo;

    @C09CT("deal_labels")
    public List<DealLabel> dealLabels;

    @C09CT("discount_back")
    public DiscountBackInfo discountBack;

    @C09CT("discount_brief")
    public List<PromotionDiscountBrief> discountBrief;

    @C09CT("discount_brief_style")
    public Integer discountBriefStyle;

    @C09CT("discount_labels")
    public List<String> discountLabels;

    @C09CT("entrance_title")
    public String entranceTitle;

    @C09CT("first_screen_banner_text")
    public String firstScreenBannerText;

    @C09CT("highlight_promotion")
    public HighLightPromotionInfo highlightPromotion;

    @C09CT("order_promotion_cache_key")
    public String orderPromotionCacheKey;

    @C09CT("platform_discount")
    public String platformDiscount;

    @C09CT("platform_discount_brief")
    public PlatformDiscountBrief platformDiscountBrief;

    @C09CT("promotion_banner")
    public PromotionBanner promotionBanner;

    @C09CT("promotion_coupon_module")
    public PromotionCouponModule promotionCouponModule;

    @C09CT("promotion_notice")
    public List<PlatformPromotionNotice> promotionNoticeList;

    @C09CT("promotion_selling_point")
    public List<PromotionSellingPoint> promotionSellingPoint;

    @C09CT("promotion_tag_style")
    public PromotionTagStyle promotionTagStyle;

    @C09CT("promotion_tag_text")
    public String promotionTagText;

    @C09CT("title")
    public String title;

    @C09CT("title_icon")
    public Icon titleIcon;

    @C09CT("title_icon_style")
    public Integer titleIconStyle;

    @C09CT("unused_coupon_count")
    public Integer unusedCouponCount;

    @C09CT("voucher_back")
    public VoucherBackInfo voucherBack;

    @C09CT("voucher_selected_info")
    public List<VoucherInfoNew> voucherSelectedInfo;

    public PlatformPromotion() {
    }

    public static PlatformPromotion LIZ(PlatformPromotion platformPromotion, HighLightPromotionInfo highLightPromotionInfo, BonusInfo bonusInfo, PromotionBanner promotionBanner, int i) {
        String str;
        String str2;
        String str3;
        List<VoucherInfoNew> list;
        String str4;
        DiscountBackInfo discountBackInfo;
        String str5;
        Integer num;
        String str6;
        String str7;
        List<PromotionDiscountBrief> list2;
        String str8;
        PromotionTagStyle promotionTagStyle;
        VoucherBackInfo voucherBackInfo;
        List<String> list3;
        Integer num2;
        List<DealLabel> list4;
        PromotionCouponModule promotionCouponModule;
        Icon icon;
        Integer num3;
        String str9;
        List<PlatformPromotionNotice> list5;
        List<PromotionSellingPoint> list6;
        PromotionBanner promotionBanner2 = promotionBanner;
        BonusInfo bonusInfo2 = bonusInfo;
        HighLightPromotionInfo highLightPromotionInfo2 = highLightPromotionInfo;
        PlatformDiscountBrief platformDiscountBrief = null;
        if ((i & 1) != 0) {
            str = platformPromotion.couponStatus;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = platformPromotion.orderPromotionCacheKey;
        } else {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = platformPromotion.platformDiscount;
        } else {
            str3 = null;
        }
        if ((i & 8) != 0) {
            list = platformPromotion.voucherSelectedInfo;
        } else {
            list = null;
        }
        if ((i & 16) != 0) {
            str4 = platformPromotion.couponSchema;
        } else {
            str4 = null;
        }
        if ((i & 32) != 0) {
            discountBackInfo = platformPromotion.discountBack;
        } else {
            discountBackInfo = null;
        }
        if ((i & 64) != 0) {
            str5 = platformPromotion.title;
        } else {
            str5 = null;
        }
        if ((i & 128) != 0) {
            num = platformPromotion.unusedCouponCount;
        } else {
            num = null;
        }
        if ((i & 256) != 0) {
            str6 = platformPromotion.promotionTagText;
        } else {
            str6 = null;
        }
        if ((i & 512) != 0) {
            str7 = platformPromotion.firstScreenBannerText;
        } else {
            str7 = null;
        }
        if ((i & 1024) != 0) {
            highLightPromotionInfo2 = platformPromotion.highlightPromotion;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            list2 = platformPromotion.discountBrief;
        } else {
            list2 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            bonusInfo2 = platformPromotion.bonusInfo;
        }
        if ((i & 8192) != 0) {
            str8 = platformPromotion.daInfo;
        } else {
            str8 = null;
        }
        if ((i & 16384) != 0) {
            promotionBanner2 = platformPromotion.promotionBanner;
        }
        if ((32768 & i) != 0) {
            promotionTagStyle = platformPromotion.promotionTagStyle;
        } else {
            promotionTagStyle = null;
        }
        if ((65536 & i) != 0) {
            voucherBackInfo = platformPromotion.voucherBack;
        } else {
            voucherBackInfo = null;
        }
        if ((131072 & i) != 0) {
            list3 = platformPromotion.discountLabels;
        } else {
            list3 = null;
        }
        if ((262144 & i) != 0) {
            num2 = platformPromotion.discountBriefStyle;
        } else {
            num2 = null;
        }
        if ((524288 & i) != 0) {
            list4 = platformPromotion.dealLabels;
        } else {
            list4 = null;
        }
        if ((1048576 & i) != 0) {
            promotionCouponModule = platformPromotion.promotionCouponModule;
        } else {
            promotionCouponModule = null;
        }
        if ((2097152 & i) != 0) {
            icon = platformPromotion.titleIcon;
        } else {
            icon = null;
        }
        if ((4194304 & i) != 0) {
            num3 = platformPromotion.titleIconStyle;
        } else {
            num3 = null;
        }
        if ((8388608 & i) != 0) {
            str9 = platformPromotion.entranceTitle;
        } else {
            str9 = null;
        }
        if ((16777216 & i) != 0) {
            list5 = platformPromotion.promotionNoticeList;
        } else {
            list5 = null;
        }
        if ((33554432 & i) != 0) {
            list6 = platformPromotion.promotionSellingPoint;
        } else {
            list6 = null;
        }
        if ((i & 67108864) != 0) {
            platformDiscountBrief = platformPromotion.platformDiscountBrief;
        }
        return new PlatformPromotion(str, str2, str3, list, str4, discountBackInfo, str5, num, str6, str7, highLightPromotionInfo2, list2, bonusInfo2, str8, promotionBanner2, promotionTagStyle, voucherBackInfo, list3, num2, list4, promotionCouponModule, icon, num3, str9, list5, list6, platformDiscountBrief);
    }

    public PlatformPromotion(String str, String str2, String str3, List<VoucherInfoNew> list, String str4, DiscountBackInfo discountBackInfo, String str5, Integer num, String str6, String str7, HighLightPromotionInfo highLightPromotionInfo, List<PromotionDiscountBrief> list2, BonusInfo bonusInfo, String str8, PromotionBanner promotionBanner, PromotionTagStyle promotionTagStyle, VoucherBackInfo voucherBackInfo, List<String> list3, Integer num2, List<DealLabel> list4, PromotionCouponModule promotionCouponModule, Icon icon, Integer num3, String str9, List<PlatformPromotionNotice> list5, List<PromotionSellingPoint> list6, PlatformDiscountBrief platformDiscountBrief) {
        this.couponStatus = str;
        this.orderPromotionCacheKey = str2;
        this.platformDiscount = str3;
        this.voucherSelectedInfo = list;
        this.couponSchema = str4;
        this.discountBack = discountBackInfo;
        this.title = str5;
        this.unusedCouponCount = num;
        this.promotionTagText = str6;
        this.firstScreenBannerText = str7;
        this.highlightPromotion = highLightPromotionInfo;
        this.discountBrief = list2;
        this.bonusInfo = bonusInfo;
        this.daInfo = str8;
        this.promotionBanner = promotionBanner;
        this.promotionTagStyle = promotionTagStyle;
        this.voucherBack = voucherBackInfo;
        this.discountLabels = list3;
        this.discountBriefStyle = num2;
        this.dealLabels = list4;
        this.promotionCouponModule = promotionCouponModule;
        this.titleIcon = icon;
        this.titleIconStyle = num3;
        this.entranceTitle = str9;
        this.promotionNoticeList = list5;
        this.promotionSellingPoint = list6;
        this.platformDiscountBrief = platformDiscountBrief;
    }
}
