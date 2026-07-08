package com.ss.android.ugc.aweme.ecommerce.showcase.mix.viewmodel;

import X.C0POE;
import X.C1161850gL9;
import X.C1166240gSE;
import X.C1166360gSQ;
import X.C1166370gSR;
import X.C1553800qXK;
import X.C2097608Jq;
import X.InterfaceC0148002o;
import X.InterfaceC1166330gSN;
import X.InterfaceC1166350gSP;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenDataAbility;
import com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mix.model.TabBarItemData;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.ShopChunkResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class StoreMixViewModel extends AssemViewModel<C1166370gSR> {
    public IRavenDataAbility LL;
    public IRavenEventAbility LLILLJJLI;
    public List<TabBarItemData> LLILLL;
    public final Map<Integer, List<Function1<ShopChunkResponse, Unit>>> LLILZ = new LinkedHashMap();
    public final ConcurrentHashMap<Integer, ShopChunkResponse> LLILZIL = new ConcurrentHashMap<>();
    public final C1553800qXK LLILZLL = new C1553800qXK();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1166370gSR(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        Iterator it2 = ((LinkedHashMap) this.LLILZ).entrySet().iterator();
        while (it2.hasNext()) {
            ((List) ((Map.Entry) it2.next()).getValue()).clear();
        }
        ((LinkedHashMap) this.LLILZ).clear();
        C1553800qXK c1553800qXK = this.LLILZLL;
        c1553800qXK.LIZJ.removeCallbacksAndMessages(null);
        ((LinkedHashMap) c1553800qXK.LIZ).clear();
        synchronized (c1553800qXK.LIZIZ) {
            try {
                Iterator it3 = ((ArrayList) c1553800qXK.LIZIZ).iterator();
                while (it3.hasNext()) {
                    ((InterfaceC1166350gSP) it3.next()).cancel();
                }
                ((ArrayList) c1553800qXK.LIZIZ).clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void vQ2(C1166240gSE c1166240gSE, boolean z) {
        InterfaceC1166330gSN<C0POE<ShopChunkResponse>> interfaceC1166330gSN;
        withState(new AwS384S0200000_18((Integer) null, this, 209));
        C1161850gL9.LIZLLL(C2097608Jq.LJIIIIZZ(new Pair("is_retry", Boolean.valueOf(z)), new Pair("tab_id", 0)));
        if (c1166240gSE != null && (interfaceC1166330gSN = c1166240gSE.LJIIJJI) != null) {
            interfaceC1166330gSN.LIZJ(c1166240gSE.LIZJ, z, new C1166360gSQ(z, this, c1166240gSE));
        } else {
            withState(new AwS597S0100000_18(this, 786));
            C1161850gL9.LIZLLL(C2097608Jq.LJIIIIZZ(new Pair("tab_id", -9999), new Pair("is_retry", Boolean.valueOf(z))));
        }
    }

    public final void wQ2(int i, Function1<? super ShopChunkResponse, Unit> function1) {
        Map<Integer, List<Function1<ShopChunkResponse, Unit>>> map = this.LLILZ;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object arrayList = linkedHashMap.get(numValueOf);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(numValueOf, arrayList);
        }
        ((List) arrayList).add(function1);
        ShopChunkResponse shopChunkResponse = this.LLILZIL.get(Integer.valueOf(i));
        if (shopChunkResponse != null) {
            function1.invoke(shopChunkResponse);
        }
    }
}
