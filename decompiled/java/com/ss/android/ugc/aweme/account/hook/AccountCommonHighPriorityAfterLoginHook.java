package com.ss.android.ugc.aweme.account.hook;

import X.AbstractC2252651DEx;
import X.C0PEM;
import X.C0XQ7;
import X.C0XVC;
import X.C0XVH;
import X.C0XVI;
import X.C1DFH;
import X.C2107308Nj;
import X.C2286608xc;
import X.InterfaceC1364105Vn;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.ICredentialManagerService;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.offline.debug.router.IDebugRouterService;
import kotlin.Unit;

/* JADX INFO: loaded from: classes14.dex */
public final class AccountCommonHighPriorityAfterLoginHook implements AfterLoginHook {
    public final C0XVH LIZIZ = C0XVH.ACCOUNT_COMMON_HIGH_PRIORITY_HOOK;
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
    public final Object LIZ(C0XVI c0xvi, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        ICredentialManagerService iCredentialManagerService;
        long jCurrentTimeMillis = System.currentTimeMillis();
        LocalTestApi localTestApi = (LocalTestApi) PluggableExtentionKt.pluggableSpi$default(LocalTestApi.class, false, false, false, 14, null);
        if (localTestApi != null) {
            localTestApi.setIsLoggedIn(true);
        }
        IDebugRouterService iDebugRouterService = (IDebugRouterService) PluggableExtentionKt.pluggableSpi$default(IDebugRouterService.class, false, false, false, 14, null);
        if (iDebugRouterService != null) {
            iDebugRouterService.LIZ();
        }
        if (TwoStepAuthApi.LJI() && !TextUtils.isEmpty(TwoStepAuthApi.LIZJ)) {
            Keva.getRepo("two_step_verification").storeBoolean("ask_next_time", false);
            String str = TwoStepAuthApi.LIZJ;
            if (str != null) {
                TwoStepAuthApi.LIZ(str, null, 6);
            }
            TwoStepAuthApi.LIZJ = null;
        }
        if (!((AccountUserService) C0XQ7.LJFF()).LIZ() && (iCredentialManagerService = (ICredentialManagerService) PluggableExtentionKt.pluggableSpi$default(ICredentialManagerService.class, false, false, false, 14, null)) != null && iCredentialManagerService.LIZJ()) {
            iCredentialManagerService.LJIILLIIL(false);
        }
        C0XVC.LIZIZ("CommonHighPriorityAfterLoginHook", C2286608xc.LJFF(jCurrentTimeMillis), c0xvi);
        return Unit.LIZ;
    }
}
