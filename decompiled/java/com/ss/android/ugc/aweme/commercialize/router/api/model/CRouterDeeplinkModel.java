package com.ss.android.ugc.aweme.commercialize.router.api.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class CRouterDeeplinkModel implements Serializable {

    @C09CT("open_url")
    public String url;

    public CRouterDeeplinkModel() {
        this(null);
    }

    public final String getUrl() {
        return this.url;
    }

    public CRouterDeeplinkModel(String str) {
        this.url = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }
}
