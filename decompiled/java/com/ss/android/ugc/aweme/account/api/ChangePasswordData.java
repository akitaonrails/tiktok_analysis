package com.ss.android.ugc.aweme.account.api;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class ChangePasswordData {

    @C09CT("error_code")
    public final Integer errorCode;

    @C09CT("description")
    public final String errorMsg;

    public ChangePasswordData() {
        this(0, "");
    }

    public ChangePasswordData(Integer num, String str) {
        this.errorCode = num;
        this.errorMsg = str;
    }
}
