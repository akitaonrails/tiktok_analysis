package webcast.data.cohost_biz;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import tikcast.linkmic.common._CohostStreamConfig_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _BizPermitJoinGroupParams_ProtoDecoder implements C0IMD<BizPermitJoinGroupParams> {
    public static BizPermitJoinGroupParams LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BizPermitJoinGroupParams bizPermitJoinGroupParams = new BizPermitJoinGroupParams();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    bizPermitJoinGroupParams.matchedPreferenceTag = c1516680pZS.LJIIJ();
                                }
                            } else {
                                bizPermitJoinGroupParams.streamConfig = _CohostStreamConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            bizPermitJoinGroupParams.algoRequestId = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        bizPermitJoinGroupParams.sourceType = c1516680pZS.LJIIJ();
                    }
                } else {
                    bizPermitJoinGroupParams.replyStatus = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bizPermitJoinGroupParams;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BizPermitJoinGroupParams bizPermitJoinGroupParams) {
    }

    @Override // X.C0IMD
    public final BizPermitJoinGroupParams LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BizPermitJoinGroupParams bizPermitJoinGroupParams, List list) {
    }
}
