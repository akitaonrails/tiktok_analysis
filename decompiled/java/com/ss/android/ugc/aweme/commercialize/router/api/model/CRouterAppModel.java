package com.ss.android.ugc.aweme.commercialize.router.api.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class CRouterAppModel implements Serializable {

    @C09CT("app_id")
    public String appID;

    public CRouterAppModel() {
        this(null);
    }

    public final String getAppID() {
        return this.appID;
    }

    public CRouterAppModel(String str) {
        this.appID = str;
    }

    public final void setAppID(String str) {
        this.appID = str;
    }
}
