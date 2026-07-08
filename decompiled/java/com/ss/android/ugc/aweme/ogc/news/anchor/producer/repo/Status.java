package com.ss.android.ugc.aweme.ogc.news.anchor.producer.repo;

import X.C09CT;

/* JADX INFO: loaded from: classes30.dex */
public final class Status {

    @C09CT("status_code")
    public String statusCode;

    @C09CT("status_msg")
    public String statusMessage;

    public Status() {
        this(null, null);
    }

    public Status(String str, String str2) {
        this.statusCode = str;
        this.statusMessage = str2;
    }
}
