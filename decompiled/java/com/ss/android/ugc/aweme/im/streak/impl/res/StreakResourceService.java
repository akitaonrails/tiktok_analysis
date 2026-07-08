package com.ss.android.ugc.aweme.im.streak.impl.res;

import X.AnonymousClass0957;
import X.C123100dR;
import X.C13LP;
import X.C1590906Kt;
import X.C1608006Ri;
import X.C1608106Rj;
import X.C1608206Rk;
import X.C2188811AlT;
import X.C23250099c;
import com.ss.android.ugc.aweme.im.streak.api.IStreakResourceService;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakResourceService implements IStreakResourceService {
    @Override // com.ss.android.ugc.aweme.im.streak.api.IStreakResourceService
    public final void LIZ(List<C1608206Rk> list) {
        for (C1608206Rk c1608206Rk : C13LP.LJJJJI(list)) {
            synchronized (C1608106Rj.LIZIZ) {
                if (C123100dR.LIZ(C1608106Rj.LIZLLL.get(c1608206Rk))) {
                    boolean z = C1590906Kt.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("StreakGeckoResourceUtil loadGeckoResource, geckoResource: ");
                    sbLIZ.append(c1608206Rk);
                    sbLIZ.append(", cache hit");
                    C1590906Kt.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    ConcurrentHashMap<C1608206Rk, AnonymousClass0957<Unit>> concurrentHashMap = C1608106Rj.LJ;
                    if (concurrentHashMap.get(c1608206Rk) != null) {
                        boolean z2 = C1590906Kt.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("StreakGeckoResourceUtil loadGeckoResource, geckoResource: ");
                        sbLIZ2.append(c1608206Rk);
                        sbLIZ2.append(", request hit");
                        C1590906Kt.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    } else {
                        concurrentHashMap.put(c1608206Rk, C23250099c.LIZIZ(C1608106Rj.LJI, null, null, new C1608006Ri(c1608206Rk, null), 3));
                    }
                }
            }
        }
    }
}
