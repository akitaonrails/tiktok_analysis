package com.bytedance.kmp.network.runtime;

import X.C0X9S;
import X.InterfaceC1485405rg;
import X.InterfaceC1501010pAB;
import X.InterfaceC1501060pAG;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501360pAk;
import X.InterfaceC2175608fi;
import X.InterfaceC2177008fw;
import X.InterfaceC820680WHi;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public interface KmpNetworkRetrofitService {
    @InterfaceC1501010pAB(hasBody = true, method = "{method}", path = "{path}")
    C0X9S<TypedInput> executeWithParams(@InterfaceC1501360pAk("method") String str, @InterfaceC1501060pAG(encode = false, value = "path") String str2, @InterfaceC1501130pAN Map<String, String> map, @InterfaceC2175608fi Map<String, String> map2, @InterfaceC1485405rg TypedOutput typedOutput, @InterfaceC820680WHi boolean z, @InterfaceC2177008fw Object obj);
}
