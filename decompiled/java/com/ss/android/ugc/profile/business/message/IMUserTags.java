package com.ss.android.ugc.profile.business.message;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class IMUserTags {

    @C09CT("ba")
    public final List<Integer> baTags;

    @C09CT("oa")
    public final List<Integer> oaTags;

    public IMUserTags() {
        this(null, null);
    }

    public IMUserTags(List<Integer> list, List<Integer> list2) {
        this.baTags = list;
        this.oaTags = list2;
    }
}
