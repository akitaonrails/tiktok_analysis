package com.ss.android.ugc.aweme.account.hook;

import X.AbstractC2252651DEx;
import X.C0PEM;
import X.C0XQ5;
import X.C0XVC;
import X.C0XVH;
import X.C0XVI;
import X.C1238280iKQ;
import X.C1DFH;
import X.C2107308Nj;
import X.C786410Ut5;
import X.InterfaceC1364105Vn;
import Y.ARunnableS82S0200000_13;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.Unit;

/* JADX INFO: loaded from: classes14.dex */
public final class AccountCommonGeneralPriorityAfterLoginHook implements AfterLoginHook {
    public final C0XVH LIZIZ = C0XVH.ACCOUNT_COMMON_GENERAL_PRIORITY_HOOK;
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
        C0XVC.LIZIZ("CommonGeneralPriorityAfterLoginHook", null, c0xvi);
        if (C0XQ5.LJFF()) {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS82S0200000_13(c0xvi, this, 26));
        }
        C1238280iKQ.LIZIZ(11);
        return Unit.LIZ;
    }
}
