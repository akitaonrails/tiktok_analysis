package com.ss.android.ugc.aweme.aigc;

import X.C09CT;
import X.InterfaceC2126708Uv;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class ResponseAIGCQuotas {

    @C09CT("quotas")
    public final List<Quota> quotas;

    @C09CT("status_code")
    @InterfaceC2126708Uv
    public final int status_code;

    @C09CT("status_msg")
    public final String status_msg;

    public ResponseAIGCQuotas(int i, String str, List<Quota> list) {
        this.status_code = i;
        this.status_msg = str;
        this.quotas = list;
    }
}
