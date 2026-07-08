package com.ss.android.ugc.aweme;

import X.C0X9S;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC2174708fZ;
import X.InterfaceC2175608fi;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public interface RewardAdAdapterApi {
    @InterfaceC1501160pAQ
    C0X9S<String> getRequest(@InterfaceC2174708fZ String str, @InterfaceC2175608fi Map<String, String> map, @InterfaceC1501130pAN Map<String, String> map2);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR
    C0X9S<String> postRequest(@InterfaceC2174708fZ String str, @InterfaceC2175608fi Map<String, String> map, @InterfaceC1501150pAP(encode = true) Map<String, String> map2);
}
