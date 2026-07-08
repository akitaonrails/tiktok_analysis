package com.bytedance.sync.v4.ttnet;

import X.C080U;
import X.C0X9S;
import X.InterfaceC1485405rg;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC2174708fZ;
import X.InterfaceC2174808fa;
import X.InterfaceC2174908fb;
import X.InterfaceC820680WHi;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface ISyncNetworkApi {
    @InterfaceC1501160pAQ
    C0X9S<String> get(@InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC2174808fa List<C080U> list, @InterfaceC820680WHi boolean z);

    @InterfaceC1501170pAR
    C0X9S<String> postData(@InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1485405rg TypedOutput typedOutput, @InterfaceC2174808fa List<C080U> list, @InterfaceC820680WHi boolean z);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR
    C0X9S<String> postForm(@InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501150pAP(encode = true) Map<String, String> map, @InterfaceC2174808fa List<C080U> list, @InterfaceC820680WHi boolean z);
}
