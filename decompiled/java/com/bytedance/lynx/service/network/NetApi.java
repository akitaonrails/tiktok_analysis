package com.bytedance.lynx.service.network;

import X.C080U;
import X.C0X9S;
import X.InterfaceC1485405rg;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501320pAg;
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

/* JADX INFO: loaded from: classes21.dex */
public interface NetApi {
    @InterfaceC1501160pAQ
    C0X9S<TypedInput> doGet(@InterfaceC820680WHi boolean z, @InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj);

    @InterfaceC1501160pAQ
    @InterfaceC1501320pAg(2)
    C0X9S<TypedInput> doGetHigh(@InterfaceC820680WHi boolean z, @InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj);

    @InterfaceC1501160pAQ
    @InterfaceC1501320pAg(3)
    C0X9S<TypedInput> doGetImmediate(@InterfaceC820680WHi boolean z, @InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj);

    @InterfaceC1501160pAQ
    @InterfaceC1501320pAg(0)
    C0X9S<TypedInput> doGetLow(@InterfaceC820680WHi boolean z, @InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj);

    @InterfaceC2174608fY
    @InterfaceC1501160pAQ
    C0X9S<TypedInput> doGetStreaming(@InterfaceC820680WHi boolean z, @InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj);

    @InterfaceC2174608fY
    @InterfaceC1501170pAR
    C0X9S<TypedInput> doPost(@InterfaceC820680WHi boolean z, @InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC2174808fa List<C080U> list, @InterfaceC1485405rg TypedOutput typedOutput, @InterfaceC2177008fw Object obj);

    @InterfaceC2174608fY
    @InterfaceC1501170pAR
    @InterfaceC1501320pAg(2)
    C0X9S<TypedInput> doPostHigh(@InterfaceC820680WHi boolean z, @InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC2174808fa List<C080U> list, @InterfaceC1485405rg TypedOutput typedOutput, @InterfaceC2177008fw Object obj);

    @InterfaceC2174608fY
    @InterfaceC1501170pAR
    @InterfaceC1501320pAg(3)
    C0X9S<TypedInput> doPostImmediate(@InterfaceC820680WHi boolean z, @InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC2174808fa List<C080U> list, @InterfaceC1485405rg TypedOutput typedOutput, @InterfaceC2177008fw Object obj);

    @InterfaceC2174608fY
    @InterfaceC1501170pAR
    @InterfaceC1501320pAg(0)
    C0X9S<TypedInput> doPostLow(@InterfaceC820680WHi boolean z, @InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC2174808fa List<C080U> list, @InterfaceC1485405rg TypedOutput typedOutput, @InterfaceC2177008fw Object obj);

    @InterfaceC2174608fY
    @InterfaceC1501170pAR
    C0X9S<TypedInput> doPostStreaming(@InterfaceC820680WHi boolean z, @InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC2174808fa List<C080U> list, @InterfaceC1485405rg TypedOutput typedOutput, @InterfaceC2177008fw Object obj);
}
