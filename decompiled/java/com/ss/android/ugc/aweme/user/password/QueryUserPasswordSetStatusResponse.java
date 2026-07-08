package com.ss.android.ugc.aweme.user.password;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class QueryUserPasswordSetStatusResponse {

    @C09CT("data")
    public final QueryUserPasswordSetStatusData data;

    @C09CT("message")
    public final String message;

    public QueryUserPasswordSetStatusResponse(String str, QueryUserPasswordSetStatusData queryUserPasswordSetStatusData) {
        this.message = str;
        this.data = queryUserPasswordSetStatusData;
    }
}
