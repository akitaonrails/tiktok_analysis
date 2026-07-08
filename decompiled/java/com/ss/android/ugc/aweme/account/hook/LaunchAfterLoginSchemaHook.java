package com.ss.android.ugc.aweme.account.hook;

import X.AbstractC2252651DEx;
import X.C0PEM;
import X.C0XQ7;
import X.C0XVB;
import X.C0XVC;
import X.C0XVH;
import X.C0XVI;
import X.C1DFH;
import X.C2107308Nj;
import X.C2286608xc;
import X.C844470XAv;
import X.InterfaceC1364105Vn;
import com.bytedance.router.SmartRouter;
import kotlin.Unit;

/* JADX INFO: loaded from: classes14.dex */
public final class LaunchAfterLoginSchemaHook implements AfterLoginHook {
    public final C0XVH LIZIZ = C0XVH.LAUNCH_AFTER_LOGIN_SCHEMA_HOOK;

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final boolean LIZIZ() {
        return false;
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
    public final boolean LJ(C0XVI c0xvi) {
        if (C0XVB.LIZ(c0xvi) && !C0XQ7.LJFF().getCurUser().isUserCancelled()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final Object LIZ(C0XVI c0xvi, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String string = c0xvi.LIZ.getString("after_login_schema", "");
        if (string.length() != 0) {
            C844470XAv.LIZ.getClass();
            SmartRouter.buildRoute(C844470XAv.LIZ(), string).open();
        }
        C0XVC.LIZIZ("LaunchAfterLoginSchemaHook", C2286608xc.LJFF(jCurrentTimeMillis), c0xvi);
        return Unit.LIZ;
    }
}
