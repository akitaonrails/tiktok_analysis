package com.bytedance.ies.ugc.aweme.rich.model.commercialize.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class JumpData implements Serializable {

    @C09CT("appleid")
    public String appleId;

    @C09CT("enable")
    public boolean enable;

    @C09CT("open_url")
    public String openUrl;

    @C09CT("package")
    public String packageName;

    @C09CT("web_title")
    public String webTitle;

    @C09CT("web_url")
    public String webUrl;

    public final String getAppleId() {
        return this.appleId;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final String getOpenUrl() {
        return this.openUrl;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getWebTitle() {
        return this.webTitle;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public final void setAppleId(String str) {
        this.appleId = str;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public final void setPackageName(String str) {
        this.packageName = str;
    }

    public final void setWebTitle(String str) {
        this.webTitle = str;
    }

    public final void setWebUrl(String str) {
        this.webUrl = str;
    }
}
