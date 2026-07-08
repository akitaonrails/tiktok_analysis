package com.ss.android.ugc.aweme.ecommerce.service;

import X.C01GW;
import X.C08L6;
import X.C1507830pLB;
import X.C1523700pkm;
import X.C1548910qPR;
import X.C1739050vM7;
import X.C2232408os;
import X.C452501pT;
import X.C585850MyN;
import X.C740590T3h;
import X.C786410Ut5;
import X.RunnableC740580T3g;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.proto.IEcomProtobufService;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class EcomLogEventHandleServiceImpl implements IEcomLogEventHandleService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(70));

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcomLogEventHandleService
    public final void LIZ(String str, JSONObject jSONObject) {
        try {
            C1548910qPR.LIZ.getClass();
            C1548910qPR.LIZLLL(str, jSONObject);
            C1523700pkm.LIZ(str, jSONObject);
            if (Intrinsics.LJFF(str, "tiktokec_shop_entrance_show") && C740590T3h.LIZ.compareAndSet(false, true)) {
                BPEAHandler bPEAHandler = C740590T3h.LIZIZ;
                RunnableC740580T3g runnableC740580T3g = C740590T3h.LIZJ;
                bPEAHandler.removeCallbacks(runnableC740580T3g);
                if (C1739050vM7.LIZ == 2) {
                    C1739050vM7.LIZ();
                }
                C786410Ut5.LJLIIL(60000L, bPEAHandler, runnableC740580T3g);
            }
            if (C585850MyN.LIZ()) {
                IEcomProtobufService iEcomProtobufService = (IEcomProtobufService) this.LIZ.getValue();
                if (iEcomProtobufService != null) {
                    iEcomProtobufService.onEvent(str, jSONObject);
                }
                C2232408os c2232408os = C1507830pLB.LIZ;
                C1507830pLB.LIZLLL(str, jSONObject);
                C08L6.LIZ.getClass();
                C08L6.LJ(str, jSONObject);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
