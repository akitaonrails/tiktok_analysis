package tikcast.linkmic.common;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class _SocialGameUserSpotExtra_ProtoDecoder implements C0IMD<SocialGameUserSpotExtra> {
    public static SocialGameUserSpotExtra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SocialGameUserSpotExtra socialGameUserSpotExtra = new SocialGameUserSpotExtra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            socialGameUserSpotExtra.isMainContent = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        socialGameUserSpotExtra.isEnlarged = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    socialGameUserSpotExtra.gameJustDanceUserStatus = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return socialGameUserSpotExtra;
            }
        }
    }

    @Override // X.C0IMD
    public final SocialGameUserSpotExtra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(SocialGameUserSpotExtra socialGameUserSpotExtra) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SocialGameUserSpotExtra socialGameUserSpotExtra, List list) {
    }
}
