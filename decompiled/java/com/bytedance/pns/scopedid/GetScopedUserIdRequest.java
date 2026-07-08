package com.bytedance.pns.scopedid;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class GetScopedUserIdRequest implements Serializable {

    @C09CT("biz_ids")
    public final String[] bizIds;

    public GetScopedUserIdRequest(String[] strArr) {
        this.bizIds = strArr;
    }
}
