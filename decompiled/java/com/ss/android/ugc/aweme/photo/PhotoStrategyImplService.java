package com.ss.android.ugc.aweme.photo;

import X.C01GW;
import X.C1494850p0F;
import X.C2191081Ap8;
import X.C2191131ApD;
import X.C2191151ApF;
import X.C2191501Apo;
import X.C23250099c;
import X.C452501pT;
import X.InterfaceC497601wk;
import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes35.dex */
public final class PhotoStrategyImplService implements PhotoStrategyService {
    public volatile boolean LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C2191151ApF(this));

    @Override // com.ss.android.ugc.aweme.photo.PhotoStrategyService
    public final void LIZLLL(Uri uri, long j, boolean z, C1494850p0F c1494850p0F) {
        try {
            this.LIZIZ.getValue();
            if (!this.LIZ) {
                return;
            }
            C2191501Apo.LIZ.getClass();
            if (C2191131ApD.LIZ().enable && uri != null && c1494850p0F != null && uri.getHost() != null && j != 0) {
                C23250099c.LIZLLL((InterfaceC497601wk) C2191501Apo.LIZJ.getValue(), null, null, new C2191081Ap8(uri, j, z, c1494850p0F, null), 3);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
