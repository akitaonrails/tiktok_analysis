package com.ss.android.ugc.aweme.ecommerce.network;

import X.InterfaceC1904907d9;
import com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.network.IECNetworkSaasService;

/* JADX INFO: loaded from: classes3.dex */
public final class ECNetworkSaasService implements IECNetworkSaasService {
    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.network.IECNetworkSaasService
    public InterfaceC1904907d9 getCommonParamsInterceptor() {
        return new SaasParamsRequestHandler();
    }
}
