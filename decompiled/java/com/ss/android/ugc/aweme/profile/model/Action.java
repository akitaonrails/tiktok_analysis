package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class Action implements Serializable {

    @C09CT("router")
    public RouterInfo router;

    @C09CT("type")
    public String type;

    public static final class RouterInfo implements Serializable {

        @C09CT("url")
        public String url;

        public final String getUrl() {
            return this.url;
        }

        public final void setUrl(String str) {
            this.url = str;
        }
    }

    public final RouterInfo getRouter() {
        return this.router;
    }

    public final String getType() {
        return this.type;
    }

    public final void setRouter(RouterInfo routerInfo) {
        this.router = routerInfo;
    }

    public final void setType(String str) {
        this.type = str;
    }
}
