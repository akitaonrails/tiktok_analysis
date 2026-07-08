package com.ss.android.ugc.aweme.legoImp.task;

import X.C04TD;
import X.C052O;
import X.C0CCZ;
import X.C0VZ0;
import X.C1602860roS;
import X.C1BWL;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.ss.android.ugc.aweme.NujPerformanceService;
import com.ss.android.ugc.aweme.journey.INujPerformanceService;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class NewUserPreloadTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "NewUserPreloadTask";
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
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        INujPerformanceService iNujPerformanceService;
        C1602860roS.LIZ.getClass();
        if (C1602860roS.LJFF() && ((Boolean) C052O.LIZ.getValue()).booleanValue()) {
            Object objLIZ = C04TD.LIZ(INujPerformanceService.class, false);
            if (objLIZ != null) {
                iNujPerformanceService = (INujPerformanceService) objLIZ;
            } else {
                if (C04TD.LJJLIL == null) {
                    synchronized (INujPerformanceService.class) {
                        if (C04TD.LJJLIL == null) {
                            C04TD.LJJLIL = new NujPerformanceService();
                        }
                    }
                }
                iNujPerformanceService = C04TD.LJJLIL;
            }
            iNujPerformanceService.LIZ(C1BWL.LIZ());
        }
    }
}
