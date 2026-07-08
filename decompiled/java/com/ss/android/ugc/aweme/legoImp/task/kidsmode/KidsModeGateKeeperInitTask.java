package com.ss.android.ugc.aweme.legoImp.task.kidsmode;

import X.C04TD;
import X.C0CCZ;
import X.C0VZ0;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.ss.android.ugc.aweme.compliance.api.services.gatekeeper.IGateKeeperComplianceService;
import com.ss.android.ugc.aweme.compliance.business.gatekeeper.GateKeeperComplianceService;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class KidsModeGateKeeperInitTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "KidsModeGateKeeperInitTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        IGateKeeperComplianceService iGateKeeperComplianceService;
        Object objLIZ = C04TD.LIZ(IGateKeeperComplianceService.class, false);
        if (objLIZ != null) {
            iGateKeeperComplianceService = (IGateKeeperComplianceService) objLIZ;
        } else {
            if (C04TD.LLLLIILLL == null) {
                synchronized (IGateKeeperComplianceService.class) {
                    if (C04TD.LLLLIILLL == null) {
                        C04TD.LLLLIILLL = new GateKeeperComplianceService();
                    }
                }
            }
            iGateKeeperComplianceService = C04TD.LLLLIILLL;
        }
        iGateKeeperComplianceService.LIZ();
    }
}
