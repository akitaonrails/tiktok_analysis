package com.ss.android.ugc.aweme.compliance.consent;

import X.C01GW;
import X.C1914870zvh;
import X.C1915240zwI;
import X.C1915300zwO;
import X.C1915660zwy;
import X.C1915700zx2;
import X.C1915720zx4;
import X.C282300B4q;
import X.C452501pT;
import X.C844470XAv;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentSDKConfigService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pns.consent.api.IPNSConsentHandler;
import com.ss.android.ugc.aweme.pns.consent.collector.api.IPNSConsentCollectorService;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes29.dex */
public final class PNSConsentSDKConfigServiceImpl implements IPNSConsentSDKConfigService {
    public final C01GW LIZ;
    public final C01GW LIZIZ;

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentSDKConfigService
    public final C1915720zx4 LIZ() {
        return (C1915720zx4) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentSDKConfigService
    public final IPNSConsentCollectorService LIZIZ() {
        return (IPNSConsentCollectorService) this.LIZIZ.getValue();
    }

    public PNSConsentSDKConfigServiceImpl() {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C1915240zwI());
        this.LIZ = c01gwLIZIZ;
        this.LIZIZ = C452501pT.LIZIZ(new C1914870zvh());
        Object value = c01gwLIZIZ.getValue();
        C844470XAv.LIZ.getClass();
        String strValueOf = String.valueOf(C844470XAv.LJIIJ);
        C1915300zwO c1915300zwO = new C1915300zwO(strValueOf);
        c1915300zwO.LIZ = false;
        c1915300zwO.LIZIZ = true;
        c1915300zwO.LIZJ = "CONSENT_SDK_KEVA";
        c1915300zwO.LIZLLL = ((Boolean) C282300B4q.LIZ.getValue()).booleanValue();
        if (C1915720zx4.LIZIZ) {
            value.getClass();
        } else {
            synchronized (value) {
                try {
                    C1915720zx4.LIZJ = new C1915700zx2(strValueOf, c1915300zwO.LIZJ, c1915300zwO.LIZ, c1915300zwO.LIZIZ, c1915300zwO.LIZLLL);
                    C1915720zx4.LIZIZ = true;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            ((C1915660zwy) C1915720zx4.LJIIIZ.getValue()).LIZLLL("init_sdk", null);
        }
        Set services = ServiceManager.get().getServices(IPNSConsentHandler.class);
        if (!services.isEmpty()) {
            for (Object obj : services) {
                this.LIZ.getValue().getClass();
                CopyOnWriteArrayList<IPNSConsentHandler> copyOnWriteArrayList = C1915720zx4.LIZLLL;
                if (!copyOnWriteArrayList.contains(obj)) {
                    copyOnWriteArrayList.add((IPNSConsentHandler) obj);
                }
            }
        }
        IPNSConsentCollectorService iPNSConsentCollectorService = (IPNSConsentCollectorService) this.LIZIZ.getValue();
        if (iPNSConsentCollectorService != null) {
            iPNSConsentCollectorService.LIZ();
        }
    }
}
