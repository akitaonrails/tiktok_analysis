package com.ss.android.ugc.aweme.account.login.v2.network;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class CommitUserNameResponse {

    @C09CT("data")
    public final CommitUserNameData data;

    @C09CT("message")
    public final String message;

    public CommitUserNameResponse(String str, CommitUserNameData commitUserNameData) {
        this.message = str;
        this.data = commitUserNameData;
    }
}
