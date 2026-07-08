package webcast.data.cohost_biz;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import tikcast.linkmic.common._CohostStreamConfig_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _BizJoinGroupParams_ProtoDecoder implements C0IMD<BizJoinGroupParams> {
    public static BizJoinGroupParams LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BizJoinGroupParams bizJoinGroupParams = new BizJoinGroupParams();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        bizJoinGroupParams.sourceType = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        bizJoinGroupParams.checkPerceptionCenter = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 3:
                        bizJoinGroupParams.tagType = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        bizJoinGroupParams.tagValue = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        bizJoinGroupParams.needWithdraw = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 6:
                        bizJoinGroupParams.algoRequestId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        bizJoinGroupParams.streamConfig = _CohostStreamConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bizJoinGroupParams;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BizJoinGroupParams bizJoinGroupParams) {
    }

    @Override // X.C0IMD
    public final BizJoinGroupParams LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BizJoinGroupParams bizJoinGroupParams, List list) {
    }
}
