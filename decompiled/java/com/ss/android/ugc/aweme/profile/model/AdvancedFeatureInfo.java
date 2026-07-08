package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class AdvancedFeatureInfo implements Serializable {

    @C09CT("order_center_title_en")
    public final String entryName;

    @C09CT("feature_id")
    public final int featureId;

    @C09CT("order_center_icon_dark_url")
    public final String iconDarkUrl;

    @C09CT("order_center_icon_url")
    public final String iconUrl;

    @C09CT("order_center_schema")
    public final String orderCenterSchema;

    @C09CT("order_center_title")
    public final String orderCenterTitle;

    @C09CT("paid_collections_schema")
    public final String paidCollectionSchema;

    @C09CT("red_dot_count")
    public final int redDotCount;

    @C09CT("shop_schema")
    public final String shopSchema;

    @C09CT("sub_info")
    public final SubscriptionInfo subInfo;

    public final String getEntryName() {
        return this.entryName;
    }

    public final int getFeatureId() {
        return this.featureId;
    }

    public final String getIconDarkUrl() {
        return this.iconDarkUrl;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getOrderCenterSchema() {
        return this.orderCenterSchema;
    }

    public final String getOrderCenterTitle() {
        return this.orderCenterTitle;
    }

    public final String getPaidCollectionSchema() {
        return this.paidCollectionSchema;
    }

    public final int getRedDotCount() {
        return this.redDotCount;
    }

    public final String getShopSchema() {
        return this.shopSchema;
    }

    public final SubscriptionInfo getSubInfo() {
        return this.subInfo;
    }

    public AdvancedFeatureInfo(String str, String str2, String str3, String str4, int i, String str5, String str6, SubscriptionInfo subscriptionInfo, int i2, String str7) {
        this.shopSchema = str;
        this.orderCenterSchema = str2;
        this.orderCenterTitle = str3;
        this.entryName = str4;
        this.redDotCount = i;
        this.iconUrl = str5;
        this.iconDarkUrl = str6;
        this.subInfo = subscriptionInfo;
        this.featureId = i2;
        this.paidCollectionSchema = str7;
    }
}
