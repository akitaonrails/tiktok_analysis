package com.bytedance.android.livesdk.model.message.linkcore;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkLayerListUser_ProtoDecoder implements C0IMD<LinkLayerListUser> {
    public static LinkLayerListUser LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkLayerListUser linkLayerListUser = new LinkLayerListUser();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        linkLayerListUser.linkUser = _Player_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        linkLayerListUser.linkMicId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        linkLayerListUser.positionData = _MicPositionData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        linkLayerListUser.linkedTimeNano = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        linkLayerListUser.appVersion = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        linkLayerListUser.userType = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        linkLayerListUser.linkerSessionId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkLayerListUser;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LinkLayerListUser linkLayerListUser) {
    }

    @Override // X.C0IMD
    public final LinkLayerListUser LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkLayerListUser linkLayerListUser, List list) {
    }
}
