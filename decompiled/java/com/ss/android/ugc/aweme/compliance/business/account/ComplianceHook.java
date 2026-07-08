package com.ss.android.ugc.aweme.compliance.business.account;

import X.AbstractC2238408pq;
import X.AbstractC2252651DEx;
import X.AbstractC848400XPy;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C0PEM;
import X.C0XQ7;
import X.C0XVG;
import X.C0XVH;
import X.C0XVI;
import X.C100F;
import X.C1DFH;
import X.C2107308Nj;
import X.C23260099m;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.account.hook.AfterLoginHook;
import com.ss.android.ugc.aweme.account.hook.AfterSwitchAccountHook;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import kotlin.Unit;

/* JADX INFO: loaded from: classes14.dex */
public final class ComplianceHook implements AfterLoginHook, AfterSwitchAccountHook {
    public final C0XVH LIZIZ = C0XVH.COMPLIANCE_HOOK;
    public final C0XVG LIZJ = C0XVG.COMPLIANCE_HOOK;
    public final AbstractC2238408pq LIZLLL;

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final boolean LIZIZ() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterSwitchAccountHook
    public final boolean LJI(C0XVI c0xvi) {
        return true;
    }

    public ComplianceHook() {
        C1DFH c1dfh = C0PEM.LIZ;
        this.LIZLLL = C2107308Nj.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final C0XVH LIZJ() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterSwitchAccountHook
    public final C0XVG LJFF() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final AbstractC2252651DEx LJJJLL() {
        return this.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final boolean LJ(C0XVI c0xvi) {
        return !C0XQ7.LJFF().getCurUser().isUserCancelled();
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final Object LIZ(final C0XVI c0xvi, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        ComplianceServiceProvider.LJIJJ().LJJI("after_login");
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        ComplianceServiceProvider.LJJI().LJIJJLI(new C100F() { // from class: X.0XVw
            @Override // X.C100F
            public final void LIZIZ(boolean z) {
                String str;
                ComplianceServiceProvider.LJJI().LJIIJ();
                C0XGR c0xgr = new C0XGR();
                c0xgr.LIZLLL("enter_from", "ComplianceHook");
                if (c0xvi.LIZJ) {
                    str = "switch_account";
                } else {
                    str = "login";
                }
                c0xgr.LIZLLL("enter_method", str);
                c0xgr.LIZ(1, "is_hook");
                c0xgr.LIZIZ(System.currentTimeMillis() - jCurrentTimeMillis, "duration");
                C20684815ws.LJIILLIIL("account_after_auth_action", c0xgr.LIZ);
                InterfaceC1364105Vn<Unit> interfaceC1364105Vn2 = c23260099m;
                Unit unit = Unit.LIZ;
                C189200o6.m2constructorimpl(unit);
                interfaceC1364105Vn2.resumeWith(unit);
            }
        }, ((AbstractC848400XPy) C0XQ7.LJFF()).isNewUser() ? 1 : 0);
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        if (objLIZ == C099R.LJFF()) {
            return objLIZ;
        }
        return Unit.LIZ;
    }
}
