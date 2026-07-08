package com.ss.android.ugc.aweme.account.login.passkey.api;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class PasskeyRemoveData {

    @C09CT("credentials")
    public final List<PasskeyCredential> credentials;

    @C09CT("error_code")
    public final String errorCode;

    public PasskeyRemoveData() {
        this("", null);
    }

    public PasskeyRemoveData(String str, List<PasskeyCredential> list) {
        this.errorCode = str;
        this.credentials = list;
    }
}
