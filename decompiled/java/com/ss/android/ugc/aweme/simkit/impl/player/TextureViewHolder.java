package com.ss.android.ugc.aweme.simkit.impl.player;

import X.C0C83;
import X.C1473800oSI;
import X.C1474810oTv;
import X.C1482600ogU;
import X.C2188811AlT;
import X.InterfaceC1473950oSX;
import X.InterfaceC1474000oSc;
import X.InterfaceC1483990oij;
import X.TextureViewSurfaceTextureListenerC1482630ogX;
import Y.ARunnableS56S0300000_23;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes24.dex */
public class TextureViewHolder implements InterfaceC1483990oij {
    public final C1482600ogU LL;
    public final boolean LLILLJJLI;
    public volatile SurfaceTexture LLILLL;
    public volatile boolean LLILZ;
    public volatile Surface LLILZLL;
    public InterfaceC1474000oSc LLIZ;
    public final WeakHashMap<InterfaceC1473950oSX, String> LLIZLLLIL = new WeakHashMap<>();
    public boolean LLILZIL = false;

    @Override // X.InterfaceC1483990oij
    public final void LJIJ() {
        this.LLILZ = true;
    }

    public final void LIZ() {
        if (!this.LLILLJJLI || this.LLILLL == null || this.LL.getSurfaceTexture() == this.LLILLL) {
            return;
        }
        this.LL.setSurfaceTexture(this.LLILLL);
    }

    @Override // X.InterfaceC1483990oij
    public final boolean LIZIZ() {
        return this.LLILZLL != null && this.LLILZLL.isValid();
    }

    @Override // X.InterfaceC1483990oij
    public final void release() {
        if (this.LLILLL != null) {
            this.LLILLL.release();
            this.LLILLL = null;
        }
        if (this.LLILZLL != null) {
            this.LLILZLL.release();
            this.LLILZLL = null;
        }
        this.LL.setSurfaceTextureListener(null);
    }

    @Override // X.InterfaceC1483990oij
    public final void LJIILLIIL() {
        if (LIZIZ() && this.LLILZ) {
            this.LLILZLL.release();
            this.LLILZLL = new Surface(this.LLILLL);
            this.LLILZ = false;
        }
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextureViewHolder@");
        sbLIZ.append(hashCode());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1483990oij
    public final boolean LJIILJJIL() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1483990oij
    public final Surface getSurface() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1483990oij
    public final View getView() {
        return this.LL;
    }

    @Override // X.InterfaceC1483990oij
    public final void LJII(InterfaceC1474000oSc interfaceC1474000oSc) {
        this.LLIZ = interfaceC1474000oSc;
    }

    @Override // X.InterfaceC1483990oij
    public final void LJIIIIZZ(boolean z) {
        this.LLILZIL = z;
    }

    @Override // X.InterfaceC1483990oij
    public final void LJIIJJI(InterfaceC1473950oSX interfaceC1473950oSX) {
        if (interfaceC1473950oSX != null) {
            this.LLIZLLLIL.put(interfaceC1473950oSX, "TextureViewHolder");
        }
    }

    @Override // X.InterfaceC1483990oij
    public final void LJIJJ(FrameLayout frameLayout) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        if (C1474810oTv.LJJZ()) {
            C0C83.INS.waitRunOnMain(new ARunnableS56S0300000_23(this, frameLayout, layoutParams, 24));
            return;
        }
        C1473800oSI.LIZ(this.LL);
        frameLayout.addView(this.LL, layoutParams);
        LIZ();
    }

    public TextureViewHolder(C1482600ogU c1482600ogU, boolean z) {
        this.LL = c1482600ogU;
        this.LLILLJJLI = z;
        c1482600ogU.setRelatedSurfaceHolder(this);
        c1482600ogU.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.0ogW
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onViewAttachedToWindow:");
                sbLIZ.append(view);
                C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onViewDetachedFromWindow:");
                sbLIZ.append(view);
                C2188811AlT.LIZIZ(sbLIZ);
                this.LL.LIZ();
            }
        });
        c1482600ogU.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC1482630ogX(this, z, c1482600ogU));
    }
}
