package com.ss.android.ugc.aweme.feed.account;

import X.AbstractC2252651DEx;
import X.C0PEM;
import X.C0XGR;
import X.C0XVH;
import X.C0XVI;
import X.C1832307Fp;
import X.C1DFH;
import X.C20684815ws;
import X.C2107308Nj;
import X.C799890VZj;
import X.C799900VZk;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.account.hook.AfterLoginHook;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.journey.INewUserMainModuleService;
import kotlin.Unit;

/* JADX INFO: loaded from: classes14.dex */
public final class FeedPreloadHook implements AfterLoginHook {
    public final C0XVH LIZIZ = C0XVH.FEED_PRELOAD_HOOK;

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
        C1832307Fp.LIZ.getClass();
        return C1832307Fp.LIZJ(true);
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final Object LIZ(C0XVI c0xvi, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        INewUserMainModuleService iNewUserMainModuleService = (INewUserMainModuleService) PluggableExtentionKt.pluggableSpi$default(INewUserMainModuleService.class, false, false, false, 14, null);
        if (iNewUserMainModuleService != null) {
            C799900VZk.LIZ.getClass();
            C799890VZj c799890VZj = new C799890VZj();
            c799890VZj.LIZ(iNewUserMainModuleService.LJFF(1, 3));
            c799890VZj.LIZIZ();
        }
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", "FeedPreloadHook");
        c0xgr.LIZLLL("enter_method", "login");
        c0xgr.LIZ(1, "is_hook");
        c0xgr.LIZIZ(System.currentTimeMillis() - jCurrentTimeMillis, "duration");
        C20684815ws.LJIILLIIL("account_after_auth_action", c0xgr.LIZ);
        return Unit.LIZ;
    }
}
