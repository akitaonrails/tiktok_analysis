package com.ss.android.ugc.aweme.effectplatform;

import X.AbstractC842530X3j;
import X.C0X9S;
import X.InterfaceC1485405rg;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import X.InterfaceC2174608fY;
import X.InterfaceC2174708fZ;
import X.InterfaceC2174908fb;
import X.InterfaceC820680WHi;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface EffectNetworkAPI {
    @InterfaceC2174608fY
    @InterfaceC1501160pAQ
    @InterfaceC1501310pAf({"x-tt-dataflow-id: 671088651"})
    C0X9S<TypedInput> doGet(@InterfaceC820680WHi boolean z, @InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map);

    @InterfaceC2174608fY
    @InterfaceC1501170pAR
    C0X9S<TypedInput> doPost(@InterfaceC820680WHi boolean z, @InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1485405rg Map<String, Object> map);

    @InterfaceC2174608fY
    @InterfaceC1501170pAR
    C0X9S<TypedInput> doPost(@InterfaceC820680WHi boolean z, @InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC1485405rg Map<String, Object> map2);

    @InterfaceC2174608fY
    @InterfaceC1501170pAR
    C0X9S<TypedInput> doPostWithMultipartBody(@InterfaceC820680WHi boolean z, @InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC1485405rg AbstractC842530X3j abstractC842530X3j);
}
