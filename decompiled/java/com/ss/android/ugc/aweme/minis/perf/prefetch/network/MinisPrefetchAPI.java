package com.ss.android.ugc.aweme.minis.perf.prefetch.network;

import X.C0X9N;
import X.C0X9O;
import X.C0X9P;
import X.C0X9Q;
import X.C0X9S;
import X.InterfaceC1485405rg;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC2174708fZ;
import X.InterfaceC2175608fi;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public interface MinisPrefetchAPI {
    @C0X9N
    C0X9S<Map<String, Object>> makeDeleteRequest(@InterfaceC2174708fZ String str, @InterfaceC2175608fi Map<String, String> map);

    @InterfaceC1501160pAQ
    C0X9S<Map<String, Object>> makeGetRequest(@InterfaceC2174708fZ String str, @InterfaceC2175608fi Map<String, String> map);

    @C0X9O
    C0X9S<Map<String, Object>> makeHeadRequest(@InterfaceC2174708fZ String str, @InterfaceC2175608fi Map<String, String> map);

    @C0X9P
    C0X9S<Map<String, Object>> makePatchRequest(@InterfaceC2174708fZ String str, @InterfaceC2175608fi Map<String, String> map);

    @InterfaceC1501170pAR
    C0X9S<Map<String, Object>> makePostRequest(@InterfaceC2174708fZ String str, @InterfaceC2175608fi Map<String, String> map, @InterfaceC1485405rg Object obj);

    @C0X9Q
    C0X9S<Map<String, Object>> makePutRequest(@InterfaceC2174708fZ String str, @InterfaceC2175608fi Map<String, String> map, @InterfaceC1485405rg Object obj);
}
