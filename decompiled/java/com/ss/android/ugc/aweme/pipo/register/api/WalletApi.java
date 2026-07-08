package com.ss.android.ugc.aweme.pipo.register.api;

import X.C0X52;
import X.C1507020pJs;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC1501350pAj;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;

/* JADX INFO: loaded from: classes24.dex */
public interface WalletApi {
    public static final C1507020pJs LIZ = C1507020pJs.LIZ;

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/wallet/v1/user/trigger_user_register")
    Object getRegisterResponse(@InterfaceC1501350pAj("pipo-fp-token") String str, @InterfaceC1501050pAF("merchant_id") String str2, @InterfaceC1501070pAH("biz_content") String str3, @InterfaceC1501070pAH("priority_region") String str4, @InterfaceC1501070pAH("send_request_timestamp") String str5, InterfaceC1364105Vn<? super C0X52<BaseResponse<Object>>> interfaceC1364105Vn);
}
