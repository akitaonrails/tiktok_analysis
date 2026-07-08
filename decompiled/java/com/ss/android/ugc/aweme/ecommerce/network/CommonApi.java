package com.ss.android.ugc.aweme.ecommerce.network;

import X.C080U;
import X.C0X9N;
import X.C0X9Q;
import X.C0X9S;
import X.InterfaceC1485405rg;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC2174708fZ;
import X.InterfaceC2174808fa;
import X.InterfaceC2174908fb;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface CommonApi {
    @C0X9N
    C0X9S<String> doDelete(@InterfaceC2174708fZ String str);

    @C0X9N
    C0X9S<String> doDelete(@InterfaceC2174708fZ String str, @InterfaceC2174908fb int i, @InterfaceC2174808fa List<C080U> list);

    @C0X9N
    C0X9S<String> doDelete(@InterfaceC2174708fZ String str, @InterfaceC2174808fa List<C080U> list);

    @C0X9N
    C0X9S<String> doDelete(@InterfaceC2174708fZ String str, @InterfaceC1501130pAN Map<String, String> map);

    @InterfaceC1501160pAQ
    C0X9S<String> doGet(@InterfaceC2174708fZ String str);

    @InterfaceC1501160pAQ
    C0X9S<String> doGet(@InterfaceC2174708fZ String str, @InterfaceC2174908fb int i);

    @InterfaceC1501160pAQ
    C0X9S<String> doGet(@InterfaceC2174708fZ String str, @InterfaceC2174908fb int i, @InterfaceC1501130pAN Map<String, String> map);

    @InterfaceC1501160pAQ
    C0X9S<String> doGet(@InterfaceC2174708fZ String str, @InterfaceC1501130pAN Map<String, String> map);

    @InterfaceC1501160pAQ
    C0X9S<String> doGet(@InterfaceC2174708fZ String str, @InterfaceC1501130pAN Map<String, String> map, @InterfaceC2174808fa List<C080U> list);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR
    C0X9S<String> doPost(@InterfaceC2174708fZ String str, @InterfaceC2174908fb int i, @InterfaceC1501150pAP Map<String, String> map);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR
    C0X9S<String> doPost(@InterfaceC2174708fZ String str, @InterfaceC2174908fb int i, @InterfaceC1501150pAP Map<String, String> map, @InterfaceC1501130pAN Map<String, String> map2);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR
    C0X9S<String> doPost(@InterfaceC2174708fZ String str, @InterfaceC1501150pAP Map<String, String> map);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR
    C0X9S<String> doPost(@InterfaceC2174708fZ String str, @InterfaceC1501150pAP Map<String, String> map, @InterfaceC2174808fa List<C080U> list);

    @InterfaceC1501170pAR
    C0X9S<String> postBody(@InterfaceC2174708fZ String str, @InterfaceC1485405rg TypedOutput typedOutput, @InterfaceC2174808fa List<C080U> list);

    @C0X9Q
    C0X9S<String> putBody(@InterfaceC2174708fZ String str, @InterfaceC1485405rg TypedOutput typedOutput, @InterfaceC2174808fa List<C080U> list);
}
