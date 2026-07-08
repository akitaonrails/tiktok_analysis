package com.bytedance.pns.scopedid;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class IdPairList {

    @C09CT("list")
    public final List<IdPair> list;

    @C09CT("user_id_suffix")
    public final String userIdSuffix;

    public IdPairList() {
        this(null, "");
    }

    public IdPairList(List<IdPair> list, String str) {
        this.list = list;
        this.userIdSuffix = str;
    }
}
