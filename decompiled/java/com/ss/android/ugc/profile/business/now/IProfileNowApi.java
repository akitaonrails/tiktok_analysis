package com.ss.android.ugc.profile.business.now;

import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.models.NowArchiveResponse;

/* JADX INFO: loaded from: classes20.dex */
public interface IProfileNowApi {
    @InterfaceC1501160pAQ("/tiktok/v1/now/archive")
    C11NZ<NowArchiveResponse> fetchArchiveData(@InterfaceC1501070pAH("cursor") long j, @InterfaceC1501070pAH("count") long j2, @InterfaceC1501070pAH("load_type") int i);
}
