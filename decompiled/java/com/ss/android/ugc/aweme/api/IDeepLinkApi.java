package com.ss.android.ugc.aweme.api;

import X.C0X9S;
import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC2174708fZ;
import X.InterfaceC2177008fw;
import com.bytedance.retrofit2.mime.TypedInput;

/* JADX INFO: loaded from: classes29.dex */
public interface IDeepLinkApi {
    @InterfaceC1501160pAQ
    C0X9S<TypedInput> fetchLongUrl(@InterfaceC2174708fZ String str, @InterfaceC2177008fw Object obj);

    @InterfaceC1501160pAQ("/tiktok/linker/target/get/v1/")
    C11NZ<LinkTransResult> transUrl(@InterfaceC1501070pAH("url") String str);

    @InterfaceC1501160pAQ("/tiktok/linker/target/get/v1/")
    C0X9S<LinkTransResult> transUrlCall(@InterfaceC1501070pAH("url") String str);
}
