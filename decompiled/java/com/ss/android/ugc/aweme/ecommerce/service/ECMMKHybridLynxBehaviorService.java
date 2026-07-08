package com.ss.android.ugc.aweme.ecommerce.service;

import X.C098200Yq;
import X.C1311670kEn;
import X.C1339200kxC;
import X.C13BV;
import X.C13LP;
import X.C1697810uHb;
import X.C189200o6;
import X.C19719612Di;
import X.C1AF0;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class ECMMKHybridLynxBehaviorService implements IEComHybridLynxBehaviorService {
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEComHybridLynxBehaviorService
    public final List<C1311670kEn> LIZIZ() {
        Object obj;
        try {
            List listLJIILJJIL = C1697810uHb.LJIILJJIL(new C1339200kxC(68), new C1339200kxC(69));
            try {
                Set services = ServiceManager.get().getServices(IEComHybridLynxBehaviorService.class);
                ArrayList arrayList = new ArrayList();
                Iterator it2 = services.iterator();
                while (it2.hasNext()) {
                    C19719612Di.LJJI(((IEComHybridLynxBehaviorService) it2.next()).LIZ(), arrayList);
                }
                C189200o6.m2constructorimpl(arrayList);
                obj = arrayList;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                obj = c098200Yq;
            }
            C13BV c13bv = C13BV.INSTANCE;
            boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
            Object obj2 = obj;
            if (zM7isFailureimpl) {
                obj2 = c13bv;
            }
            return C13LP.LJLIL((Iterable) obj2, listLJIILJJIL);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ec_mmk register lynx behavior, exception msg=");
            sbLIZ.append(th2.getMessage());
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            return C13BV.INSTANCE;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEComHybridLynxBehaviorService
    public final List<C1311670kEn> LIZ() {
        return new ArrayList();
    }
}
