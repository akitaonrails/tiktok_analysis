package com.ss.android.ugc.aweme.legoImp.task;

import X.AnonymousClass0716;
import X.C0N6R;
import X.C1559110qft;
import X.C1595430rcT;
import X.C1785606z0;
import X.C1827607Du;
import X.C1BN8;
import X.C1EQW;
import X.C2179771ASp;
import X.C2212231Bi9;
import X.C2219251BtT;
import X.C786410Ut5;
import X.C791390V2r;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes25.dex */
public final class PreloadInstanceApplicationTask extends PreloadInstanceTask {
    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PreloadInstanceApplicationTask";
    }

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return !AnonymousClass0716.LIZIZ();
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (C1827607Du.LJIIIZ(AFwS190S0000000_4.get$arr$(3588), C1785606z0.LIZ())) {
            C0N6R.LIZ();
        }
        if (C1827607Du.LJIIIZ(AFwS190S0000000_4.get$arr$(3592), C1785606z0.LIZ())) {
            C791390V2r c791390V2r = C791390V2r.LJJIII;
        }
        C1EQW.LIZ.getClass();
        if (((Boolean) C1EQW.LJIL.getValue()).booleanValue()) {
            ComplianceServiceProvider.LJI().LJJIIJZLJL();
        }
        C2179771ASp.LJIIIIZZ();
        try {
            C786410Ut5.H2(context, "audio");
            C786410Ut5.H2(context, "activity");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1BN8.LIZ();
        ((IUgCommonService) ServiceManager.get().getService(IUgCommonService.class)).LJIIIIZZ();
        String str = C2212231Bi9.LIZ;
        if (!((Boolean) AnonymousClass0716.LJIIJ.getValue()).booleanValue()) {
            ServiceManager.get().getService(IUserService.class);
        }
        if (((Boolean) C2219251BtT.LIZIZ.getValue()).booleanValue()) {
            C1559110qft.LIZIZ = C1595430rcT.LIZIZ.LIZJ().shouldInitSocial2TabV1();
            C1559110qft.LIZ = true;
        }
    }
}
