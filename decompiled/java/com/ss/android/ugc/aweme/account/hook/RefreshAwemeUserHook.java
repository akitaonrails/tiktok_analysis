package com.ss.android.ugc.aweme.account.hook;

import X.AbstractC2238408pq;
import X.AbstractC2252651DEx;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C0PEM;
import X.C0X3A;
import X.C0XVG;
import X.C0XVH;
import X.C0XVI;
import X.C1DFH;
import X.C2107308Nj;
import X.C23260099m;
import X.C294010Bfj;
import X.InterfaceC1364105Vn;
import X.InterfaceC2385309Wh;
import kotlin.Unit;

/* JADX INFO: loaded from: classes14.dex */
public final class RefreshAwemeUserHook implements AfterLoginHook, AfterSwitchAccountHook {
    public final C0XVH LIZIZ = C0XVH.REFRESH_AWEME_USER;
    public final C0XVG LIZJ = C0XVG.REFRESH_AWEME_USER;
    public final AbstractC2238408pq LIZLLL;
    public final boolean LJ;

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final boolean LJ(C0XVI c0xvi) {
        return true;
    }

    public RefreshAwemeUserHook() {
        C1DFH c1dfh = C0PEM.LIZ;
        this.LIZLLL = C2107308Nj.LIZ;
        this.LJ = true;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final boolean LIZIZ() {
        return this.LJ;
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

    @Override // com.ss.android.ugc.aweme.account.hook.AfterSwitchAccountHook
    public final boolean LJI(C0XVI c0xvi) {
        boolean z;
        if (C294010Bfj.LIZIZ() != 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final Object LIZ(final C0XVI c0xvi, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        C0X3A.LIZIZ(c0xvi.LIZ).LIZLLL(new InterfaceC2385309Wh() { // from class: X.0XVE
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                C1C7U.LIZ("RefreshAwemeUserHook@a92e.run$2$1");
                C0XVC.LIZIZ("RefreshAwemeUserHook", Long.valueOf(jCurrentTimeMillis), c0xvi);
                InterfaceC1364105Vn<Unit> interfaceC1364105Vn2 = c23260099m;
                Unit unit = Unit.LIZ;
                C189200o6.m2constructorimpl(unit);
                interfaceC1364105Vn2.resumeWith(unit);
                C1C7U.LIZIZ("RefreshAwemeUserHook@a92e.run$2$1");
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
