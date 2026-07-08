package com.ss.android.ugc.aweme.pipo.stellar;

import X.C04TD;
import X.C0TSY;
import X.C1543490qGh;
import X.C19EG;
import X.C759450Tqh;

/* JADX INFO: loaded from: classes3.dex */
public final class PipoStellarService implements IPipoStellarService {
    public static boolean LIZ;

    public static IPipoStellarService LIZIZ() {
        Object objLIZ = C04TD.LIZ(IPipoStellarService.class, false);
        if (objLIZ != null) {
            return (IPipoStellarService) objLIZ;
        }
        if (C04TD.d3 == null) {
            synchronized (IPipoStellarService.class) {
                if (C04TD.d3 == null) {
                    C04TD.d3 = new PipoStellarService();
                }
            }
        }
        return C04TD.d3;
    }

    @Override // com.ss.android.ugc.aweme.pipo.stellar.IPipoStellarService
    public final C759450Tqh LIZ(C19EG c19eg) {
        if (!LIZ) {
            C1543490qGh.LIZIZ(C0TSY.class, null, 6);
            LIZ = true;
        }
        return new C759450Tqh(c19eg);
    }
}
