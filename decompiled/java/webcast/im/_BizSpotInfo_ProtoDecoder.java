package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import tikcast.linkmic.common._PosIdentity_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _BizSpotInfo_ProtoDecoder implements C0IMD<BizSpotInfo> {
    public static BizSpotInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BizSpotInfo bizSpotInfo = new BizSpotInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            bizSpotInfo.bizSpotExtra = _BizSpotExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        bizSpotInfo.posIdentity = _PosIdentity_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    bizSpotInfo.spotId = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bizSpotInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BizSpotInfo bizSpotInfo) {
    }

    @Override // X.C0IMD
    public final BizSpotInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BizSpotInfo bizSpotInfo, List list) {
    }
}
