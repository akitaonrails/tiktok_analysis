package com.ss.android.ugc.aweme.account.hook;

import X.AbstractC2252651DEx;
import X.C0PEM;
import X.C0XQ7;
import X.C0XVC;
import X.C0XVH;
import X.C0XVI;
import X.C0XVK;
import X.C1DFH;
import X.C2107308Nj;
import X.C2286608xc;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.IPopSuiteManagerService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;

/* JADX INFO: loaded from: classes14.dex */
public final class PassportPopupConfigHook implements AfterLoginHook {
    public final C0XVH LIZIZ = C0XVH.PASSPORT_POPUP_CONFIG_HOOK;

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
        if (c0xvi.LIZLLL == C0XVK.LOGIN && !C0XQ7.LJFF().getCurUser().isUserCancelled()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final Object LIZ(C0XVI c0xvi, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        IPopSuiteManagerService iPopSuiteManagerService = (IPopSuiteManagerService) PluggableExtentionKt.pluggableSpi$default(IPopSuiteManagerService.class, false, false, false, 14, null);
        if (iPopSuiteManagerService != null) {
            Boolean.valueOf(iPopSuiteManagerService.getPassportPopupConfig());
        }
        C0XVC.LIZIZ("PassportPopupConfigHook", C2286608xc.LJFF(jCurrentTimeMillis), c0xvi);
        return Unit.LIZ;
    }
}
