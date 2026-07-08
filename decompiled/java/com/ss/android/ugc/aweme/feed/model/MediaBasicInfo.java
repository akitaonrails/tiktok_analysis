package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaBasicInfo implements Serializable {

    @C09CT("http_dns_results")
    public List<HttpDnsResult> httpDnsResultList;

    @C09CT("video_http_dns_results")
    public List<HttpDnsResult> videoHttpDnsResultList;

    public MediaBasicInfo() {
        this(null, null, 3, null);
    }

    public MediaBasicInfo(List<HttpDnsResult> list, List<HttpDnsResult> list2) {
        this.httpDnsResultList = list;
        this.videoHttpDnsResultList = list2;
    }

    public MediaBasicInfo(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
    }
}
