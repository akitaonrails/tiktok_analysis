package com.ss.android.ugc.aweme.account.hook;

import X.AbstractC2238408pq;
import X.AbstractC2252651DEx;
import X.AbstractC848400XPy;
import X.C0PEM;
import X.C0XQ7;
import X.C0XVB;
import X.C0XVC;
import X.C0XVG;
import X.C0XVH;
import X.C0XVI;
import X.C1DFH;
import X.C2107308Nj;
import X.C2286608xc;
import X.C294010Bfj;
import X.C786410Ut5;
import X.C844470XAv;
import X.InterfaceC1364105Vn;
import Y.ARunnableS113S0100000_13;
import Y.ARunnableS18S0100100_13;
import android.os.Bundle;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.Unit;

/* JADX INFO: loaded from: classes14.dex */
public final class LoginRestartHook implements AfterLoginHook, AfterSwitchAccountHook {
    public final C0XVH LIZIZ = C0XVH.LOGIN_RESTART_HOOK;
    public final AbstractC2238408pq LIZJ;

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final boolean LIZIZ() {
        return false;
    }

    public LoginRestartHook() {
        C1DFH c1dfh = C0PEM.LIZ;
        this.LIZJ = C2107308Nj.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterSwitchAccountHook
    public final C0XVG LJFF() {
        return C294010Bfj.LIZ() ? C0XVG.EARLY_RESTART : C0XVG.LOGIN_RESTART_HOOK;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final C0XVH LIZJ() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final AbstractC2252651DEx LJJJLL() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final boolean LJ(C0XVI c0xvi) {
        if (!C0XVB.LIZ(c0xvi) && !C0XQ7.LJFF().getCurUser().isUserCancelled()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterSwitchAccountHook
    public final boolean LJI(C0XVI c0xvi) {
        return !C0XVB.LIZ(c0xvi);
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final Object LIZ(C0XVI c0xvi, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        String nickname;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c0xvi.LIZJ && (C294010Bfj.LIZIZ() == 2 || C294010Bfj.LIZIZ() == 3 || C294010Bfj.LIZ())) {
            if (C294010Bfj.LIZ() && (nickname = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getNickname()) != null) {
                Bundle bundle = c0xvi.LIZ;
                C844470XAv.LIZ.getClass();
                C786410Ut5.LJJJI("switch_account_success_toast_text", C844470XAv.LIZ().getString(2131849404, nickname), bundle);
            }
            C0XVC.LIZIZ("LoginRestartHook", C2286608xc.LJFF(jCurrentTimeMillis), c0xvi);
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS113S0100000_13(c0xvi, 86));
        } else {
            C786410Ut5.LJLIIL(500L, new BPEAHandler(), new ARunnableS18S0100100_13(jCurrentTimeMillis, c0xvi, 1));
        }
        return Unit.LIZ;
    }
}
