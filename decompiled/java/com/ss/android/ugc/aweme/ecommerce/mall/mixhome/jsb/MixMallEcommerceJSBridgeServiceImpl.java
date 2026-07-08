package com.ss.android.ugc.aweme.ecommerce.mall.mixhome.jsb;

import X.C098200Yq;
import X.C1202104n5;
import X.C13BV;
import X.C1617420sBw;
import X.C1697810uHb;
import X.C1741210vPb;
import X.C1768500w7c;
import X.C1874450ysV;
import X.C189200o6;
import X.C1AF0;
import X.C2188811AlT;
import X.C601970NjH;
import X.C606180Nq4;
import X.C606230Nq9;
import X.C606280NqE;
import X.InterfaceC1063710dmr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.IEcommerceInternalJSBridgeService;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class MixMallEcommerceJSBridgeServiceImpl implements IEcommerceInternalJSBridgeService {
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcommerceInternalJSBridgeService
    public final List<Class<? extends InterfaceC1063710dmr>> LIZ() {
        try {
            List<Class<? extends InterfaceC1063710dmr>> listLJIILJJIL = C1697810uHb.LJIILJJIL(C601970NjH.class, C606280NqE.class, C606180Nq4.class, C606230Nq9.class, C1874450ysV.class, C1617420sBw.class, C1741210vPb.class, C1768500w7c.class);
            try {
                for (Object obj : C1202104n5.LIZ().LIZIZ()) {
                    Class<? extends InterfaceC1063710dmr> cls = obj instanceof Class ? (Class) obj : null;
                    if (cls != null) {
                        listLJIILJJIL.add(cls);
                    }
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
                return listLJIILJJIL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return listLJIILJJIL;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ec_mmk register jsb, exception msg=");
            sbLIZ.append(th2.getMessage());
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            return C13BV.INSTANCE;
        }
    }
}
