package com.ss.android.ugc.aweme.image;

import X.C080U;
import X.C0X8N;
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
import X.InterfaceC837580WtQ;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
@C0X8N
public interface I3rdPriorityDownloadImage {
    @InterfaceC1501160pAQ
    @InterfaceC837580WtQ(671088647)
    @InterfaceC1501320pAg(2)
    @InterfaceC2174608fY
    C0X9S<TypedInput> downloadFileForHigh(@InterfaceC820680WHi boolean z, @InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj);

    @InterfaceC1501160pAQ
    @InterfaceC837580WtQ(671088647)
    @InterfaceC1501320pAg(3)
    @InterfaceC2174608fY
    C0X9S<TypedInput> downloadFileForImmediate(@InterfaceC820680WHi boolean z, @InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj);

    @InterfaceC1501160pAQ
    @InterfaceC837580WtQ(671088647)
    @InterfaceC1501320pAg(0)
    @InterfaceC2174608fY
    C0X9S<TypedInput> downloadFileForLow(@InterfaceC820680WHi boolean z, @InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj);

    @InterfaceC1501160pAQ
    @InterfaceC837580WtQ(671088647)
    @InterfaceC1501320pAg(1)
    @InterfaceC2174608fY
    C0X9S<TypedInput> downloadFileForNormal(@InterfaceC820680WHi boolean z, @InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj);
}
