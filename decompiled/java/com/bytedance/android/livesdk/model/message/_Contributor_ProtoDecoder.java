package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _Contributor_ProtoDecoder implements C0IMD<Contributor> {
    public static Contributor LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Contributor contributor = new Contributor();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                contributor.mDelta = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            contributor.mRank = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        contributor.mUser = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    contributor.mScore = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return contributor;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(Contributor contributor) {
        User user = contributor.mUser;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final Contributor LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, Contributor contributor, List list) {
    }
}
