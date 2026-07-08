package com.ss.android.ugc.aweme.wavepublish.cloudmerge.net;

import X.AbstractC842530X3j;
import X.C0X9S;
import X.InterfaceC1485405rg;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC2174708fZ;
import X.InterfaceC2174908fb;
import X.InterfaceC2175608fi;
import X.InterfaceC820680WHi;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface NLERequestApi {
    @InterfaceC1501160pAQ
    C0X9S<TypedInput> doGet(@InterfaceC820680WHi boolean z, @InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC2175608fi Map<String, String> map2);

    @InterfaceC1501170pAR
    C0X9S<TypedInput> postBody(@InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1485405rg AbstractC842530X3j abstractC842530X3j, @InterfaceC2175608fi Map<String, String> map);
}
