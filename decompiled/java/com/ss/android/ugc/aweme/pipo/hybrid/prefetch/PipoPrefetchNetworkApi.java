package com.ss.android.ugc.aweme.pipo.hybrid.prefetch;

import X.C0X9S;
import X.C1717820uns;
import X.InterfaceC1485405rg;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC2174708fZ;
import X.InterfaceC2175608fi;
import com.google.gson.n;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public interface PipoPrefetchNetworkApi {
    public static final C1717820uns LIZ = C1717820uns.LIZ;

    @InterfaceC1501160pAQ
    C0X9S<String> getRequest(@InterfaceC2174708fZ String str, @InterfaceC2175608fi Map<String, String> map, @InterfaceC1501130pAN Map<String, String> map2);

    @InterfaceC1501170pAR
    C0X9S<String> postRequest(@InterfaceC2174708fZ String str, @InterfaceC2175608fi Map<String, String> map, @InterfaceC1501130pAN Map<String, String> map2, @InterfaceC1485405rg n nVar);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR
    C0X9S<String> postRequest(@InterfaceC2174708fZ String str, @InterfaceC2175608fi Map<String, String> map, @InterfaceC1501130pAN Map<String, String> map2, @InterfaceC1501150pAP Map<String, String> map3);
}
