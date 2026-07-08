package com.ss.android.ugc.aweme.commercialize.depend;

import X.C080U;
import X.C0X9O;
import X.C0X9S;
import X.InterfaceC1485405rg;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC2174608fY;
import X.InterfaceC2174708fZ;
import X.InterfaceC2174808fa;
import X.InterfaceC2174908fb;
import X.InterfaceC2177008fw;
import X.InterfaceC820680WHi;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public interface IBaseRuntimeTTNetApi {
    @InterfaceC1501160pAQ
    C0X9S<TypedInput> doGetForStream(@InterfaceC820680WHi boolean z, @InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj);

    @InterfaceC1501160pAQ
    C0X9S<String> doGetForString(@InterfaceC820680WHi boolean z, @InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj);

    @C0X9O
    @InterfaceC2174608fY
    C0X9S<String> doHead(@InterfaceC820680WHi boolean z, @InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj);

    @InterfaceC1501170pAR
    C0X9S<TypedInput> doPostForStream(@InterfaceC820680WHi boolean z, @InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN Map<String, String> map, @InterfaceC2174808fa List<C080U> list, @InterfaceC1485405rg TypedOutput typedOutput, @InterfaceC2177008fw Object obj);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR
    C0X9S<TypedInput> doPostForStream(@InterfaceC820680WHi boolean z, @InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN Map<String, String> map, @InterfaceC2174808fa List<C080U> list, @InterfaceC1501150pAP(encode = true) Map<String, String> map2, @InterfaceC2177008fw Object obj);

    @InterfaceC1501170pAR
    C0X9S<String> doPostForString(@InterfaceC820680WHi boolean z, @InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN Map<String, String> map, @InterfaceC2174808fa List<C080U> list, @InterfaceC1485405rg TypedOutput typedOutput, @InterfaceC2177008fw Object obj);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR
    C0X9S<String> doPostForString(@InterfaceC820680WHi boolean z, @InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN Map<String, String> map, @InterfaceC2174808fa List<C080U> list, @InterfaceC1501150pAP(encode = true) Map<String, String> map2, @InterfaceC2177008fw Object obj);

    @InterfaceC2174608fY
    @InterfaceC1501160pAQ
    C0X9S<TypedInput> downloadFile(@InterfaceC820680WHi boolean z, @InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj);
}
