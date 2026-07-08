package com.ss.android.ugc.aweme.foundation.network;

import X.C0X52;
import X.C1717800unq;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501060pAG;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501350pAj;
import com.ss.android.ugc.aweme.biz.wallet.network.CommonBizContentRequestWrapper;

/* JADX INFO: loaded from: classes27.dex */
public interface DynamicApiService {
    public static final C1717800unq LIZ = C1717800unq.LIZ;

    @InterfaceC1501170pAR("{request_path}")
    Object sendData(@InterfaceC1501350pAj("pipo-fp-session-id") String str, @InterfaceC1501060pAG(encode = false, value = "request_path") String str2, @InterfaceC1485405rg CommonBizContentRequestWrapper commonBizContentRequestWrapper, InterfaceC1364105Vn<? super C0X52<String>> interfaceC1364105Vn);
}
