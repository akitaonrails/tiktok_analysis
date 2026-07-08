package com.ss.android.ugc.aweme.pipo.hybrid.llm;

import X.C0X52;
import X.C1723370uwp;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import X.InterfaceC2174708fZ;

/* JADX INFO: loaded from: classes27.dex */
public interface LLMNetworkApi {
    public static final C1723370uwp LIZ = C1723370uwp.LIZ;

    @InterfaceC1501170pAR
    @InterfaceC1501310pAf({"Content-Type: application/json"})
    Object postRequest(@InterfaceC2174708fZ String str, @InterfaceC1485405rg LLMWebCollectRequest lLMWebCollectRequest, InterfaceC1364105Vn<? super C0X52<Object>> interfaceC1364105Vn);
}
