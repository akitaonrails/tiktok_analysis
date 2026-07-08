package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FlareBoostedUsers_ProtoDecoder implements C0IMD<FlareBoostedUsers> {
    public static FlareBoostedUsers LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FlareBoostedUsers flareBoostedUsers = new FlareBoostedUsers();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        flareBoostedUsers.endTime = c1516680pZS.LJIIJJI();
                    }
                } else {
                    flareBoostedUsers.cnt = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return flareBoostedUsers;
            }
        }
    }

    @Override // X.C0IMD
    public final FlareBoostedUsers LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(FlareBoostedUsers flareBoostedUsers) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FlareBoostedUsers flareBoostedUsers, List list) {
    }
}
