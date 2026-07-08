package com.ss.android.ugc.aweme.amazon.model;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class AmazonWebMessage {

    @C09CT("messageCode")
    public final String messageCode;

    @C09CT("messageDetails")
    public final String messageDetails;

    @C09CT("url")
    public final String url;

    public AmazonWebMessage(String str, String str2, String str3) {
        this.messageCode = str;
        this.messageDetails = str2;
        this.url = str3;
    }
}
