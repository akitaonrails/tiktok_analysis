package com.ss.android.ugc.aweme.commercialize.anchor.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class ReportData implements Serializable {

    @C09CT("category")
    public String category;

    @C09CT("country_id")
    public String countryId;

    @C09CT("item_id")
    public String itemId;

    @C09CT("object_id")
    public String objectId;

    @C09CT("pixel_id")
    public String pixelId;

    @C09CT("report_type")
    public String reportType;

    @C09CT("website")
    public String website;

    public final String getCategory() {
        return this.category;
    }

    public final String getCountryId() {
        return this.countryId;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final String getObjectId() {
        return this.objectId;
    }

    public final String getPixelId() {
        return this.pixelId;
    }

    public final String getReportType() {
        return this.reportType;
    }

    public final String getWebsite() {
        return this.website;
    }

    public final void setCategory(String str) {
        this.category = str;
    }

    public final void setCountryId(String str) {
        this.countryId = str;
    }

    public final void setItemId(String str) {
        this.itemId = str;
    }

    public final void setObjectId(String str) {
        this.objectId = str;
    }

    public final void setPixelId(String str) {
        this.pixelId = str;
    }

    public final void setReportType(String str) {
        this.reportType = str;
    }

    public final void setWebsite(String str) {
        this.website = str;
    }
}
