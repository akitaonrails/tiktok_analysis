package com.ss.android.ugc.aweme.compliance.business.account;

import X.AbstractC2252651DEx;
import X.C0PEM;
import X.C0XGR;
import X.C0XVH;
import X.C0XVI;
import X.C1DFH;
import X.C20684815ws;
import X.C2107308Nj;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.account.hook.AfterLoginHook;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;

/* JADX INFO: loaded from: classes14.dex */
public final class DismissConsentBoxHook implements AfterLoginHook {
    public final C0XVH LIZIZ = C0XVH.DISMISS_CONSENT_BOX_HOOK;

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final boolean LIZIZ() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final boolean LJ(C0XVI c0xvi) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final AbstractC2252651DEx LJJJLL() {
        C1DFH c1dfh = C0PEM.LIZ;
        return C2107308Nj.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final C0XVH LIZJ() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final Object LIZ(C0XVI c0xvi, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        IPNSDeviceConsentService iPNSDeviceConsentService = (IPNSDeviceConsentService) PluggableExtentionKt.pluggableSpi$default(IPNSDeviceConsentService.class, false, false, false, 14, null);
        if (iPNSDeviceConsentService != null) {
            iPNSDeviceConsentService.LJIIJ();
        }
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", "DismissConsentBoxHook");
        c0xgr.LIZLLL("enter_method", "login");
        c0xgr.LIZ(1, "is_hook");
        c0xgr.LIZIZ(System.currentTimeMillis() - jCurrentTimeMillis, "duration");
        C20684815ws.LJIILLIIL("account_after_auth_action", c0xgr.LIZ);
        return Unit.LIZ;
    }
}
