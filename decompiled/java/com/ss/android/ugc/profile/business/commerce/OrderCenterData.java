package com.ss.android.ugc.profile.business.commerce;

import X.C09CT;
import com.ss.android.ugc.profile.platform.business.header.advanced.AdvancedFeatureBaseData;

/* JADX INFO: loaded from: classes20.dex */
public final class OrderCenterData extends AdvancedFeatureBaseData {
    public static final int $stable = 8;

    @C09CT("order_center_title_en")
    public String entryName;

    @C09CT("order_center_guide_data")
    public OrderCenterGuideData orderCenterGuideData;

    @C09CT("order_center_guide_schema")
    public String orderCenterGuideSchema;

    @C09CT("order_center_schema")
    public String orderCenterSchema;

    @C09CT("order_center_title")
    public String orderCenterTitle;

    @C09CT("show_red_dot")
    public boolean showRedDot;

    public final String getEntryName() {
        return this.entryName;
    }

    public final OrderCenterGuideData getOrderCenterGuideData() {
        return this.orderCenterGuideData;
    }

    public final String getOrderCenterGuideSchema() {
        return this.orderCenterGuideSchema;
    }

    public final String getOrderCenterSchema() {
        return this.orderCenterSchema;
    }

    public final String getOrderCenterTitle() {
        return this.orderCenterTitle;
    }

    public final boolean getShowRedDot() {
        return this.showRedDot;
    }

    public final void setEntryName(String str) {
        this.entryName = str;
    }

    public final void setOrderCenterGuideData(OrderCenterGuideData orderCenterGuideData) {
        this.orderCenterGuideData = orderCenterGuideData;
    }

    public final void setOrderCenterGuideSchema(String str) {
        this.orderCenterGuideSchema = str;
    }

    public final void setOrderCenterSchema(String str) {
        this.orderCenterSchema = str;
    }

    public final void setOrderCenterTitle(String str) {
        this.orderCenterTitle = str;
    }

    public final void setShowRedDot(boolean z) {
        this.showRedDot = z;
    }
}
