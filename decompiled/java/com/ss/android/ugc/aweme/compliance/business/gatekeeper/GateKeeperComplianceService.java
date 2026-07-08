package com.ss.android.ugc.aweme.compliance.business.gatekeeper;

import X.C1916630zyX;
import android.os.Bundle;
import com.ss.android.ugc.aweme.compliance.api.services.gatekeeper.IGateKeeperComplianceService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService;

/* JADX INFO: loaded from: classes3.dex */
public final class GateKeeperComplianceService implements IGateKeeperComplianceService {
    @Override // com.ss.android.ugc.aweme.compliance.api.services.gatekeeper.IGateKeeperComplianceService
    public final void LIZ() {
        IGatekeeperService iGatekeeperService = (IGatekeeperService) ServiceManager.get().getService(IGatekeeperService.class);
        iGatekeeperService.LIZIZ(new C1916630zyX());
        iGatekeeperService.LJIIIIZZ("AppStart", new Bundle(), null);
    }
}
