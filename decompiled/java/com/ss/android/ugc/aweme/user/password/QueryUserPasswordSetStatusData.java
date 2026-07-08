package com.ss.android.ugc.aweme.user.password;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class QueryUserPasswordSetStatusData {

    @C09CT("description")
    public final String description;

    @C09CT("error_code")
    public int errorCode;

    @C09CT("has_set")
    public final Boolean hasSet;

    public QueryUserPasswordSetStatusData(Boolean bool, String str, int i) {
        this.hasSet = bool;
        this.description = str;
        this.errorCode = i;
    }
}
