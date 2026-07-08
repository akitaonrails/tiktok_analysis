package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class RecommendationResponseBody {

    @C09CT("uids")
    public final List<Long> uids;

    public RecommendationResponseBody() {
        this(null);
    }

    public RecommendationResponseBody(List<Long> list) {
        this.uids = list;
    }
}
