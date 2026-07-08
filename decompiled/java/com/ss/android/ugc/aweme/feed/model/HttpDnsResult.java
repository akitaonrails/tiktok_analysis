package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class HttpDnsResult implements Serializable {

    @C09CT("domain")
    public String domain;

    @C09CT("ip_list")
    public String ipList;

    @C09CT("valid_ts")
    public Long validTime;

    public HttpDnsResult() {
        this(null, null, 0L);
    }

    public HttpDnsResult(String str, String str2, Long l) {
        this.domain = str;
        this.ipList = str2;
        this.validTime = l;
    }
}
