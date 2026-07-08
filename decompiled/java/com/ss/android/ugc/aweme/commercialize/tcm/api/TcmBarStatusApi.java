package com.ss.android.ugc.aweme.commercialize.tcm.api;

import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;

/* JADX INFO: loaded from: classes24.dex */
public interface TcmBarStatusApi {
    @InterfaceC1501160pAQ("/aweme/v1/commerce/tcm/params/through/get")
    C11NZ<TcmBarStatusResponse> getBarStatus(@InterfaceC1501070pAH("service_name") String str, @InterfaceC1501070pAH("service_method") String str2, @InterfaceC1501070pAH("item_id") long j, @InterfaceC1501070pAH("order_id") long j2);
}
