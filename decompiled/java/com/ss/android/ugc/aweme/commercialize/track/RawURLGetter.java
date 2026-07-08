package com.ss.android.ugc.aweme.commercialize.track;

import X.C01GW;
import X.C080U;
import X.C0XI1;
import X.C15O7;
import X.C452501pT;
import X.C823050WQl;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501310pAf;
import X.InterfaceC2174708fZ;
import X.InterfaceC2174808fa;
import X.InterfaceC844460XAu;
import Y.ACallableS65S1100000_13;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class RawURLGetter {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(105));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(106));

    public interface RawUrlApi {
        @InterfaceC1501160pAQ
        @InterfaceC844460XAu("vas_ad_track")
        @InterfaceC1501310pAf({"x-tt-dataflow-id: 671089410"})
        ListenableFuture<String> doGet(@InterfaceC2174708fZ String str, @InterfaceC2174808fa List<C080U> list);
    }

    public static final void LIZ(String str, C0XI1 c0xi1) {
        C15O7.LIZIZ(new ACallableS65S1100000_13(c0xi1, str, 0), C823050WQl.LIZLLL(), null);
    }
}
