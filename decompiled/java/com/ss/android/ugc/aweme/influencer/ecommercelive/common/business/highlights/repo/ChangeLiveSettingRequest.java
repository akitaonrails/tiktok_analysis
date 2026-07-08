package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.repo;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class ChangeLiveSettingRequest {

    @C09CT("author_id")
    public final String authorId;

    @C09CT("type")
    public final Integer type;

    @C09CT("value")
    public final String value;

    public ChangeLiveSettingRequest() {
        this(null, null, null);
    }

    public ChangeLiveSettingRequest(Integer num, String str, String str2) {
        this.type = num;
        this.value = str;
        this.authorId = str2;
    }
}
