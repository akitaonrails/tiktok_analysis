package com.bytedance.android.livesdk.client;

import X.C0X52;
import X.C0X9S;
import X.C11NZ;
import X.InterfaceC1485405rg;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC2174708fZ;
import X.InterfaceC2175608fi;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface IMessageApi {
    @InterfaceC1501160pAQ
    C11NZ<C0X52<TypedInput>> doGetAsync(@InterfaceC2174708fZ String str, @InterfaceC2175608fi Map<String, String> map, @InterfaceC1501130pAN Map<String, String> map2);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR
    C0X9S<TypedInput> doPost(@InterfaceC2174708fZ String str, @InterfaceC2175608fi Map<String, String> map, @InterfaceC1501130pAN Map<String, String> map2, @InterfaceC1501150pAP Map<String, String> map3);

    @InterfaceC1501170pAR
    C11NZ<C0X52<TypedInput>> doPostAsync(@InterfaceC2174708fZ String str, @InterfaceC2175608fi Map<String, String> map, @InterfaceC1501130pAN Map<String, String> map2, @InterfaceC1485405rg TypedOutput typedOutput);
}
