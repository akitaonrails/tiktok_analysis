package com.bytedance.pia.core.worker.network;

import X.AbstractC842530X3j;
import X.C080U;
import X.C0X7C;
import X.C0X9N;
import X.C0X9O;
import X.C0X9P;
import X.C0X9Q;
import X.C0X9S;
import X.InterfaceC1485405rg;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC2174608fY;
import X.InterfaceC2174708fZ;
import X.InterfaceC2174808fa;
import X.InterfaceC820680WHi;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public interface IWorkerRetrofitApi {
    @InterfaceC2174608fY
    @C0X9N
    C0X9S<TypedInput> deleteStreamRequest(@InterfaceC820680WHi boolean z, @InterfaceC2174708fZ String str, @InterfaceC2174808fa List<C080U> list);

    @InterfaceC2174608fY
    @InterfaceC1501160pAQ
    C0X9S<TypedInput> getStreamRequest(@InterfaceC820680WHi boolean z, @InterfaceC2174708fZ String str, @InterfaceC2174808fa List<C080U> list);

    @C0X9O
    @InterfaceC2174608fY
    C0X9S<TypedInput> headStreamRequest(@InterfaceC820680WHi boolean z, @InterfaceC2174708fZ String str, @InterfaceC2174808fa List<C080U> list);

    @InterfaceC2174608fY
    @C0X7C
    C0X9S<TypedInput> optionsStreamRequest(@InterfaceC820680WHi boolean z, @InterfaceC2174708fZ String str, @InterfaceC2174808fa List<C080U> list);

    @InterfaceC2174608fY
    @C0X9P
    C0X9S<TypedInput> patchStreamRequest(@InterfaceC820680WHi boolean z, @InterfaceC2174708fZ String str, @InterfaceC1485405rg AbstractC842530X3j abstractC842530X3j, @InterfaceC2174808fa List<C080U> list);

    @InterfaceC2174608fY
    @InterfaceC1501170pAR
    C0X9S<TypedInput> postStreamRequest(@InterfaceC820680WHi boolean z, @InterfaceC2174708fZ String str, @InterfaceC1485405rg AbstractC842530X3j abstractC842530X3j, @InterfaceC2174808fa List<C080U> list);

    @InterfaceC2174608fY
    @C0X9Q
    C0X9S<TypedInput> putStreamRequest(@InterfaceC820680WHi boolean z, @InterfaceC2174708fZ String str, @InterfaceC1485405rg AbstractC842530X3j abstractC842530X3j, @InterfaceC2174808fa List<C080U> list);
}
