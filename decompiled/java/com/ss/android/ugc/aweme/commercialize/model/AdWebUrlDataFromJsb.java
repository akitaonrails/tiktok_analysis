package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AdWebUrlDataFromJsb implements Serializable {

    @C09CT("business_data")
    public final String businessDataFromJsb;

    @C09CT("is_from_jsb")
    public final boolean isFromJsb;

    @C09CT("is_from_lynx_land_page")
    public final boolean isFromLynxLandPage;

    @C09CT("refer")
    public final String refer;

    @C09CT("report_ad_extra_data")
    public final String reportAdExtraData;

    @C09CT("use_web_url")
    public final int useWebUrl;

    @C09CT("web_title")
    public final String webTitle;

    @C09CT("web_url")
    public final String webUrl;

    public AdWebUrlDataFromJsb() {
        this("", "", false, true, "", 0, null, null);
    }

    public final String getBusinessDataFromJsb() {
        return this.businessDataFromJsb;
    }

    public final String getRefer() {
        return this.refer;
    }

    public final String getReportAdExtraData() {
        return this.reportAdExtraData;
    }

    public final int getUseWebUrl() {
        return this.useWebUrl;
    }

    public final String getWebTitle() {
        return this.webTitle;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public final boolean isFromJsb() {
        return this.isFromJsb;
    }

    public final boolean isFromLynxLandPage() {
        return this.isFromLynxLandPage;
    }

    public AdWebUrlDataFromJsb(String str, String str2, boolean z, boolean z2, String str3, int i, String str4, String str5) {
        this.webUrl = str;
        this.webTitle = str2;
        this.isFromLynxLandPage = z;
        this.isFromJsb = z2;
        this.refer = str3;
        this.useWebUrl = i;
        this.businessDataFromJsb = str4;
        this.reportAdExtraData = str5;
    }
}
