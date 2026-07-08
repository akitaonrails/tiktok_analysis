package com.ss.android.ugc.aweme.main.assems;

import X.C0BVA;
import X.C1150504el;
import X.C19EG;
import X.C724240Sb0;
import X.C739670Szt;
import X.C785420UrU;
import X.C786410Ut5;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS124S0100000_24;
import android.os.Looper;
import android.view.MotionEvent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.base.IContentSecurityAbility;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes25.dex */
public final class MainContentSecurityAssem extends BaseMainContainerAssem implements IContentSecurityAbility, InterfaceC1554640qYg {
    public C785420UrU LL;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"MainContentSecurityAssem", "onCreate"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onCreate();
        C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, new BPEAHandler(Looper.getMainLooper()), new ARunnableS124S0100000_24(this, 42));
        C1150504el.LIZ().LJI(strJ4, false);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"MainContentSecurityAssem", "onResume"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onResume();
        C785420UrU c785420UrU = this.LL;
        if (c785420UrU != null) {
            c785420UrU.LIZLLL();
        }
        C1150504el.LIZ().LJI(strJ4, false);
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1529586913) {
            return null;
        }
        return this;
    }

    public final void bo() {
        C19EG c19egLIZ;
        if (this.LL != null || (c19egLIZ = C724240Sb0.LIZ(this)) == null) {
            return;
        }
        C785420UrU c785420UrU = new C785420UrU(c19egLIZ);
        boolean z = C0BVA.LIZ() >= 1;
        boolean z2 = C0BVA.LIZ() == 2;
        boolean z3 = C0BVA.LIZ() == 3;
        boolean z4 = C0BVA.LIZ() == 4;
        C739670Szt.LIZ = z;
        C739670Szt.LIZJ = z3;
        if (z2) {
            boolean zLIZJ = C785420UrU.LIZJ(c19egLIZ);
            C739670Szt.LIZIZ = zLIZJ;
            if (!zLIZJ) {
                C739670Szt.LIZ = false;
            }
        }
        if (z4) {
            boolean zLIZJ2 = C785420UrU.LIZJ(c19egLIZ);
            C739670Szt.LIZIZ = zLIZJ2;
            C739670Szt.LIZ = zLIZJ2;
            C739670Szt.LIZJ = C739670Szt.LIZIZ;
        }
        c785420UrU.LIZIZ(c19egLIZ);
        this.LL = c785420UrU;
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C785420UrU c785420UrU = this.LL;
        if (c785420UrU == null || !C739670Szt.LIZ) {
            return;
        }
        c785420UrU.LIZIZ.removeCallbacksAndMessages(null);
        c785420UrU.LIZ.clear();
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        C785420UrU c785420UrU = this.LL;
        if (c785420UrU != null && C739670Szt.LIZ && c785420UrU.LIZLLL) {
            ARunnableS112S0100000_12 aRunnableS112S0100000_12 = c785420UrU.LJIIJJI;
            if (aRunnableS112S0100000_12 != null) {
                c785420UrU.LIZIZ.removeCallbacks(aRunnableS112S0100000_12);
            }
            c785420UrU.LJIIJJI = null;
            c785420UrU.LIZJ = true;
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        C785420UrU c785420UrU = this.LL;
        if (c785420UrU != null) {
            c785420UrU.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.IContentSecurityAbility
    public final C785420UrU UL2() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.base.IContentSecurityAbility
    public final void dispatchTouchEvent(MotionEvent motionEvent) {
        if (C0BVA.LIZ() >= 1) {
            bo();
            C785420UrU c785420UrU = this.LL;
            if (c785420UrU != null) {
                c785420UrU.LIZ(motionEvent);
            }
        }
    }
}
