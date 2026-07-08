package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ExcellentHighLightUser_ProtoDecoder implements C0IMD<ExcellentHighLightUser> {
    public static ExcellentHighLightUser LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ExcellentHighLightUser excellentHighLightUser = new ExcellentHighLightUser();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            excellentHighLightUser.vvCount = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        excellentHighLightUser.nickName = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    excellentHighLightUser.exist = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return excellentHighLightUser;
            }
        }
    }

    @Override // X.C0IMD
    public final ExcellentHighLightUser LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(ExcellentHighLightUser excellentHighLightUser) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ExcellentHighLightUser excellentHighLightUser, List list) {
    }
}
