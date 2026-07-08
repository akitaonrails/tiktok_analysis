package com.ss.android.socialbase.ttnet;

import X.C080U;
import X.C0X9O;
import X.C0X9S;
import X.InterfaceC1501160pAQ;
import X.InterfaceC2174608fY;
import X.InterfaceC2174708fZ;
import X.InterfaceC2174808fa;
import X.InterfaceC2177008fw;
import X.InterfaceC820680WHi;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public interface IDownloadApi {
    @InterfaceC2174608fY
    @InterfaceC1501160pAQ
    C0X9S<TypedInput> get(@InterfaceC820680WHi boolean z, @InterfaceC2174708fZ String str, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj);

    @C0X9O
    @InterfaceC2174608fY
    C0X9S<Void> head(@InterfaceC820680WHi boolean z, @InterfaceC2174708fZ String str, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj);
}
