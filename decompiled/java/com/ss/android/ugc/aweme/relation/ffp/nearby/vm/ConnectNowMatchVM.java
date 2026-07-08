package com.ss.android.ugc.aweme.relation.ffp.nearby.vm;

import X.C01GW;
import X.C054G;
import X.C11NJ;
import X.C13BV;
import X.C1687630u1B;
import X.C1687640u1C;
import X.C1689650u4R;
import X.C1910890zpH;
import X.C2097608Jq;
import X.C2296808zG;
import X.C452501pT;
import X.EnumC1687600u18;
import X.EnumC1687770u1P;
import X.EnumC1910860zpE;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.nearby.INearbyBleAdvertiser;
import com.ss.android.ugc.aweme.nearby.INearbyBleConnector;
import com.ss.android.ugc.aweme.nearby.INearbyBleGattServer;
import com.ss.android.ugc.aweme.nearby.INearbyBleScanner;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS214S0000000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class ConnectNowMatchVM extends AssemViewModel<C1687630u1B> {
    public C054G LLILLL;
    public final C01GW LL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(128));
    public final C11NJ LLILLJJLI = new C11NJ();
    public final ConcurrentMap<String, Boolean> LLILZ = new ConcurrentHashMap();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        C1687640u1C c1687640u1C = new C1687640u1C(this);
        C13BV c13bv = C13BV.INSTANCE;
        return new C1687630u1B(c13bv, c13bv, EnumC1687770u1P.UNKNOWN, EnumC1687600u18.WAITING, new ConcurrentHashMap(), c1687640u1C);
    }

    public final C1689650u4R vQ2() {
        return (C1689650u4R) this.LL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.CONNECT_NOW).LIZ("ConnectNowMatchVM", "On ConnectNowMatchVM Cleared");
        this.LLILLJJLI.LJ();
        C054G c054g = this.LLILLL;
        if (c054g != null) {
            C2296808zG.LIZJ(c054g, null);
        }
        C1689650u4R c1689650u4RVQ2 = vQ2();
        ((INearbyBleAdvertiser) c1689650u4RVQ2.LJIIJJI.getValue()).LIZ(c1689650u4RVQ2.LIZIZ);
        ((INearbyBleScanner) c1689650u4RVQ2.LJIIJ.getValue()).LIZIZ(c1689650u4RVQ2.LIZIZ);
        ((INearbyBleGattServer) c1689650u4RVQ2.LJIIL.getValue()).LIZIZ();
        ((INearbyBleConnector) c1689650u4RVQ2.LJIILIIL.getValue()).disconnect();
        c1689650u4RVQ2.LJII.clear();
        c1689650u4RVQ2.LJIIIZ.clear();
        c1689650u4RVQ2.LIZ.LJ();
    }

    public final Map<String, Long> wQ2() {
        ConcurrentHashMap<String, Long> concurrentHashMap = vQ2().LJII;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Long> entry : concurrentHashMap.entrySet()) {
            String key = entry.getKey();
            long jLongValue = entry.getValue().longValue();
            String str = vQ2().LJIIIZ.get(key);
            if (str != null) {
                arrayList.add(new Pair(str, Long.valueOf(jLongValue)));
            }
        }
        return C2097608Jq.LJIILLIIL(arrayList);
    }

    public final void yQ2() {
        C1689650u4R c1689650u4RVQ2 = vQ2();
        ((INearbyBleAdvertiser) c1689650u4RVQ2.LJIIJJI.getValue()).LIZ(c1689650u4RVQ2.LIZIZ);
        ((INearbyBleGattServer) vQ2().LJIIL.getValue()).LIZIZ();
        C1689650u4R c1689650u4RVQ22 = vQ2();
        ((INearbyBleScanner) c1689650u4RVQ22.LJIIJ.getValue()).LIZIZ(c1689650u4RVQ22.LIZIZ);
        C054G c054g = this.LLILLL;
        if (c054g != null) {
            C2296808zG.LIZJ(c054g, null);
        }
    }

    public static boolean xQ2(Long l) {
        if (l == null || System.currentTimeMillis() - l.longValue() > 10000 || System.currentTimeMillis() < l.longValue()) {
            return false;
        }
        return true;
    }
}
