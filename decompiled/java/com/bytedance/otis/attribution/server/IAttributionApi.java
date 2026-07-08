package com.bytedance.otis.attribution.server;

import X.C080U;
import X.C11NZ;
import X.C2225391C8b;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC2174808fa;
import X.InterfaceC2174908fb;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public interface IAttributionApi {
    public static final C2225391C8b LIZ = C2225391C8b.LIZ;

    @InterfaceC1501170pAR("/hippo/diagnosis/api/v1/explore/attribution")
    C11NZ<String> reportAttribution(@InterfaceC1485405rg TypedOutput typedOutput, @InterfaceC2174908fb int i, @InterfaceC2174808fa List<C080U> list);
}
