package com.ss.android.ugc.aweme.pns.consent.core.network;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class FetchConsentResponse implements Serializable {

    @C09CT("data")
    public final List<ConsentEntityWithRecord> entities;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public FetchConsentResponse() {
        this(0, "", null);
    }

    public FetchConsentResponse(int i, String str, List<ConsentEntityWithRecord> list) {
        this.statusCode = i;
        this.statusMsg = str;
        this.entities = list;
    }
}
