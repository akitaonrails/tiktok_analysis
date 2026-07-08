package com.ss.android.ugc.aweme.search.common.api;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class NilStruct {

    @C09CT("code")
    public final int code;

    @C09CT("reason")
    public final String reason;

    public NilStruct() {
        this(null, -1);
    }

    public NilStruct(String str, int i) {
        this.reason = str;
        this.code = i;
    }
}
