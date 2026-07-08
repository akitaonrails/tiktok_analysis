package com.bytedance.hybrid.spark.roma;

import X.AbstractC1552040qUU;
import X.C09RB;
import X.C13LP;
import X.C1421705hP;
import X.C1529360ptu;
import X.C1529370ptv;
import X.C1533560q0g;
import X.C1533570q0h;
import X.C1550580qS8;
import X.C1550600qSA;
import X.C1551940qUK;
import X.C1957407lc;
import X.C19719612Di;
import X.C2028707x7;
import X.C2152008bu;
import X.C2281108wj;
import X.C2282908x1;
import X.EnumC2281308wl;
import Y.ARunnableS123S0100000_23;
import Y.ARunnableS92S0200000_23;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.hybrid.spark.roma.deploy.IGeckoService;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS53S1000000_2;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes24.dex */
public final class RomaGeckoService extends AbstractC1552040qUU implements IGeckoService {
    public static final /* synthetic */ int LIZLLL = 0;
    public volatile Function2<? super String, ? super Long, Unit> LIZIZ;
    public final Keva LIZ = Keva.getRepo("spark_deploy_gecko_channels");
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);

    @Override // com.bytedance.hybrid.spark.roma.deploy.IGeckoService
    public final boolean enable() {
        return true;
    }

    public final void LJJI() {
        Long first;
        Iterator<Object> it2 = new C1957407lc(new C1421705hP(this, null)).iterator();
        while (true) {
            C2152008bu c2152008bu = (C2152008bu) it2;
            if (!c2152008bu.hasNext()) {
                return;
            }
            Pair pair = (Pair) c2152008bu.next();
            String str = (String) pair.getFirst();
            Pair<Long, Boolean> pairLJIIJ = C1550600qSA.LJIIJ((String) pair.getSecond(), str, true);
            this.LIZ.storeLong(str, (pairLJIIJ == null || (first = pairLJIIJ.getFirst()) == null) ? 0L : first.longValue());
        }
    }

    public final void LJJIFFI() {
        if (this.LIZJ.compareAndSet(false, true)) {
            C2282908x1.LIZIZ.LIZ.LIZIZ();
            C1551940qUK.LJIIL(this);
            ExecutorService executorService = C2281108wj.LIZ;
            C2281108wj.LIZIZ(EnumC2281308wl.Sequence, true, new ARunnableS123S0100000_23(this, 18));
        }
    }

    @Override // X.AbstractC1552040qUU, X.InterfaceC1551180qT6
    public final void LIZ(String str) {
        this.LIZ.erase(str);
        LJJII(C09RB.LJIIIZ(new C1957407lc(new C1421705hP(this, null)), new AwS53S1000000_2(str, 3)));
    }

    @Override // com.bytedance.hybrid.spark.roma.deploy.IGeckoService
    public final void LIZIZ(List<C1550580qS8> list) {
        LJJIFFI();
        ExecutorService executorService = C2281108wj.LIZ;
        C2281108wj.LIZIZ(EnumC2281308wl.Sequence, true, new ARunnableS92S0200000_23(this, list, 13));
    }

    @Override // com.bytedance.hybrid.spark.roma.deploy.IGeckoService
    public final void LIZLLL(C2028707x7 c2028707x7) {
        synchronized (this) {
            try {
                this.LIZIZ = c2028707x7;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.AbstractC1552040qUU
    public final void LJFF(UpdatePackage updatePackage) {
        if (updatePackage != null && this.LIZ.contains(updatePackage.getChannel())) {
            this.LIZ.storeLong(updatePackage.getChannel(), updatePackage.getVersion());
            Function2<? super String, ? super Long, Unit> function2 = this.LIZIZ;
            if (function2 != null) {
                function2.invoke(updatePackage.getChannel(), Long.valueOf(updatePackage.getVersion()));
            }
        }
    }

    public final void LJJII(Sequence<Pair<String, String>> sequence) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair<String, String> pair : sequence) {
            String second = pair.getSecond();
            Object arrayList = linkedHashMap.get(second);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(second, arrayList);
            }
            ((List) arrayList).add(pair.getFirst());
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((List) ((Map.Entry) it2.next()).getValue()).size() + 2));
        }
        ArrayList arrayList3 = new ArrayList(C13LP.LJZI(arrayList2));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            arrayList3.add(key);
            arrayList3.add(String.valueOf(list.size()));
            C19719612Di.LJJI(list, arrayList3);
        }
        this.LIZ.storeStringArray("__ak__", (String[]) arrayList3.toArray(new String[0]));
    }

    @Override // com.bytedance.hybrid.spark.roma.deploy.IGeckoService
    public final Long LIZJ(String str, boolean z) {
        String str2;
        C1533560q0g c1533560q0g;
        C1533570q0h c1533570q0h;
        if (!z) {
            Long lValueOf = Long.valueOf(this.LIZ.getLong(str, 0L));
            if (lValueOf.longValue() != 0) {
                return lValueOf;
            }
        } else {
            C1529370ptv c1529370ptv = C1529360ptu.LIZIZ;
            if (c1529370ptv == null || (c1533560q0g = c1529370ptv.LIZLLL) == null || (c1533570q0h = c1533560q0g.LIZIZ) == null || (str2 = c1533570q0h.LIZ) == null) {
                str2 = "";
            }
            Pair<Long, Boolean> pairLJIIJ = C1550600qSA.LJIIJ(str2, str, true);
            if (pairLJIIJ != null) {
                return pairLJIIJ.getFirst();
            }
        }
        return null;
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIL(long j, UpdatePackage updatePackage) {
        LJFF(updatePackage);
    }
}
