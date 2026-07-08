package com.ss.android.ugc.tiktok.pns.network.core.api;

import X.C080U;
import X.C0X52;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC2174608fY;
import X.InterfaceC2174708fZ;
import X.InterfaceC2174808fa;
import X.InterfaceC2177008fw;
import X.InterfaceC820680WHi;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface PNSApi {
    @InterfaceC2174608fY
    @InterfaceC1501160pAQ
    Object doGet(@InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC2174808fa List<C080U> list, @InterfaceC820680WHi boolean z, @InterfaceC2177008fw Object obj, InterfaceC1364105Vn<? super C0X52<TypedInput>> interfaceC1364105Vn);

    @InterfaceC2174608fY
    @InterfaceC1501170pAR
    Object doPostEmpty(@InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC2174808fa List<C080U> list, @InterfaceC820680WHi boolean z, @InterfaceC2177008fw Object obj, InterfaceC1364105Vn<? super C0X52<TypedInput>> interfaceC1364105Vn);

    @InterfaceC2174608fY
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR
    Object doPostForm(@InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC1501150pAP Map<String, String> map2, @InterfaceC2174808fa List<C080U> list, @InterfaceC820680WHi boolean z, @InterfaceC2177008fw Object obj, InterfaceC1364105Vn<? super C0X52<TypedInput>> interfaceC1364105Vn);

    @InterfaceC2174608fY
    @InterfaceC1501170pAR
    Object doPostJson(@InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC1485405rg Object obj, @InterfaceC2174808fa List<C080U> list, @InterfaceC820680WHi boolean z, @InterfaceC2177008fw Object obj2, InterfaceC1364105Vn<? super C0X52<TypedInput>> interfaceC1364105Vn);
}
