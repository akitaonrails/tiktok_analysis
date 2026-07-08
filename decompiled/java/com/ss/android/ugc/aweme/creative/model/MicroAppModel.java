package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class MicroAppModel implements Serializable {

    @C09CT(alternate = {"a"}, value = "appId")
    public String appId;

    @C09CT(alternate = {"b"}, value = "appTitle")
    public String appTitle;

    @C09CT(alternate = {"d"}, value = "appUrl")
    public String appUrl;

    @C09CT(alternate = {"h"}, value = "cardCode")
    public String cardCode;

    @C09CT(alternate = {"g"}, value = "cardImage")
    public String cardImage;

    @C09CT(alternate = {"c"}, value = "description")
    public String description;

    @C09CT(alternate = {"e"}, value = "extra")
    public String extra;

    @C09CT("micro_app_id")
    public String microAppId;

    @C09CT(alternate = {"f"}, value = "schema")
    public String schema;

    public final String getAppTitle() {
        return this.appTitle;
    }

    public final String getAppUrl() {
        return this.appUrl;
    }

    public final String getCardCode() {
        return this.cardCode;
    }

    public final String getCardImage() {
        return this.cardImage;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getMicroAppId() {
        return this.microAppId;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final void setAppTitle(String str) {
        this.appTitle = str;
    }

    public final void setAppUrl(String str) {
        this.appUrl = str;
    }

    public final void setCardCode(String str) {
        this.cardCode = str;
    }

    public final void setCardImage(String str) {
        this.cardImage = str;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setMicroAppId(String str) {
        this.microAppId = str;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }
}
