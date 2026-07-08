package com.bytedance.pns.scopedid;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class GetScopedUserIdResponse implements Serializable {

    @C09CT("code")
    public final int code;

    @C09CT("data")
    public final IdPairList data;

    @C09CT("msg")
    public final String msg;

    public GetScopedUserIdResponse(int i, String str, IdPairList idPairList) {
        this.code = i;
        this.msg = str;
        this.data = idPairList;
    }
}
