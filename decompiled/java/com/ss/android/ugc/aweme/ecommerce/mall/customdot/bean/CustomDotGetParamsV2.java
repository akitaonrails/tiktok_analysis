package com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean;

import X.C09CT;
import com.google.gson.n;

/* JADX INFO: loaded from: classes27.dex */
public final class CustomDotGetParamsV2 {

    @C09CT("background_page_type")
    public final Integer backgroundPageType;

    @C09CT("delivery_schema")
    public final String deliverySchema;

    @C09CT("ecom_user_actions")
    public final String ecomUserActions;

    @C09CT("is_cold_start")
    public final int isColdStart;

    @C09CT("is_shop_tab")
    public final int isShopTab;

    @C09CT("landing_strategy")
    public final String landingStrategy;

    @C09CT("mall_version")
    public final String mallVersion;

    @C09CT("page_source_info")
    public final String pageSourceInfo;

    @C09CT("request_state")
    public final int reqState;

    @C09CT("session_id")
    public final String sessionId;

    @C09CT("shop_tab_position")
    public final int shopTabPosition;

    @C09CT("trigger_list")
    public final String triggerList;

    @C09CT("user_feature")
    public final n userFeature;

    public CustomDotGetParamsV2(int i, int i2, int i3, String str, int i4, String str2, String str3, n nVar, String str4, String str5, String str6, String str7, Integer num) {
        this.isShopTab = i;
        this.isColdStart = i2;
        this.shopTabPosition = i3;
        this.mallVersion = str;
        this.reqState = i4;
        this.ecomUserActions = str2;
        this.pageSourceInfo = str3;
        this.userFeature = nVar;
        this.sessionId = str4;
        this.triggerList = str5;
        this.deliverySchema = str6;
        this.landingStrategy = str7;
        this.backgroundPageType = num;
    }
}
