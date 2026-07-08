package com.ss.android.ugc.aweme.openauthorize.entity;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class AuthInfoResponseData {
    public final String LIZ;

    @C09CT("can_skip_confirm")
    public final boolean canSkipConfirm;

    @C09CT("client_name")
    public final String clientName;

    @C09CT("description")
    public final String description;

    @C09CT("error_code")
    public final int errorCode;

    public AuthInfoResponseData() {
        this(false, null, 0, null, null);
    }

    public AuthInfoResponseData(boolean z, String str, int i, String str2, String str3) {
        this.canSkipConfirm = z;
        this.clientName = str;
        this.errorCode = i;
        this.description = str2;
        this.LIZ = str3;
    }
}
