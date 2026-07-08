package com.bytedance.pia.core.plugins;

import X.C1BO6;
import X.C1BOX;
import X.C1BP4;
import X.C2204041BNy;
import com.bytedance.pia.core.PiaManifest;

/* JADX INFO: loaded from: classes35.dex */
public final class PrefetchPlugin extends C1BO6 {
    public final PiaManifest LIZJ;
    public C1BOX LIZLLL;

    @Override // X.C1BO6
    public final String LIZ() {
        return "prefetch";
    }

    @Override // X.C1BO6
    public final void LIZIZ() {
        this.LIZLLL = new C1BOX(this.LIZIZ, this.LIZJ);
    }

    @Override // X.C1BO6, X.InterfaceC1542530qF9
    public final void release() {
        C1BP4 c1bp4;
        C1BOX c1box = this.LIZLLL;
        if (c1box == null || (c1bp4 = c1box.LIZIZ) == null) {
            return;
        }
        c1bp4.LJFF(null);
    }

    public PrefetchPlugin(C2204041BNy c2204041BNy, PiaManifest piaManifest) {
        super(c2204041BNy);
        this.LIZJ = piaManifest;
    }
}
