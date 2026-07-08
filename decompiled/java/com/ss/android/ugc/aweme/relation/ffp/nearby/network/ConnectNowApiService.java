package com.ss.android.ugc.aweme.relation.ffp.nearby.network;

import X.AbstractC19484711Kz;
import X.C2208708l3;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes4.dex */
public final class ConnectNowApiService implements IConnectNowApi {
    public static final ConnectNowApiService LIZIZ = new ConnectNowApiService();
    public final /* synthetic */ IConnectNowApi LIZ = (IConnectNowApi) C2208708l3.LIZIZ.create(IConnectNowApi.class);

    @Override // com.ss.android.ugc.aweme.relation.ffp.nearby.network.IConnectNowApi
    @InterfaceC1501170pAR("/tiktok/user/relation/connect_now/status/update/v1")
    public AbstractC19484711Kz<BaseResponse> exitPage(@InterfaceC1501070pAH("exit") boolean z) {
        return this.LIZ.exitPage(z);
    }
}
