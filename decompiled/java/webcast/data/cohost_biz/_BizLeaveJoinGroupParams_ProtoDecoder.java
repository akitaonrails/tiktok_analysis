package webcast.data.cohost_biz;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BizLeaveJoinGroupParams_ProtoDecoder implements C0IMD<BizLeaveJoinGroupParams> {
    public static BizLeaveJoinGroupParams LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BizLeaveJoinGroupParams bizLeaveJoinGroupParams = new BizLeaveJoinGroupParams();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    bizLeaveJoinGroupParams.notSuggestToUid = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bizLeaveJoinGroupParams;
            }
        }
    }

    @Override // X.C0IMD
    public final BizLeaveJoinGroupParams LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BizLeaveJoinGroupParams bizLeaveJoinGroupParams) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BizLeaveJoinGroupParams bizLeaveJoinGroupParams, List list) {
    }
}
