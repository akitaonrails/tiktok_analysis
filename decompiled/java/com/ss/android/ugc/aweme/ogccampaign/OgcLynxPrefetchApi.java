package com.ss.android.ugc.aweme.ogccampaign;

import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC2174708fZ;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface OgcLynxPrefetchApi {
    @InterfaceC1501160pAQ
    Object prefetchGet(@InterfaceC2174708fZ String str, @InterfaceC1501130pAN Map<String, String> map, InterfaceC1364105Vn<? super String> interfaceC1364105Vn);

    @InterfaceC1501170pAR
    Object prefetchPost(@InterfaceC2174708fZ String str, @InterfaceC1485405rg Map<String, String> map, InterfaceC1364105Vn<? super String> interfaceC1364105Vn);
}
