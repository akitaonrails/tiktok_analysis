package com.ss.android.ugc.aweme.pipo.postpayment.impl;

import X.AbstractC1707560uXK;
import X.C098200Yq;
import X.C1211110hcb;
import X.C1697810uHb;
import X.C1707140uWe;
import X.C1707500uXE;
import X.C1707530uXH;
import X.C1707580uXM;
import X.C1707590uXN;
import X.C1707620uXQ;
import X.C189200o6;
import X.C2188811AlT;
import X.InterfaceC1707610uXP;
import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.postpayment.IPipoPostPaymentService;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoPostPaymentServiceImpl implements IPipoPostPaymentService {
    public final C1707580uXM LIZ = new C1707580uXM(new C1707620uXQ(C1697810uHb.LJIIJJI(new AbstractC1707560uXK() { // from class: X.0uXL
        @Override // X.AbstractC1707560uXK
        public final String LIZJ() {
            return "VISA_PAYMENT_SIGNAL";
        }

        @Override // X.AbstractC1707560uXK
        public final void LJ(Context context, C1707140uWe c1707140uWe, C1211110hcb c1211110hcb, String str) {
            String str2 = c1707140uWe.LIZJ;
            if (str2 != null && str2.length() != 0) {
                AbstractC1707560uXK.LJFF(context, c1707140uWe, c1211110hcb, str);
                return;
            }
            String str3 = c1707140uWe.LIZIZ;
            if (str3 != null && str3.length() != 0) {
                SmartRouter.buildRoute(context, str3).open();
            } else {
                "missing_action_url".toString();
                throw new IllegalStateException("missing_action_url");
            }
        }
    }, new AbstractC1707560uXK() { // from class: X.0uXO
        @Override // X.AbstractC1707560uXK
        public final String LIZJ() {
            return "AFTER_PAYMENT_BIND_RETAIN";
        }

        @Override // X.AbstractC1707560uXK
        public final void LJ(Context context, C1707140uWe c1707140uWe, C1211110hcb c1211110hcb, String str) {
            AbstractC1707560uXK.LJFF(context, c1707140uWe, c1211110hcb, str);
        }
    })));

    @Override // com.ss.android.ugc.aweme.pipo.postpayment.IPipoPostPaymentService
    public final void LIZ(Context context, C1707140uWe c1707140uWe, C1211110hcb c1211110hcb, C1707500uXE c1707500uXE) {
        Object c098200Yq;
        InterfaceC1707610uXP next;
        C1707580uXM c1707580uXM = this.LIZ;
        c1707580uXM.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("run action=");
        String str = c1707140uWe.LIZ;
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        C1707580uXM.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        try {
            C1707620uXQ c1707620uXQ = c1707580uXM.LIZ;
            C1707590uXN c1707590uXN = new C1707590uXN(c1707580uXM, atomicBoolean, c1707140uWe, c1211110hcb, c1707500uXE);
            Iterator<InterfaceC1707610uXP> it2 = c1707620uXQ.LIZ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.LIZIZ(c1707140uWe)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            InterfaceC1707610uXP interfaceC1707610uXP = next;
            if (interfaceC1707610uXP == null) {
                c1707590uXN.LIZ(new C1707530uXH(false, true, "unsupported_action"));
            } else {
                interfaceC1707610uXP.LIZ(context, c1707140uWe, c1211110hcb, c1707590uXN);
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            C1707580uXM.LIZ(atomicBoolean, c1707140uWe, c1211110hcb, new C1707530uXH(true, false, "handle_exception"), c1707500uXE);
        }
    }
}
