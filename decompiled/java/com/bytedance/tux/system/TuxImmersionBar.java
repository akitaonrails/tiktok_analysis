package com.bytedance.tux.system;

import X.C1308910kAL;
import X.C1766560w4U;
import X.C19EG;
import X.C21504419Du;
import X.EnumC21504619Dw;
import android.content.Context;
import android.view.Window;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.immersionbar.ImmersionBar;

/* JADX INFO: loaded from: classes33.dex */
public final class TuxImmersionBar {
    public static final /* synthetic */ int LIZJ = 0;
    public final Context LIZ;
    public final ImmersionBar LIZIZ;

    public final void LIZLLL() {
        this.LIZIZ.LJ();
    }

    public final void LJII() {
        ImmersionBar immersionBar = this.LIZIZ;
        immersionBar.getClass();
        immersionBar.LJFF = new C21504419Du();
    }

    public final void LJIIJJI() {
        C21504419Du c21504419Du = this.LIZIZ.LJFF;
        c21504419Du.LL = 0;
        c21504419Du.LLILLJJLI = 0;
        c21504419Du.LLILZIL = true;
    }

    public final void LJIIL() {
        this.LIZIZ.LJIIL();
    }

    public final void LIZ(boolean z) {
        C21504419Du c21504419Du = this.LIZIZ.LJFF;
        c21504419Du.LLJ = z;
        c21504419Du.LLJIJIL = 0.2f;
        c21504419Du.LLJI = z;
        c21504419Du.LLJILJIL = 0.2f;
    }

    public final void LJ(int i) {
        Integer numLIZJ;
        Context context = this.LIZ;
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(i, context)) != null) {
            this.LIZIZ.LJFF.LLILLJJLI = numLIZJ.intValue();
        }
    }

    public final void LJFF(int i) {
        this.LIZIZ.LJFF.LLILLJJLI = i;
    }

    public final void LJI(boolean z) {
        this.LIZIZ.LJII(z);
    }

    public final void LJIIIIZZ(int i) {
        Integer numLIZJ;
        Context context = this.LIZ;
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(i, context)) != null) {
            this.LIZIZ.LJFF.LL = numLIZJ.intValue();
        }
    }

    public final void LJIIIZ(int i) {
        this.LIZIZ.LJFF.LL = i;
    }

    public final void LJIIJ(boolean z) {
        this.LIZIZ.LJIIJ(z);
    }

    public TuxImmersionBar(Context context, ImmersionBar immersionBar) {
        this.LIZ = context;
        this.LIZIZ = immersionBar;
    }

    public final void LIZJ(boolean z, boolean z2) {
        EnumC21504619Dw enumC21504619Dw;
        if (z) {
            if (z2) {
                enumC21504619Dw = EnumC21504619Dw.FLAG_HIDE_BAR;
            } else {
                enumC21504619Dw = EnumC21504619Dw.FLAG_HIDE_NAVIGATION_BAR;
            }
        } else if (z2) {
            enumC21504619Dw = EnumC21504619Dw.FLAG_HIDE_STATUS_BAR;
        } else {
            enumC21504619Dw = EnumC21504619Dw.FLAG_SHOW_BAR;
        }
        this.LIZIZ.LIZLLL(enumC21504619Dw);
    }

    public static void LIZIZ(LifecycleOwner lifecycleOwner, final C19EG c19eg, final Window window) {
        lifecycleOwner.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.tux.system.TuxImmersionBar$autoRelease$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    handleDestroy();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public final void handleDestroy() {
                C1766560w4U.LIZIZ(c19eg, window);
            }
        });
    }
}
