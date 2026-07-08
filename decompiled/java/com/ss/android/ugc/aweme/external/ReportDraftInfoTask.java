package com.ss.android.ugc.aweme.external;

import X.C0C64;
import X.C0CCZ;
import X.C0CHQ;
import X.C0M2U;
import X.C0PEM;
import X.C0VZ0;
import X.C2296808zG;
import X.C23250099c;
import X.C561810M1r;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.bytedance.keva.Keva;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ReportDraftInfoTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ReportDraftInfoTask";
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
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C0M2U.LIZ.getClass();
        if (C0CHQ.LIZ().getAccountService().isLogin()) {
            Keva keva = C0M2U.LIZIZ;
            if (System.currentTimeMillis() - keva.getLong("last_report_info_time", 0L) >= C0C64.LJIILLIIL().LJIJJLI(31744, 0L, "studio_draft_report_limit", true) && C0C64.LJIILLIIL().LJIJJLI(31744, 0L, "studio_draft_report_limit", true) > 0) {
                keva.storeLong("last_report_info_time", System.currentTimeMillis());
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C561810M1r(null), 3);
            }
        }
    }
}
