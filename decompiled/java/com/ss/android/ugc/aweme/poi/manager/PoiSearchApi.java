package com.ss.android.ugc.aweme.poi.manager;

import X.C0X9S;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC2174708fZ;
import X.InterfaceC2175608fi;
import X.InterfaceC820680WHi;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface PoiSearchApi {
    @InterfaceC1501170pAR
    C0X9S<String> doPost(@InterfaceC2174708fZ String str, @InterfaceC2175608fi Map<String, String> map, @InterfaceC1485405rg TypedOutput typedOutput, @InterfaceC820680WHi boolean z);

    @InterfaceC1501170pAR
    C0X9S<TypedInput> doPostPb(@InterfaceC2174708fZ String str, @InterfaceC2175608fi Map<String, String> map, @InterfaceC1485405rg TypedOutput typedOutput, @InterfaceC820680WHi boolean z);
}
