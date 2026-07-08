package com.ss.android.ugc.aweme.shortvideo.aigc;

import X.C04TD;
import X.C0TBE;
import X.C560530Lyd;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class AigcStateHolder implements IAigcStateHolder {
    public final C560530Lyd<C0TBE> LIZ = new C560530Lyd<>();

    public static IAigcStateHolder LIZLLL() {
        Object objLIZ = C04TD.LIZ(IAigcStateHolder.class, false);
        if (objLIZ != null) {
            return (IAigcStateHolder) objLIZ;
        }
        if (C04TD.g5 == null) {
            synchronized (IAigcStateHolder.class) {
                if (C04TD.g5 == null) {
                    C04TD.g5 = new AigcStateHolder();
                }
            }
        }
        return C04TD.g5;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.aigc.IAigcStateHolder
    public final void LIZ() {
        this.LIZ.LJIIJ(null);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.aigc.IAigcStateHolder
    public final C560530Lyd LIZIZ() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.aigc.IAigcStateHolder
    public final void LIZJ(C0TBE c0tbe) {
        if (!Intrinsics.LJFF(this.LIZ.LJI(), c0tbe)) {
            this.LIZ.LJIIJ(c0tbe);
        }
    }
}
