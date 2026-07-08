package com.bytedance.bdturing.ttnet;

import X.C080U;
import X.C0X9S;
import X.InterfaceC1485405rg;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC2174608fY;
import X.InterfaceC2174708fZ;
import X.InterfaceC2174808fa;
import X.InterfaceC820680WHi;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface INetworkApi {
    @InterfaceC1501160pAQ
    C0X9S<TypedInput> doGet(@InterfaceC820680WHi boolean z, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN Map<String, String> map, @InterfaceC2174808fa List<C080U> list);

    @InterfaceC2174608fY
    @InterfaceC1501170pAR
    C0X9S<TypedInput> doPost(@InterfaceC2174708fZ String str, @InterfaceC1501130pAN Map<String, String> map, @InterfaceC1485405rg TypedOutput typedOutput, @InterfaceC2174808fa List<C080U> list);
}
