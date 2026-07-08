package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class SingleResourceRefreshResp {

    @C09CT("fallback_icon_type")
    public final Integer fallbackIconType;

    @C09CT("public_resource_id")
    public final Long resId;

    @C09CT("ttl")
    public final Long ttl;

    @C09CT("resource_urls")
    public final List<String> urlList;

    public SingleResourceRefreshResp(List<String> list, Long l, Long l2, Integer num) {
        this.urlList = list;
        this.resId = l;
        this.ttl = l2;
        this.fallbackIconType = num;
    }
}
