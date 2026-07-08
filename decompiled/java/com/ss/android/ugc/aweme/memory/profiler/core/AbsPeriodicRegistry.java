package com.ss.android.ugc.aweme.memory.profiler.core;

import X.AbstractC1387200mCc;
import X.C1388190mED;
import X.C1397950mTx;
import X.C13LP;
import X.C1844400y62;
import X.C1906580ziK;
import X.C2095108Ir;
import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AbsPeriodicRegistry extends AbsBridge {
    public final Set<Integer> activeSubTypes = new LinkedHashSet();

    public abstract void startMonitoring(int i, n nVar);

    public abstract void stopMonitoring(int i, n nVar);

    public final void forceStop() {
        Set setLLIIJI = C13LP.LLIIJI(this.activeSubTypes);
        this.activeSubTypes.clear();
        Iterator it2 = setLLIIJI.iterator();
        while (it2.hasNext()) {
            try {
                stopMonitoring(((Number) it2.next()).intValue(), new n());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.memory.profiler.core.AbsBridge
    public void onReceive(int i, boolean z, String str, n nVar) {
        Activity activityLIZ;
        if (z) {
            this.activeSubTypes.add(Integer.valueOf(i));
            startMonitoring(i, nVar);
            n nVar2 = new n();
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ != null) {
                n nVar3 = new n();
                nVar3.LJJII(Boolean.TRUE, "isNew");
                nVar3.LJJIIJ("event", "onStart");
                if (abstractC1387200mCcLIZIZ instanceof C1844400y62) {
                    C1844400y62 c1844400y62 = (C1844400y62) abstractC1387200mCcLIZIZ;
                    nVar3.LJJIIJ(FollowStatusChangeMethod.PARAM_UID, C2095108Ir.LIZ(c1844400y62.LIZLLL));
                    nVar3.LJJIIJ("page", c1844400y62.LIZLLL.getClass().getName());
                    Activity activityLIZIZ = c1844400y62.LIZIZ();
                    if (activityLIZIZ != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                        nVar3.LJJIIJ("hostActivity", activityLIZ.getClass().getName());
                        nVar3.LJJIIJ("hostActivityId", C2095108Ir.LIZ(activityLIZ));
                    }
                } else if (abstractC1387200mCcLIZIZ instanceof C1397950mTx) {
                    C1397950mTx c1397950mTx = (C1397950mTx) abstractC1387200mCcLIZIZ;
                    nVar3.LJJIIJ(FollowStatusChangeMethod.PARAM_UID, C2095108Ir.LIZ(c1397950mTx.LIZLLL));
                    nVar3.LJJIIJ("page", c1397950mTx.LIZLLL.getClass().getName());
                }
                nVar2.LJJIFFI("currentPage", nVar3);
            }
            sendAck(i, str, nVar2);
            return;
        }
        this.activeSubTypes.remove(Integer.valueOf(i));
        stopMonitoring(i, nVar);
        AbsBridge.sendAck$default(this, i, str, null, 4, null);
    }
}
