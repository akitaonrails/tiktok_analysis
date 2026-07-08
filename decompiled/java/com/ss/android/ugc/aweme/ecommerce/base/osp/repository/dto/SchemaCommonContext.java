package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class SchemaCommonContext {

    @C09CT("action_type")
    public final String actionType;

    @C09CT("biz_type")
    public final String bizType;

    @C09CT("channel_type")
    public final String channelType;

    @C09CT("checkout_type")
    public final String checkoutType;

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("enter_from_info")
    public final String enterFromInfo;

    @C09CT("enter_from_merge")
    public final String enterFromMerge;

    @C09CT("enter_method")
    public final String enterMethod;

    @C09CT("entrance_info")
    public final String entranceInfo;

    @C09CT("is_ad")
    public final String isAd;

    @C09CT("pay_request_id")
    public final String payRequestId;

    @C09CT("pay_source")
    public final String paySource;

    @C09CT("pay_to_mall_source")
    public final String payToMallSource;

    @C09CT("pay_to_mall_tab")
    public final String payToMallTab;

    @C09CT("pay_type")
    public final String payType;

    @C09CT("previous_page")
    public final String previousPage;

    @C09CT("product_id")
    public final String productId;

    @C09CT("room_id")
    public final String roomId;

    @C09CT("search_entrance")
    public final String searchEntrance;

    @C09CT("shop_tab_ab")
    public final String shopTabAB;

    @C09CT("source_info")
    public final List<String> sourceInfo;

    @C09CT("source_page_type")
    public final String sourcePageType;

    @C09CT("source_previous_page")
    public final String sourcePreviousPage;

    @C09CT("traffic_source")
    public final Integer trafficSource;

    @C09CT("traffic_source_list")
    public final int[] trafficSourceList;

    public SchemaCommonContext() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public SchemaCommonContext(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, int[] iArr, List<String> list, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22) {
        this.checkoutType = str;
        this.previousPage = str2;
        this.enterFrom = str3;
        this.enterFromInfo = str4;
        this.enterFromMerge = str5;
        this.entranceInfo = str6;
        this.sourcePageType = str7;
        this.trafficSource = num;
        this.trafficSourceList = iArr;
        this.sourceInfo = list;
        this.paySource = str8;
        this.channelType = str9;
        this.shopTabAB = str10;
        this.payToMallTab = str11;
        this.productId = str12;
        this.bizType = str13;
        this.searchEntrance = str14;
        this.payType = str15;
        this.payRequestId = str16;
        this.payToMallSource = str17;
        this.enterMethod = str18;
        this.roomId = str19;
        this.actionType = str20;
        this.isAd = str21;
        this.sourcePreviousPage = str22;
    }
}
