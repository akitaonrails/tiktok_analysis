package com.ss.android.ugc.aweme.tako.autoplay;

import X.C05YD;
import X.C1BNE;
import X.C2252321DDq;
import X.InterfaceC1783750wWD;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes28.dex */
public final class LifecycleEnableStatus implements InterfaceC1783750wWD {
    public final C2252321DDq LIZ;
    public final C2252321DDq LIZIZ;
    public LifecycleOwner LIZJ;
    public final LifecycleEnableStatus$observer$1 LIZLLL;

    public LifecycleEnableStatus() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(Boolean.TRUE);
        this.LIZ = c2252321DDqLIZ;
        this.LIZIZ = c2252321DDqLIZ;
        this.LIZLLL = new LifecycleEnableStatus$observer$1(this);
    }

    @Override // X.InterfaceC1783750wWD
    public final C05YD<Boolean> LIZ() {
        return this.LIZIZ;
    }
}
