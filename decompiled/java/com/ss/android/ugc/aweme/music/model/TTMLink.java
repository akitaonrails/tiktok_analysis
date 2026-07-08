package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class TTMLink implements Serializable {

    @C09CT("app_link")
    public String appLink;

    @C09CT("deep_link")
    public String deepLink;

    @C09CT("download_link")
    public String downloadLink;

    @C09CT("store_link")
    public TTMStoreLink storeLink;

    public TTMLink() {
        this("", "", "", null);
    }

    public TTMLink(String str, String str2, String str3, TTMStoreLink tTMStoreLink) {
        this.appLink = str;
        this.deepLink = str2;
        this.downloadLink = str3;
        this.storeLink = tTMStoreLink;
    }
}
