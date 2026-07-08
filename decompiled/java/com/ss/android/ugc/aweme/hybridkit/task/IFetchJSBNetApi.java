package com.ss.android.ugc.aweme.hybridkit.task;

import X.C080U;
import X.C0X9S;
import X.InterfaceC1485405rg;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC2174708fZ;
import X.InterfaceC2174808fa;
import X.InterfaceC2177008fw;
import X.InterfaceC820680WHi;
import com.bytedance.retrofit2.mime.TypedByteArray;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface IFetchJSBNetApi {
    @InterfaceC1501160pAQ
    C0X9S<String> fetchGet(@InterfaceC2174708fZ String str, @InterfaceC820680WHi boolean z, @InterfaceC2174808fa List<C080U> list, @InterfaceC1501130pAN Map<String, String> map, @InterfaceC2177008fw Object obj);

    @InterfaceC1501170pAR
    C0X9S<String> fetchPost(@InterfaceC2174708fZ String str, @InterfaceC820680WHi boolean z, @InterfaceC2174808fa List<C080U> list, @InterfaceC1485405rg TypedByteArray typedByteArray, @InterfaceC2177008fw Object obj);
}
