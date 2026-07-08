package com.ss.android.ugc.aweme.ecommerce.ug.prefetch.api;

import X.C0X52;
import X.C1740000vNe;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC2174708fZ;
import X.InterfaceC2175608fi;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.ug.prefetch.bean.NativePrefetchResponse;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public interface NativePrefetchApi {
    public static final C1740000vNe LIZ = C1740000vNe.LIZ;

    @InterfaceC1501160pAQ
    Object prefetchForGet(@InterfaceC2174708fZ String str, @InterfaceC1501130pAN Map<String, String> map, @InterfaceC2175608fi Map<String, String> map2, @InterfaceC1485405rg n nVar, InterfaceC1364105Vn<? super C0X52<NativePrefetchResponse<Map<String, ?>>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR
    Object prefetchForPost(@InterfaceC2174708fZ String str, @InterfaceC1501130pAN Map<String, String> map, @InterfaceC2175608fi Map<String, String> map2, @InterfaceC1485405rg n nVar, InterfaceC1364105Vn<? super C0X52<NativePrefetchResponse<Map<String, ?>>>> interfaceC1364105Vn);
}
