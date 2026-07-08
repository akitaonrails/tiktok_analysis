package com.ss.android.ugc.aweme.miniapp.net;

import X.C080U;
import X.C0X7C;
import X.C0X9O;
import X.C0X9Q;
import X.C0X9S;
import X.InterfaceC1485405rg;
import X.InterfaceC1501010pAB;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
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
public interface IAppbrandNetworkApi {
    @InterfaceC2174608fY
    @InterfaceC1501010pAB(hasBody = true, method = "DELETE")
    C0X9S<TypedInput> delete(@InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC1485405rg TypedOutput typedOutput, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj, @InterfaceC820680WHi boolean z);

    @InterfaceC2174608fY
    @InterfaceC1501160pAQ
    C0X9S<TypedInput> getRaw(@InterfaceC820680WHi boolean z, @InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj, @InterfaceC820680WHi boolean z2);

    @C0X9O
    @InterfaceC2174608fY
    C0X9S<TypedInput> head(@InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC1485405rg TypedOutput typedOutput, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj, @InterfaceC820680WHi boolean z);

    @InterfaceC2174608fY
    @C0X7C
    C0X9S<TypedInput> options(@InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC1485405rg TypedOutput typedOutput, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj, @InterfaceC820680WHi boolean z);

    @InterfaceC2174608fY
    @InterfaceC1501170pAR
    C0X9S<TypedInput> post(@InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC1485405rg TypedOutput typedOutput, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj, @InterfaceC820680WHi boolean z);

    @InterfaceC1501170pAR
    C0X9S<String> postBody(@InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC1485405rg TypedOutput typedOutput, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj);

    @InterfaceC2174608fY
    @C0X9Q
    C0X9S<TypedInput> put(@InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC1485405rg TypedOutput typedOutput, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj, @InterfaceC820680WHi boolean z);
}
