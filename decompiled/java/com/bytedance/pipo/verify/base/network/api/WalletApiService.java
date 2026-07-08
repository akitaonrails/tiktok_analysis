package com.bytedance.pipo.verify.base.network.api;

import X.C0X52;
import X.C1706940uWK;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501350pAj;
import com.bytedance.pipo.verify.base.model.response.GetPinPublicKeyResponse;
import com.bytedance.pipo.verify.base.network.data.ExchangeTokenResult;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;

/* JADX INFO: loaded from: classes27.dex */
public interface WalletApiService {
    public static final C1706940uWK LIZ = C1706940uWK.LIZ;

    @InterfaceC1501170pAR("/wallet/v1/user/exchange_session")
    Object exchangeToken(@InterfaceC1501350pAj("pipo-fp-token") String str, InterfaceC1364105Vn<? super C0X52<BaseResponse<ExchangeTokenResult>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/wallet/v1/user/get_pin_pubkey")
    Object getPinPublicKey(@InterfaceC1501350pAj("pipo-fp-session-id") String str, InterfaceC1364105Vn<? super C0X52<BaseResponse<GetPinPublicKeyResponse>>> interfaceC1364105Vn);
}
