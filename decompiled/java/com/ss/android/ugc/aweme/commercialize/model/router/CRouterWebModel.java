package com.ss.android.ugc.aweme.commercialize.model.router;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class CRouterWebModel implements Serializable {

    @C09CT("web_title")
    public String webTitle;

    @C09CT("web_url")
    public String webUrl;

    public CRouterWebModel() {
        this(null, null);
    }

    public final String getWebTitle() {
        return this.webTitle;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public final void setWebTitle(String str) {
        this.webTitle = str;
    }

    public final void setWebUrl(String str) {
        this.webUrl = str;
    }

    public CRouterWebModel(String str, String str2) {
        this.webUrl = str;
        this.webTitle = str2;
    }
}
