package com.facebook.net;

import X.C080U;
import X.C0X9S;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501320pAg;
import X.InterfaceC2174608fY;
import X.InterfaceC2174708fZ;
import X.InterfaceC2174808fa;
import X.InterfaceC2174908fb;
import X.InterfaceC2177008fw;
import X.InterfaceC820680WHi;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public interface IDownloadImage {
    @InterfaceC2174608fY
    @InterfaceC1501160pAQ
    @InterfaceC1501320pAg(2)
    C0X9S<TypedInput> downloadFileForHigh(@InterfaceC820680WHi boolean z, @InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj);

    @InterfaceC2174608fY
    @InterfaceC1501160pAQ
    @InterfaceC1501320pAg(3)
    C0X9S<TypedInput> downloadFileForImmediate(@InterfaceC820680WHi boolean z, @InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj);

    @InterfaceC2174608fY
    @InterfaceC1501160pAQ
    @InterfaceC1501320pAg(0)
    C0X9S<TypedInput> downloadFileForLow(@InterfaceC820680WHi boolean z, @InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj);

    @InterfaceC2174608fY
    @InterfaceC1501160pAQ
    @InterfaceC1501320pAg(1)
    C0X9S<TypedInput> downloadFileForNormal(@InterfaceC820680WHi boolean z, @InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj);
}
