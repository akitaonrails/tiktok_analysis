package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class MediaSourceButtonStruct implements Serializable {

    @C09CT("aid")
    public String aid;

    @C09CT("eid")
    public String eid;

    @C09CT("icon")
    public final UrlModel icon;

    @C09CT("has_perchase_url")
    public boolean isBuy;

    @C09CT("name")
    public final String name = "";

    @C09CT("button_type")
    public int buttonType = 1;

    @C09CT("schema")
    public String schema = "";

    public final boolean isMiniApp() {
        return this.buttonType == 2;
    }

    public final boolean isMix() {
        return this.buttonType == 3;
    }

    public final boolean isOrigin() {
        return this.buttonType == 1;
    }

    public final String getAid() {
        return this.aid;
    }

    public final int getButtonType() {
        return this.buttonType;
    }

    public final String getEid() {
        return this.eid;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final boolean isBuy() {
        return this.isBuy;
    }

    public final void setAid(String str) {
        this.aid = str;
    }

    public final void setButtonType(int i) {
        this.buttonType = i;
    }

    public final void setBuy(boolean z) {
        this.isBuy = z;
    }

    public final void setEid(String str) {
        this.eid = str;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }
}
