package com.bytedance.libcore.network;

import X.AbstractC842530X3j;
import X.C080U;
import X.C11NZ;
import X.C19354410nm;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import X.InterfaceC2174808fa;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public interface IExploreApi {
    public static final C19354410nm LIZ = C19354410nm.LIZIZ;

    @InterfaceC1501170pAR("/metrics/api/v1/explore")
    @InterfaceC1501310pAf({"Content-Type: application/json"})
    C11NZ<String> reportSampled(@InterfaceC1485405rg AbstractC842530X3j abstractC842530X3j, @InterfaceC2174808fa List<C080U> list);
}
