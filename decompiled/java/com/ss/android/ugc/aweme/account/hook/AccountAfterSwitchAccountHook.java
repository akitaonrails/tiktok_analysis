package com.ss.android.ugc.aweme.account.hook;

import X.AbstractC2252651DEx;
import X.C0PEM;
import X.C0XO2;
import X.C0XQ5;
import X.C0XVC;
import X.C0XVG;
import X.C0XVI;
import X.C1DFH;
import X.C2107308Nj;
import X.C2286608xc;
import X.C294010Bfj;
import X.C786410Ut5;
import X.InterfaceC1364105Vn;
import Y.ARunnableS113S0100000_13;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountSwitcherLogger;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;

/* JADX INFO: loaded from: classes14.dex */
public final class AccountAfterSwitchAccountHook implements AfterSwitchAccountHook {
    public final C0XVG LIZIZ = C0XVG.ACCOUNT_AFTER_SWITCH_ACCOUNT_HOOK;
    public final boolean LIZJ = true;

    @Override // com.ss.android.ugc.aweme.account.hook.AfterSwitchAccountHook
    public final boolean LJI(C0XVI c0xvi) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterSwitchAccountHook
    public final AbstractC2252651DEx LJJJLL() {
        C1DFH c1dfh = C0PEM.LIZ;
        return C2107308Nj.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterSwitchAccountHook
    public final boolean LIZIZ() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterSwitchAccountHook
    public final C0XVG LJFF() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterSwitchAccountHook
    public final Object LIZ(C0XVI c0xvi, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Long lLJFF = null;
        C0XVC.LIZIZ("AfterSwitchAccountHook", null, c0xvi);
        AccountUserService accountUserServiceLIZ = C0XQ5.LIZ();
        if (C294010Bfj.LIZIZ() != 0) {
            C0XO2 c0xo2 = c0xvi.LIZIZ;
            if (c0xo2 != null) {
                lLJFF = C2286608xc.LJFF(c0xo2.LIZ);
            }
            accountUserServiceLIZ.LJJJJ(String.valueOf(lLJFF));
        }
        IAccountSwitcherLogger iAccountSwitcherLogger = (IAccountSwitcherLogger) PluggableExtentionKt.pluggableSpi$default(IAccountSwitcherLogger.class, false, false, false, 14, null);
        if (iAccountSwitcherLogger != null) {
            iAccountSwitcherLogger.LJ();
        }
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS113S0100000_13(accountUserServiceLIZ, 85));
        return Unit.LIZ;
    }
}
