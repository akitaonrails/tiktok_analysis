package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network;

import X.AbstractC333960D7i;
import X.C0X8N;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC2174708fZ;
import X.InterfaceC2175608fi;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@C0X8N
public interface CheckoutApiService {
    @InterfaceC1501170pAR
    Object getCheckout(@InterfaceC2174708fZ String str, @InterfaceC2175608fi Map<String, String> map, @InterfaceC1485405rg TypedOutput typedOutput, InterfaceC1364105Vn<? super AbstractC333960D7i<CheckoutSession>> interfaceC1364105Vn);
}
