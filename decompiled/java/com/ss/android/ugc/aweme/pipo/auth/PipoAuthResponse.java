package com.ss.android.ugc.aweme.pipo.auth;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoAuthResponse implements Serializable {

    @C09CT("login_success_page")
    public final String loginSuccessPage;

    @C09CT("session_id")
    public final String sessionId;

    public PipoAuthResponse(String str, String str2) {
        this.loginSuccessPage = str;
        this.sessionId = str2;
    }
}
