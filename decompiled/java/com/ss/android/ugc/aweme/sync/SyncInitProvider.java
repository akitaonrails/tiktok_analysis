package com.ss.android.ugc.aweme.sync;

import X.C1519750peP;
import X.C1545390qJl;
import X.C2188811AlT;
import X.C2213981Bky;
import X.InterfaceC1526670ppZ;
import android.content.Context;
import kotlin.jvm.internal.AwS567S0100000_23;

/* JADX INFO: loaded from: classes24.dex */
public final class SyncInitProvider implements ISyncInitProvider {
    @Override // com.ss.android.ugc.aweme.sync.ISyncInitProvider
    public final boolean LIZJ() {
        return C1545390qJl.LIZIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.sync.ISyncInitProvider
    public final C1519750peP LIZLLL() {
        int appId = C2213981Bky.LIZIZ.getAppId();
        C1545390qJl c1545390qJl = C1545390qJl.LIZIZ;
        String strLIZLLL = c1545390qJl.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("wss://");
        sbLIZ.append(c1545390qJl.LJ());
        sbLIZ.append("/ws/v2");
        return new C1519750peP(appId, strLIZLLL, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.sync.ISyncInitProvider
    public final Context getAppContext() {
        return C2213981Bky.LIZIZ.getApplicationContext();
    }

    @Override // com.ss.android.ugc.aweme.sync.ISyncInitProvider
    public final int getVersionCode() {
        return (int) C2213981Bky.LIZIZ.getVersionCode();
    }

    @Override // com.ss.android.ugc.aweme.sync.ISyncInitProvider
    public final InterfaceC1526670ppZ LIZ(C1519750peP c1519750peP) {
        return C1545390qJl.LIZIZ.LIZ(c1519750peP);
    }

    @Override // com.ss.android.ugc.aweme.sync.ISyncInitProvider
    public final void LIZIZ(AwS567S0100000_23 awS567S0100000_23) {
        C1545390qJl.LIZIZ.LIZIZ(awS567S0100000_23);
    }
}
