package com.ss.android.ugc.aweme.feed.model.ad;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class ShopAnchorSellingPointData implements Serializable {
    public static final Companion Companion = new Companion();

    @C09CT("anchor_info")
    public final String anchorInfo;
    public volatile Number boostStatus;
    public volatile boolean enableQcpxBoost;

    @C09CT("is_real_boost")
    public final Boolean isRealBoost;

    @C09CT("promotion_selling_point_type")
    public final int promotionSellingPointType;
    public String sellingPointLogExtra;

    @C09CT("selling_point_type")
    public final int sellingPointType;

    @C09CT("show_time")
    public final int showTime;

    @C09CT("type")
    public final int type;

    @C09CT("update_anchor_info")
    public final String updateAnchorInfo;

    @C09CT("update_milliseconds")
    public final Integer updateMs;

    public static final class Companion {
    }

    public ShopAnchorSellingPointData() {
        this(0, 0, 0, null, null, null, null, 0, null);
    }

    public final String getAnchorInfo() {
        return this.anchorInfo;
    }

    public final Number getBoostStatus() {
        return this.boostStatus;
    }

    public final boolean getEnableQcpxBoost() {
        return this.enableQcpxBoost;
    }

    public final int getPromotionSellingPointType() {
        return this.promotionSellingPointType;
    }

    public final String getSellingPointLogExtra() {
        return this.sellingPointLogExtra;
    }

    public final int getSellingPointType() {
        return this.sellingPointType;
    }

    public final int getShowTime() {
        return this.showTime;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUpdateAnchorInfo() {
        return this.updateAnchorInfo;
    }

    public final Integer getUpdateMs() {
        return this.updateMs;
    }

    public final Boolean isRealBoost() {
        return this.isRealBoost;
    }

    public final void setBoostStatus(Number number) {
        this.boostStatus = number;
    }

    public final void setEnableQcpxBoost(boolean z) {
        this.enableQcpxBoost = z;
    }

    public final void setSellingPointLogExtra(String str) {
        this.sellingPointLogExtra = str;
    }

    public ShopAnchorSellingPointData(int i, int i2, int i3, String str, Integer num, String str2, Boolean bool, int i4, String str3) {
        this.type = i;
        this.sellingPointType = i2;
        this.showTime = i3;
        this.anchorInfo = str;
        this.updateMs = num;
        this.updateAnchorInfo = str2;
        this.isRealBoost = bool;
        this.promotionSellingPointType = i4;
        this.sellingPointLogExtra = str3;
        this.boostStatus = 0;
    }
}
