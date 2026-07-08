package com.ss.android.ugc.aweme.account.login.v2.network;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class CommitUserNameData {

    @C09CT("description")
    public final String description;

    @C09CT("error_code")
    public final Integer error_code;

    @C09CT("login_name")
    public final String login_name;

    public CommitUserNameData(Integer num, String str, String str2) {
        this.error_code = num;
        this.description = str;
        this.login_name = str2;
    }
}
