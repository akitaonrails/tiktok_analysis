package com.ss.android.ugc.profile.business.now;

import X.C0CQT;
import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.models.NowArchiveResponse;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileNowApi implements IProfileNowApi {
    public static final ProfileNowApi LIZIZ = new ProfileNowApi();
    public final /* synthetic */ IProfileNowApi LIZ = (IProfileNowApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(IProfileNowApi.class);

    @Override // com.ss.android.ugc.profile.business.now.IProfileNowApi
    @InterfaceC1501160pAQ("/tiktok/v1/now/archive")
    public C11NZ<NowArchiveResponse> fetchArchiveData(@InterfaceC1501070pAH("cursor") long j, @InterfaceC1501070pAH("count") long j2, @InterfaceC1501070pAH("load_type") int i) {
        return this.LIZ.fetchArchiveData(j, j2, i);
    }
}
