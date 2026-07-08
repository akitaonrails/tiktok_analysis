package com.ss.android.ugc.aweme.ecommerce.search.entrance.api;

import X.C01GW;
import X.C452501pT;
import X.InterfaceC1485505rh;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501240pAY;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.gson.n;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class EcSearchEntranceConfigApi {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(84));

    public interface RealApi {
        @InterfaceC1501240pAY("/aweme/v1/search/config/ecom/")
        @InterfaceC1485505rh
        ListenableFuture<n> fetchEcSearchEntranceConfig(@InterfaceC1501100pAK("source") String str);
    }
}
