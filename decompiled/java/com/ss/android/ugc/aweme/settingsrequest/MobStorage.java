package com.ss.android.ugc.aweme.settingsrequest;

import X.C08O2;
import X.C13BV;
import X.C13VI;
import X.C2454209jY;
import X.EnumC1335420kr6;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class MobStorage extends C13VI {
    @Override // X.C13VI, X.InterfaceC345370DgN
    public final File LJIIIIZZ() {
        return C08O2.LIZIZ();
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.CACHE;
    }

    @Override // X.C13VI
    public final long LJIIIZ(boolean z) {
        return LJIIJ(z);
    }

    @Override // X.C13VI
    public final long LJIIJ(boolean z) {
        return C2454209jY.LIZIZ(LJIIIIZZ(), C13BV.INSTANCE, z);
    }
}
