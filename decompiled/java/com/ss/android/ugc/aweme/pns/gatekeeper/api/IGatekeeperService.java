package com.ss.android.ugc.aweme.pns.gatekeeper.api;

import X.C0N0M;
import X.C0NR2;
import X.C100H;
import X.C1174004iY;
import X.C1916630zyX;
import android.os.Bundle;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.networkservice.DecisionMakerNetworkApi;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS112S1000000_28;

/* JADX INFO: loaded from: classes29.dex */
public interface IGatekeeperService {
    DecisionMakerNetworkApi.EligibilityModel LIZ(String str);

    void LIZIZ(C1916630zyX c1916630zyX);

    void LIZJ(boolean z);

    void LIZLLL(Object obj);

    void LJ(List<? extends C0NR2> list);

    void LJFF();

    void LJI(C0N0M c0n0m);

    boolean LJII();

    void LJIIIIZZ(String str, Bundle bundle, Long l);

    void LJIIIZ(C100H c100h);

    C1174004iY LJIIJ(Map map, AwS112S1000000_28 awS112S1000000_28);

    void LJIIJJI(DecisionMakerNetworkApi.EligibilityModel eligibilityModel);

    void LJIIL(String str);

    void LJIILIIL(List<Pair<String, String>> list);

    void reset();
}
