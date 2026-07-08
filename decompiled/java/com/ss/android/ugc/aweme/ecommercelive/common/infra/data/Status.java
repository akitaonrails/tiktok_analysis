package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class Status {

    @C09CT("desc")
    public final String desc;

    @C09CT("status_enum")
    public final Integer status;

    public Status() {
        this(null, null);
    }

    public Status(Integer num, String str) {
        this.status = num;
        this.desc = str;
    }
}
