package com.ss.android.ugc.aweme.account;

import X.AbstractC19484711Kz;
import X.AbstractC2252651DEx;
import X.C0PEM;
import X.C0XGR;
import X.C0XVH;
import X.C0XVI;
import X.C11NJ;
import X.C11S5;
import X.C19259610Wk;
import X.C19260310Wr;
import X.C1DFH;
import X.C20684815ws;
import X.C2107308Nj;
import X.InterfaceC1364105Vn;
import Y.AfS182S0100000_13;
import com.ss.android.ugc.aweme.UgCommonResponse;
import com.ss.android.ugc.aweme.account.hook.AfterLoginHook;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IAttributionService;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import kotlin.Unit;

/* JADX INFO: loaded from: classes14.dex */
public final class UpdateAttributionHook implements AfterLoginHook {
    public final C0XVH LIZIZ = C0XVH.UPDATE_ATTRIBUTION_HOOK;

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
        C19260310Wr c19260310WrLIZIZ;
        AbstractC19484711Kz<UgCommonResponse> abstractC19484711KzLIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        IUgCommonService iUgCommonService = (IUgCommonService) PluggableExtentionKt.pluggableSpi$default(IUgCommonService.class, false, false, false, 14, null);
        if (iUgCommonService != null) {
            iUgCommonService.LJIILLIIL();
            c19260310WrLIZIZ = C19259610Wk.LIZ.LIZIZ();
        } else {
            c19260310WrLIZIZ = null;
        }
        IAttributionService iAttributionService = (IAttributionService) PluggableExtentionKt.pluggableSpi$default(IAttributionService.class, false, false, false, 14, null);
        C11NJ c11nj = new C11NJ();
        if (iAttributionService != null && (abstractC19484711KzLIZ = iAttributionService.LIZ(c19260310WrLIZIZ, true)) != null) {
            Boolean.valueOf(c11nj.LIZ(abstractC19484711KzLIZ.LJJIJIIJI(C11S5.LIZ()).LJJ(C11S5.LIZ()).LJJIIZ(new AfS182S0100000_13(c11nj, 5), new AfS182S0100000_13(c11nj, 6))));
        }
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", "UpdateAttributionHook");
        c0xgr.LIZLLL("enter_method", "login");
        c0xgr.LIZ(1, "is_hook");
        c0xgr.LIZIZ(System.currentTimeMillis() - jCurrentTimeMillis, "duration");
        C20684815ws.LJIILLIIL("account_after_auth_action", c0xgr.LIZ);
        return Unit.LIZ;
    }
}
