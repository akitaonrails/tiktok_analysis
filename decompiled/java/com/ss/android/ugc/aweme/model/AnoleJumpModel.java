package com.ss.android.ugc.aweme.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleJumpModel implements Serializable {

    @C09CT("native_site_custom_data")
    public final String nativeSiteCustomData;

    @C09CT("open_url")
    public final String openUrl;

    @C09CT("web_url")
    public final String webUrl;

    public final String getNativeSiteCustomData() {
        return this.nativeSiteCustomData;
    }

    public final String getOpenUrl() {
        return this.openUrl;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public AnoleJumpModel(String str, String str2, String str3) {
        this.nativeSiteCustomData = str;
        this.webUrl = str2;
        this.openUrl = str3;
    }
}
