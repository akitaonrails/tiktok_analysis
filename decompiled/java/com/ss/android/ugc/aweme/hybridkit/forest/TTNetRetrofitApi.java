package com.ss.android.ugc.aweme.hybridkit.forest;

import X.C0X9O;
import X.C0X9S;
import X.InterfaceC1501160pAQ;
import X.InterfaceC2174608fY;
import X.InterfaceC2174708fZ;
import X.InterfaceC2175608fi;
import X.InterfaceC2177008fw;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public interface TTNetRetrofitApi {
    @InterfaceC2174608fY
    @InterfaceC1501160pAQ
    C0X9S<TypedInput> getStreamRequest(@InterfaceC2174708fZ String str, @InterfaceC2175608fi Map<String, String> map, @InterfaceC2177008fw Object obj);

    @C0X9O
    @InterfaceC2174608fY
    C0X9S<Void> headStreamRequest(@InterfaceC2174708fZ String str, @InterfaceC2175608fi Map<String, String> map, @InterfaceC2177008fw Object obj);
}
