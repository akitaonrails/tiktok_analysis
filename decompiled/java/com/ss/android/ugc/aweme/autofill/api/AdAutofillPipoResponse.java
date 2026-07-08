package com.ss.android.ugc.aweme.autofill.api;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AdAutofillPipoResponse implements Serializable {
    public static final int $stable = 0;

    @C09CT("response")
    public final String response;

    public AdAutofillPipoResponse() {
        this(null);
    }

    public AdAutofillPipoResponse(String str) {
        this.response = str;
    }
}
