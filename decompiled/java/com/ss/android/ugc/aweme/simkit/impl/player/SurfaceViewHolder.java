package com.ss.android.ugc.aweme.simkit.impl.player;

import X.C0C83;
import X.C1473800oSI;
import X.C1474220oSy;
import X.C1474810oTv;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1473950oSX;
import X.InterfaceC1474000oSc;
import X.InterfaceC1483990oij;
import X.SurfaceHolderCallbackC1474210oSx;
import Y.ARunnableS56S0300000_23;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes24.dex */
public class SurfaceViewHolder implements InterfaceC1483990oij {
    public final C1474220oSy LL;
    public volatile Surface LLILLJJLI;
    public InterfaceC1474000oSc LLILLL;
    public final WeakHashMap<InterfaceC1473950oSX, String> LLILZ = new WeakHashMap<>();
    public int LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;

    @Override // X.InterfaceC1483990oij
    public final void LJIILLIIL() {
    }

    @Override // X.InterfaceC1483990oij
    public final void LJIJ() {
    }

    @Override // X.InterfaceC1483990oij
    public final boolean LIZIZ() {
        return this.LLILLJJLI != null && this.LLILLJJLI.isValid();
    }

    @Override // X.InterfaceC1483990oij
    public final void release() {
        if (this.LLILLJJLI != null) {
            this.LLILLJJLI.release();
            this.LLILLJJLI = null;
        }
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SurfaceViewHolder@");
        sbLIZ.append(hashCode());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1483990oij
    public final boolean LJIILJJIL() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1483990oij
    public final Surface getSurface() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1483990oij
    public final View getView() {
        return this.LL;
    }

    public SurfaceViewHolder(C1474220oSy c1474220oSy) {
        this.LL = c1474220oSy;
        LJIIIIZZ(false);
        c1474220oSy.setRelatedSurfaceHolder(this);
        c1474220oSy.getHolder().addCallback(new SurfaceHolderCallbackC1474210oSx(this, c1474220oSy));
    }

    @Override // X.InterfaceC1483990oij
    public final void LJII(InterfaceC1474000oSc interfaceC1474000oSc) {
        this.LLILLL = interfaceC1474000oSc;
    }

    @Override // X.InterfaceC1483990oij
    public final void LJIIIIZZ(boolean z) {
        float f;
        int i;
        C1474220oSy c1474220oSy = this.LL;
        if (z) {
            f = 0.0f;
        } else {
            f = 5000;
        }
        C786410Ut5.Ic(c1474220oSy, f);
        C1474220oSy c1474220oSy2 = this.LL;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        C786410Ut5.LLIIII(c1474220oSy2, i);
        this.LLIZ = z;
    }

    @Override // X.InterfaceC1483990oij
    public final void LJIIJJI(InterfaceC1473950oSX interfaceC1473950oSX) {
        if (interfaceC1473950oSX != null) {
            this.LLILZ.put(interfaceC1473950oSX, "SurfaceViewHolder");
        }
    }

    @Override // X.InterfaceC1483990oij
    public final void LJIJJ(FrameLayout frameLayout) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        if (C1474810oTv.LJJZ()) {
            C0C83.INS.waitRunOnMain(new ARunnableS56S0300000_23(this, frameLayout, layoutParams, 23));
        } else {
            C1473800oSI.LIZ(this.LL);
            frameLayout.addView(this.LL, layoutParams);
        }
    }
}
