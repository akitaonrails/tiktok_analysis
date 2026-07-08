package com.ss.android.ugc.aweme.player.sdk.util;

import X.InterfaceC1471580oOi;
import X.InterfaceC1473850oSN;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes24.dex */
public final class SurfaceWrapper extends Surface implements InterfaceC1471580oOi {
    public WeakReference<InterfaceC1473850oSN> mListener;
    public WeakReference<InterfaceC1471580oOi> surfaceListenerRef;

    @Override // X.InterfaceC1471580oOi
    public final void LJIJJLI(String str) {
    }

    @Override // X.InterfaceC1471580oOi
    public final void LJIIZILJ() {
        InterfaceC1471580oOi interfaceC1471580oOi;
        WeakReference<InterfaceC1471580oOi> weakReference = this.surfaceListenerRef;
        if (weakReference == null || (interfaceC1471580oOi = weakReference.get()) == null) {
            return;
        }
        interfaceC1471580oOi.LJIIZILJ();
    }

    @Override // X.InterfaceC1471580oOi
    public final void LJI(String str) {
        InterfaceC1471580oOi interfaceC1471580oOi;
        WeakReference<InterfaceC1471580oOi> weakReference = this.surfaceListenerRef;
        if (weakReference != null && (interfaceC1471580oOi = weakReference.get()) != null) {
            interfaceC1471580oOi.LJI(str);
        }
    }

    public SurfaceWrapper(SurfaceTexture surfaceTexture, InterfaceC1471580oOi interfaceC1471580oOi) {
        super(surfaceTexture);
        if (interfaceC1471580oOi == null) {
            this.surfaceListenerRef = null;
        } else {
            this.surfaceListenerRef = new WeakReference<>(interfaceC1471580oOi);
        }
    }

    @Override // X.InterfaceC1471580oOi
    public final void LJIILIIL(String str, boolean z) {
        InterfaceC1471580oOi interfaceC1471580oOi;
        WeakReference<InterfaceC1471580oOi> weakReference = this.surfaceListenerRef;
        if (weakReference != null && (interfaceC1471580oOi = weakReference.get()) != null) {
            interfaceC1471580oOi.LJIILIIL(str, z);
        }
    }
}
