package com.ss.android.ugc.aweme.web.business.special.service.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AdAutofillAIInfoResponse implements Serializable {
    public static final int $stable = 0;

    @C09CT("code")
    public final int code;

    @C09CT("data")
    public final String data;

    @C09CT("msg")
    public final String msg;

    public AdAutofillAIInfoResponse() {
        this(-1, null, null);
    }

    public AdAutofillAIInfoResponse(int i, String str, String str2) {
        this.code = i;
        this.msg = str;
        this.data = str2;
    }
}
