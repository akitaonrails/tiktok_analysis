package com.ss.android.ugc.aweme.relation.model;

import X.C09CT;
import X.C1261860iwS;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class RecMorePairList {

    @C09CT("users")
    public final List<C1261860iwS> relatedUserList;

    @C09CT("uid")
    public final String uid;

    public RecMorePairList() {
        this(null, null);
    }

    public RecMorePairList(String str, List<C1261860iwS> list) {
        this.uid = str;
        this.relatedUserList = list;
    }
}
