package com.ss.android.ugc.aweme.pipo.probe.core.infoupload;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class ProbeUploadRequest {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("container_type")
    public String containerType;

    @C09CT("data")
    public String data;

    @C09CT("transaction_id")
    public String transactionId;

    public ProbeUploadRequest(String str, String str2, String str3) {
        this.transactionId = str;
        this.containerType = str2;
        this.data = str3;
    }
}
