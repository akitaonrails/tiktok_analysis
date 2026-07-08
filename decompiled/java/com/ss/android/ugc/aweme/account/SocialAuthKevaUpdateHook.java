package com.ss.android.ugc.aweme.account;

import X.AbstractC2238408pq;
import X.AbstractC2252651DEx;
import X.C0PEM;
import X.C0XGR;
import X.C0XVG;
import X.C0XVH;
import X.C0XVI;
import X.C1DFH;
import X.C20684815ws;
import X.C2107308Nj;
import X.C849840XVm;
import X.C849850XVn;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.account.hook.AfterLoginHook;
import com.ss.android.ugc.aweme.account.hook.AfterSwitchAccountHook;
import kotlin.Unit;

/* JADX INFO: loaded from: classes14.dex */
public final class SocialAuthKevaUpdateHook implements AfterLoginHook, AfterSwitchAccountHook {
    public final C0XVH LIZIZ = C0XVH.SOCIAL_AUTH_KEVA_UPDATE_HOOK;
    public final C0XVG LIZJ = C0XVG.SOCIAL_AUTH_KEVA_UPDATE_HOOK;
    public final AbstractC2238408pq LIZLLL;

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final boolean LIZIZ() {
        return false;
    }

    public SocialAuthKevaUpdateHook() {
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
        C849840XVm.LIZ.getClass();
        if (C849840XVm.LIZIZ != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterSwitchAccountHook
    public final boolean LJI(C0XVI c0xvi) {
        C849840XVm.LIZ.getClass();
        if (C849840XVm.LIZIZ != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final Object LIZ(C0XVI c0xvi, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        String str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C849850XVn c849850XVn = C849850XVn.LIZIZ;
        if (c849850XVn.LIZJ().LIZJ()) {
            c849850XVn.LIZJ().LJJIJIIJIL();
            c849850XVn.LIZJ().LJ();
        }
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", "SocialAuthKevaUpdateHook");
        if (c0xvi.LIZJ) {
            str = "switch_account";
        } else {
            str = "login";
        }
        c0xgr.LIZLLL("enter_method", str);
        c0xgr.LIZ(1, "is_hook");
        c0xgr.LIZIZ(System.currentTimeMillis() - jCurrentTimeMillis, "duration");
        C20684815ws.LJIILLIIL("account_after_auth_action", c0xgr.LIZ);
        return Unit.LIZ;
    }
}
