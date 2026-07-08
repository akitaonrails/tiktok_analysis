package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network;

import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC2174708fZ;
import X.InterfaceC2175608fi;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface ACPCheckoutApiService {
    @InterfaceC1501170pAR
    Object confirmOrder(@InterfaceC2174708fZ String str, @InterfaceC2175608fi Map<String, String> map, @InterfaceC1485405rg ACPCheckoutRequestBody aCPCheckoutRequestBody, InterfaceC1364105Vn<? super ACPCheckoutResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR
    Object createOrder(@InterfaceC2174708fZ String str, @InterfaceC2175608fi Map<String, String> map, @InterfaceC1485405rg ACPCheckoutRequestBody aCPCheckoutRequestBody, InterfaceC1364105Vn<? super ACPCheckoutResponse> interfaceC1364105Vn);
}
