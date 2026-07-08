package com.ss.android.ugc.aweme.ecommerce.model;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import com.google.gson.n;
import java.io.Serializable;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class ClaimIncentiveInfo implements Serializable {

    @C09CT("need_request")
    public final Boolean needRequest;

    @C09CT("request_info")
    public final String requestInfo;
    public final C01GW requestInfoObj$delegate;

    public ClaimIncentiveInfo() {
        this(Boolean.FALSE, null);
    }

    public final n getRequestInfoObj() {
        return (n) this.requestInfoObj$delegate.getValue();
    }

    public ClaimIncentiveInfo(Boolean bool, String str) {
        this.needRequest = bool;
        this.requestInfo = str;
        this.requestInfoObj$delegate = C452501pT.LIZIZ(new AwS570S0100000_26(this, 646));
    }
}
