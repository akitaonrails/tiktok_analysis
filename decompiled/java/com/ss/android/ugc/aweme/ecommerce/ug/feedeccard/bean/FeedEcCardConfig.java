package com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean;

import X.C09CT;
import X.EnumC1742550vRl;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class FeedEcCardConfig {

    @C09CT("audience_id")
    public final String audienceId;

    @C09CT("buy_type")
    public Integer buyType;

    @C09CT("card_info")
    public final FeedEcCardInfo cardInfo;

    @C09CT("card_subtype")
    public final Integer cardSubtype;

    @C09CT("ecom_search_title")
    public final String cardTitle;

    @C09CT("card_type")
    public Integer cardType;

    @C09CT("content_type")
    public final Integer contentType;

    @C09CT("ecom_card_id")
    public final Long fypEcomCardId;

    @C09CT("is_offline")
    public final Integer isOffline;

    @C09CT("is_onboarding_card")
    public Boolean isOnboardingCard;

    @C09CT("price_type")
    public final String priceType;

    @C09CT("product_click_type")
    public Integer productClickType;

    @C09CT("product_id_list")
    public final List<Long> productIdList;

    @C09CT("product_info_list")
    public final List<Object> productInfoList;

    @C09CT("product_show_num")
    public final Integer productShowNum;

    @C09CT("resource_key")
    public final String resourceKey;

    @C09CT("qrec_card_info")
    public final SearchCardInfo searchCardInfo;

    @C09CT("track_params")
    public final Map<String, Object> trackParams;

    @C09CT("trigger_condition")
    public final Integer triggerCondition;

    @C09CT("trigger_subcondition")
    public final Integer triggerSubCondition;

    @C09CT("user_status")
    public final Integer userStatus;

    @C09CT("voucher_info_list")
    public final List<Object> voucherInfoList;

    @C09CT("voucher_show_num")
    public final Integer voucherShowNum;

    public FeedEcCardConfig() {
        this(0, null, 1, 0, 0, 0, 0, null, null, EnumC1742550vRl.VIDEO.getValue(), 0, 0, null, 0, null, null, null, null, null, null, null, Boolean.FALSE, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedEcCardConfig)) {
            return false;
        }
        FeedEcCardConfig feedEcCardConfig = (FeedEcCardConfig) obj;
        return Intrinsics.LJFF(this.isOffline, feedEcCardConfig.isOffline) && Intrinsics.LJFF(this.audienceId, feedEcCardConfig.audienceId) && Intrinsics.LJFF(this.cardSubtype, feedEcCardConfig.cardSubtype) && Intrinsics.LJFF(this.userStatus, feedEcCardConfig.userStatus) && Intrinsics.LJFF(this.triggerCondition, feedEcCardConfig.triggerCondition) && Intrinsics.LJFF(this.triggerSubCondition, feedEcCardConfig.triggerSubCondition) && Intrinsics.LJFF(this.contentType, feedEcCardConfig.contentType) && Intrinsics.LJFF(this.trackParams, feedEcCardConfig.trackParams) && Intrinsics.LJFF(this.resourceKey, feedEcCardConfig.resourceKey) && Intrinsics.LJFF(this.priceType, feedEcCardConfig.priceType) && Intrinsics.LJFF(this.buyType, feedEcCardConfig.buyType) && Intrinsics.LJFF(this.productShowNum, feedEcCardConfig.productShowNum) && Intrinsics.LJFF(this.productInfoList, feedEcCardConfig.productInfoList) && Intrinsics.LJFF(this.voucherShowNum, feedEcCardConfig.voucherShowNum) && Intrinsics.LJFF(this.voucherInfoList, feedEcCardConfig.voucherInfoList) && Intrinsics.LJFF(this.cardInfo, feedEcCardConfig.cardInfo) && Intrinsics.LJFF(this.productClickType, feedEcCardConfig.productClickType) && Intrinsics.LJFF(this.cardTitle, feedEcCardConfig.cardTitle) && Intrinsics.LJFF(this.searchCardInfo, feedEcCardConfig.searchCardInfo) && Intrinsics.LJFF(this.productIdList, feedEcCardConfig.productIdList) && Intrinsics.LJFF(this.fypEcomCardId, feedEcCardConfig.fypEcomCardId) && Intrinsics.LJFF(this.isOnboardingCard, feedEcCardConfig.isOnboardingCard) && Intrinsics.LJFF(this.cardType, feedEcCardConfig.cardType);
    }

    public static final class FeedEcCardInfo {

        @C09CT("mall_request_id")
        public final String mallRequestId;

        @C09CT("rec_scene")
        public final String recScene;

        @C09CT("recommend_info")
        public final String recommendInfo;

        @C09CT("session_id")
        public final String sessionId;

        @C09CT("ttmall_card_recommend_info")
        public final String subRecommendInfo;

        public FeedEcCardInfo() {
            this(null, null, null, null, null);
        }

        public FeedEcCardInfo(String str, String str2, String str3, String str4, String str5) {
            this.sessionId = str;
            this.recommendInfo = str2;
            this.recScene = str3;
            this.mallRequestId = str4;
            this.subRecommendInfo = str5;
        }
    }

    public static final class SearchCardInfo implements Serializable {

        @C09CT("gid")
        public final String gid;

        @C09CT("mall_request_id")
        public final String mallRequestId;

        @C09CT("query")
        public final String query;

        @C09CT("recommend_info")
        public final String recommendInfo;

        @C09CT("session_id")
        public final String sessionId;

        public SearchCardInfo() {
            this(null, null, null, null, null);
        }

        public SearchCardInfo(String str, String str2, String str3, String str4, String str5) {
            this.query = str;
            this.sessionId = str2;
            this.mallRequestId = str3;
            this.recommendInfo = str4;
            this.gid = str5;
        }
    }

    public FeedEcCardConfig(Integer num, String str, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Map<String, ? extends Object> map, String str2, String str3, Integer num7, Integer num8, List<Object> list, Integer num9, List<Object> list2, FeedEcCardInfo feedEcCardInfo, Integer num10, String str4, SearchCardInfo searchCardInfo, List<Long> list3, Long l, Boolean bool, Integer num11) {
        this.isOffline = num;
        this.audienceId = str;
        this.cardSubtype = num2;
        this.userStatus = num3;
        this.triggerCondition = num4;
        this.triggerSubCondition = num5;
        this.contentType = num6;
        this.trackParams = map;
        this.resourceKey = str2;
        this.priceType = str3;
        this.buyType = num7;
        this.productShowNum = num8;
        this.productInfoList = list;
        this.voucherShowNum = num9;
        this.voucherInfoList = list2;
        this.cardInfo = feedEcCardInfo;
        this.productClickType = num10;
        this.cardTitle = str4;
        this.searchCardInfo = searchCardInfo;
        this.productIdList = list3;
        this.fypEcomCardId = l;
        this.isOnboardingCard = bool;
        this.cardType = num11;
    }
}
