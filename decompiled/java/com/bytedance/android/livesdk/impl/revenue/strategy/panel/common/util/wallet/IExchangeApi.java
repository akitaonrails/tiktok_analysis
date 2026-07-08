package com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.util.wallet;

import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.bytedance.android.live.network.response.BaseResponse;

/* JADX INFO: loaded from: classes18.dex */
public interface IExchangeApi {
    @InterfaceC1501160pAQ("/webcast/wallet_api/exchange_kyc/")
    C11NZ<BaseResponse<Object, BaseCustomErrorExtra>> checkExchangeKyc(@InterfaceC1501070pAH("source") int i, @InterfaceC1501070pAH("sub_source") int i2);
}
