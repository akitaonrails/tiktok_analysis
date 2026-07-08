package com.bytedance.crash.upload.network;

import X.C080U;
import X.C0X9S;
import X.InterfaceC1485405rg;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC2174708fZ;
import X.InterfaceC2174808fa;
import X.InterfaceC820680WHi;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public interface RetrofitCrashService {
    @InterfaceC1501160pAQ
    C0X9S<TypedInput> fetch(@InterfaceC2174708fZ String str, @InterfaceC2174808fa List<C080U> list, @InterfaceC1501130pAN Map<String, String> map, @InterfaceC820680WHi boolean z);

    @InterfaceC1501160pAQ
    C0X9S<TypedInput> fetch(@InterfaceC2174708fZ String str, @InterfaceC1501130pAN Map<String, String> map, @InterfaceC820680WHi boolean z);

    @InterfaceC1501170pAR
    C0X9S<TypedInput> report(@InterfaceC2174708fZ String str, @InterfaceC1485405rg TypedOutput typedOutput, @InterfaceC2174808fa List<C080U> list, @InterfaceC820680WHi boolean z);
}
