package com.ss.android.ugc.aweme.aigc.graph.spi;

import X.C098200Yq;
import X.C0LX3;
import X.C15442062u;
import X.C189200o6;
import X.C201955140j;
import X.C2188811AlT;
import X.C552800LmA;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class AIGCArchRegistryImpl implements IAIGCArchRegistry {
    @Override // com.ss.android.ugc.aweme.aigc.graph.spi.IAIGCArchRegistry
    public final Set<String> LIZ(Set<String> set) {
        Object c098200Yq;
        C552800LmA.LIZ.LIZ();
        if (!((Set) C552800LmA.LIZJ.getValue()).containsAll(set)) {
            try {
                IDfCameraBizAigcContributor iDfCameraBizAigcContributor = (IDfCameraBizAigcContributor) PluggableExtentionKt.pluggableSpi$default(IDfCameraBizAigcContributor.class, false, false, false, 14, null);
                if (iDfCameraBizAigcContributor != null) {
                    iDfCameraBizAigcContributor.LIZ(this);
                    c098200Yq = Unit.LIZ;
                } else {
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C0LX3 c0lx3 = C0LX3.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("DF contributor resolution/contribute failed: IDfCameraBizAigcContributor, ");
                sbLIZ.append(thM5exceptionOrNullimpl);
                C201955140j.LJIILL(c0lx3, "AIGCArchRegistryImpl", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        C552800LmA.LIZ.LIZ();
        return C15442062u.LJII(set, (Set) C552800LmA.LIZJ.getValue());
    }
}
