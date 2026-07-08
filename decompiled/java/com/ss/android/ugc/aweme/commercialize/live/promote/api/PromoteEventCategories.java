package com.ss.android.ugc.aweme.commercialize.live.promote.api;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class PromoteEventCategories implements Serializable {

    @C09CT("app_id")
    public String appId;

    @C09CT("app_version")
    public String appVersion;

    @C09CT("enter_from")
    public String enterFrom;

    @C09CT("os")
    public String os;

    @C09CT("pageModule")
    public String pageModule;

    @C09CT("promote_by")
    public String promoteBy;

    @C09CT("store_country")
    public String storeCountry;

    public PromoteEventCategories() {
        this("", "", "", "", "", CardStruct.IStatusCode.DEFAULT, "");
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getOs() {
        return this.os;
    }

    public final String getPageModule() {
        return this.pageModule;
    }

    public final String getPromoteBy() {
        return this.promoteBy;
    }

    public final String getStoreCountry() {
        return this.storeCountry;
    }

    public final void setAppId(String str) {
        this.appId = str;
    }

    public final void setAppVersion(String str) {
        this.appVersion = str;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setOs(String str) {
        this.os = str;
    }

    public final void setPageModule(String str) {
        this.pageModule = str;
    }

    public final void setPromoteBy(String str) {
        this.promoteBy = str;
    }

    public final void setStoreCountry(String str) {
        this.storeCountry = str;
    }

    public PromoteEventCategories(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.enterFrom = str;
        this.promoteBy = str2;
        this.storeCountry = str3;
        this.appId = str4;
        this.appVersion = str5;
        this.os = str6;
        this.pageModule = str7;
    }
}
