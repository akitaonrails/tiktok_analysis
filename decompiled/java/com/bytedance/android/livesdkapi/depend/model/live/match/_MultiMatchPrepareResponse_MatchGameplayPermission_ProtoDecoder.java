package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MultiMatchPrepareResponse_MatchGameplayPermission_ProtoDecoder implements C0IMD<MultiMatchPrepareResponse.MatchGameplayPermission> {
    public static MultiMatchPrepareResponse.MatchGameplayPermission LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MultiMatchPrepareResponse.MatchGameplayPermission matchGameplayPermission = new MultiMatchPrepareResponse.MatchGameplayPermission();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        matchGameplayPermission.blockMessage = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    matchGameplayPermission.blockReason = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return matchGameplayPermission;
            }
        }
    }

    @Override // X.C0IMD
    public final MultiMatchPrepareResponse.MatchGameplayPermission LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(MultiMatchPrepareResponse.MatchGameplayPermission matchGameplayPermission) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MultiMatchPrepareResponse.MatchGameplayPermission matchGameplayPermission, List list) {
    }
}
