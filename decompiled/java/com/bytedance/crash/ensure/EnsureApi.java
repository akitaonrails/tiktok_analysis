package com.bytedance.crash.ensure;

import X.C1AF0;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C792600V7i;
import X.C805380Via;
import X.RunnableC801900Vcy;
import com.bytedance.crash.monitor.k;
import com.bytedance.services.apm.api.IEnsure;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.Collection;
import java.util.Map;
import jl3.g;

/* JADX INFO: loaded from: classes14.dex */
public final class EnsureApi {
    public static boolean LIZ;

    public static void LIZ() {
        if (LIZ) {
            return;
        }
        LIZ = true;
        try {
            IEnsure iEnsure = new IEnsure() { // from class: com.bytedance.crash.ensure.EnsureApi.1
                @Override // com.bytedance.services.apm.api.IEnsure
                public void ensureNotReachHere() {
                    k.LIZJ().LJFF(5);
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public boolean ensureFalse(boolean z) {
                    return false;
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public boolean ensureNotEmpty(Collection collection) {
                    return false;
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public boolean ensureNotNull(Object obj) {
                    return false;
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public void ensureNotReachHere(String str) {
                    k.LIZJ().LJII(5, str);
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public boolean ensureTrue(boolean z) {
                    return false;
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public void reportLogException(Throwable th) {
                    ensureNotReachHere(th);
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public void ensureNotReachHere(Throwable th) {
                    C805380Via.LIZIZ(th);
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public boolean ensureFalse(boolean z, String str) {
                    return false;
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public boolean ensureNotNull(Object obj, String str) {
                    return false;
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public void ensureNotReachHere(String str, Map<String, String> map) {
                    RunnableC801900Vcy runnableC801900VcyLIZJ = k.LIZJ();
                    if (runnableC801900VcyLIZJ.LIZLLL("core_exception_monitor", str)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("reportMessage：isDrop:");
                        sbLIZ.append(str);
                        C2188811AlT.LIZIZ(sbLIZ);
                        return;
                    }
                    Thread threadU3 = C786410Ut5.u3();
                    runnableC801900VcyLIZJ.LJIIIZ(new g(null, ThreadMethodProxy.getStackTrace(threadU3), 5, str, map, threadU3.getName(), "EnsureNotReachHere", "core_exception_monitor"));
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public boolean ensureTrue(boolean z, String str) {
                    return false;
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public void reportLogException(Throwable th, String str) {
                    ensureNotReachHere(th, str);
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public void ensureNotReachHere(Throwable th, String str) {
                    C805380Via.LIZJ(th, str);
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public boolean ensureFalse(boolean z, String str, Map<String, String> map) {
                    return false;
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public void ensureNotReachHere(Throwable th, String str, Map<String, String> map) {
                    C805380Via.LIZLLL(th, str, map);
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public boolean ensureTrue(boolean z, String str, Map<String, String> map) {
                    return false;
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public void reportLogException(int i, Throwable th, String str) {
                    ensureNotReachHere(th, str);
                }
            };
            C792600V7i.LIZ.put(IEnsure.class, iEnsure);
            C1AF0.LIZ = iEnsure;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
