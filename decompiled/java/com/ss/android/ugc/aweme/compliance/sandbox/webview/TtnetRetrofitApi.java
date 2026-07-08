package com.ss.android.ugc.aweme.compliance.sandbox.webview;

import X.AbstractC842530X3j;
import X.C080U;
import X.C092G;
import X.C0X76;
import X.C0X7C;
import X.C0X9N;
import X.C0X9O;
import X.C0X9P;
import X.C0X9Q;
import X.C0X9S;
import X.InterfaceC1485405rg;
import X.InterfaceC1501030pAD;
import X.InterfaceC1501080pAI;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC2174608fY;
import X.InterfaceC2174708fZ;
import X.InterfaceC2174808fa;
import X.InterfaceC2177008fw;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public interface TtnetRetrofitApi {
    @InterfaceC2174608fY
    @C0X9N
    C0X9S<TypedInput> deleteStreamRequest(@InterfaceC2174708fZ String str, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj);

    @C0X9N
    C0X9S<TypedInput> deleteStreamRequestOpt(@InterfaceC2174708fZ String str, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj);

    @InterfaceC2174608fY
    @InterfaceC1501160pAQ
    C0X9S<TypedInput> getStreamRequest(@InterfaceC2174708fZ String str, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj);

    @InterfaceC1501160pAQ
    C0X9S<TypedInput> getStreamRequestOpt(@InterfaceC2174708fZ String str, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj);

    @C0X9O
    @InterfaceC2174608fY
    C0X9S<Void> headStreamRequest(@InterfaceC2174708fZ String str, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj);

    @C0X9O
    C0X9S<Void> headStreamRequestOpt(@InterfaceC2174708fZ String str, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj);

    @InterfaceC2174608fY
    @C0X7C
    C0X9S<TypedInput> optionsStreamRequest(@InterfaceC2174708fZ String str, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj);

    @C0X7C
    C0X9S<TypedInput> optionsStreamRequestOpt(@InterfaceC2174708fZ String str, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj);

    @InterfaceC2174608fY
    @C0X9P
    C0X9S<TypedInput> patchStreamRequest(@InterfaceC2174708fZ String str, @InterfaceC1485405rg AbstractC842530X3j abstractC842530X3j, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj);

    @InterfaceC2174608fY
    @InterfaceC1501170pAR
    C0X9S<TypedInput> postStreamRequest(@InterfaceC2174708fZ String str, @InterfaceC1485405rg AbstractC842530X3j abstractC842530X3j, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj);

    @InterfaceC2174608fY
    @C0X9Q
    C0X9S<TypedInput> putStreamRequest(@InterfaceC2174708fZ String str, @InterfaceC1485405rg AbstractC842530X3j abstractC842530X3j, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj);

    @InterfaceC2174608fY
    @C092G
    @InterfaceC1501170pAR
    C0X9S<TypedInput> uploadFiles(@InterfaceC2174708fZ String str, @InterfaceC2174808fa List<C080U> list, @InterfaceC1501080pAI Map<String, AbstractC842530X3j> map, @InterfaceC2177008fw Object obj, @InterfaceC1501030pAD C0X76... c0x76Arr);
}
