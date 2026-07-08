package com.ss.android.ugc.aweme.commercialize.quickconversion.aipdp.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes31.dex */
public final class AiPdpWebSiteInfo implements Serializable {
    public static final int $stable = 0;
    public final String pdpTitle;
    public final String webSiteUrl;

    public AiPdpWebSiteInfo() {
        this(null, null);
    }

    public AiPdpWebSiteInfo(String str, String str2) {
        this.pdpTitle = str;
        this.webSiteUrl = str2;
    }
}
