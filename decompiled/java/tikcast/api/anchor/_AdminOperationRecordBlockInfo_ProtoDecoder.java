package tikcast.api.anchor;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AdminOperationRecordBlockInfo_ProtoDecoder implements C0IMD<AdminOperationRecordBlockInfo> {
    public static AdminOperationRecordBlockInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AdminOperationRecordBlockInfo adminOperationRecordBlockInfo = new AdminOperationRecordBlockInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        adminOperationRecordBlockInfo.isCancel = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    adminOperationRecordBlockInfo.duration = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return adminOperationRecordBlockInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final AdminOperationRecordBlockInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(AdminOperationRecordBlockInfo adminOperationRecordBlockInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AdminOperationRecordBlockInfo adminOperationRecordBlockInfo, List list) {
    }
}
