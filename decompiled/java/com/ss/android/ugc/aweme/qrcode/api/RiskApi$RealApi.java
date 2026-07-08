package com.ss.android.ugc.aweme.qrcode.api;

import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public interface RiskApi$RealApi {
    @InterfaceC1501160pAQ("/aweme/v2/risk/url/")
    ListenableFuture<Object> getRiskUrlModel(@InterfaceC1501070pAH("request_url") String str);
}
