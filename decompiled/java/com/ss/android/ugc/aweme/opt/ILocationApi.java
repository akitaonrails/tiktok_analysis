package com.ss.android.ugc.aweme.opt;

import X.C11NZ;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501350pAj;

/* JADX INFO: loaded from: classes4.dex */
public interface ILocationApi {
    @InterfaceC1501160pAQ("/activity/detect/")
    C11NZ<BackendParamsResp> activityDetect(@InterfaceC1501350pAj("x-ttnet-dns-query-type") String str, @InterfaceC1501350pAj("x-ttnet-isolation-info") String str2);
}
