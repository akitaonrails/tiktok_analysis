package com.ss.android.ugc.aweme.account.hook;

import X.AbstractC2252651DEx;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C0PEM;
import X.C0VP5;
import X.C0XQ6;
import X.C0XVH;
import X.C0XVI;
import X.C15O7;
import X.C1DFH;
import X.C2107308Nj;
import X.C23260099m;
import X.InterfaceC1364105Vn;
import X.InterfaceC2385309Wh;
import kotlin.Unit;

/* JADX INFO: loaded from: classes14.dex */
public final class FlushCookieHook implements AfterLoginHook {
    public final C0XVH LIZIZ = C0XVH.FLUSH_COOKIE_HOOK;
    public final boolean LIZJ = true;

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
    public final boolean LIZIZ() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final C0XVH LIZJ() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final Object LIZ(final C0XVI c0xvi, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        C0XQ6.LIZ.getClass();
        C15O7.LIZJ(C0VP5.LL).LIZLLL(new InterfaceC2385309Wh() { // from class: X.0XVF
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                C1C7U.LIZ("FlushCookieHook@8c91.run$2$1");
                C0XVC.LIZIZ("FlushCookieHook", Long.valueOf(jCurrentTimeMillis), c0xvi);
                InterfaceC1364105Vn<Unit> interfaceC1364105Vn2 = c23260099m;
                Unit unit = Unit.LIZ;
                C189200o6.m2constructorimpl(unit);
                interfaceC1364105Vn2.resumeWith(unit);
                C1C7U.LIZIZ("FlushCookieHook@8c91.run$2$1");
                return unit;
            }
        });
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
