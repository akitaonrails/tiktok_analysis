package com.ss.android.ugc.aweme.loginplatform;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class LoginMethodConfirmConfig {

    @C09CT("body")
    public final String body;

    @C09CT("cancel_btn_text")
    public final String cancelBtnText;

    @C09CT("ok_btn_text")
    public final String okBtnText;

    @C09CT("title")
    public final String title;

    public LoginMethodConfirmConfig() {
        this(null, null, null, null);
    }

    public LoginMethodConfirmConfig(String str, String str2, String str3, String str4) {
        this.title = str;
        this.body = str2;
        this.okBtnText = str3;
        this.cancelBtnText = str4;
    }
}
