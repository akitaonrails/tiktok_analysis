package com.ss.android.ugc.aweme.live.api;

import X.AbstractC842530X3j;
import X.C0X8N;
import X.C0X9S;
import X.InterfaceC1485405rg;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC2174708fZ;
import X.InterfaceC2175608fi;
import X.InterfaceC837580WtQ;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
@C0X8N
public interface TTLiveThirdPartyApi {
    @InterfaceC1501160pAQ
    @InterfaceC837580WtQ(671088656)
    C0X9S<TypedInput> doGet(@InterfaceC2174708fZ String str, @InterfaceC2175608fi Map<String, String> map);

    @InterfaceC1501170pAR
    @InterfaceC837580WtQ(671088656)
    C0X9S<TypedInput> doPost(@InterfaceC2174708fZ String str, @InterfaceC2175608fi Map<String, String> map, @InterfaceC1485405rg AbstractC842530X3j abstractC842530X3j);
}
