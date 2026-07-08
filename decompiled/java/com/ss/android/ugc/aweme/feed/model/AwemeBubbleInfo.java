package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public final class AwemeBubbleInfo implements Serializable {

    @C09CT("biz")
    public final int biz;

    @C09CT("log_extra")
    public final String logExtra;

    @C09CT("scheme_url")
    public final String schemeUrl;

    @C09CT("text")
    public final String text;

    @C09CT("type")
    public final int type;

    public AwemeBubbleInfo(int i, int i2, String str, String str2, String str3) {
        this.biz = i;
        this.type = i2;
        this.text = str;
        this.schemeUrl = str2;
        this.logExtra = str3;
    }
}
