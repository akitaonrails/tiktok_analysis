package tikcast.api.anchor;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AdminOperationRecordMuteInfo_ProtoDecoder implements C0IMD<AdminOperationRecordMuteInfo> {
    public static AdminOperationRecordMuteInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AdminOperationRecordMuteInfo adminOperationRecordMuteInfo = new AdminOperationRecordMuteInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        adminOperationRecordMuteInfo.isCancel = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    adminOperationRecordMuteInfo.duration = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return adminOperationRecordMuteInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final AdminOperationRecordMuteInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(AdminOperationRecordMuteInfo adminOperationRecordMuteInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AdminOperationRecordMuteInfo adminOperationRecordMuteInfo, List list) {
    }
}
