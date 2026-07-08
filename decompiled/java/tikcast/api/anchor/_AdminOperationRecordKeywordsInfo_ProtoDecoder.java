package tikcast.api.anchor;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AdminOperationRecordKeywordsInfo_ProtoDecoder implements C0IMD<AdminOperationRecordKeywordsInfo> {
    public static AdminOperationRecordKeywordsInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AdminOperationRecordKeywordsInfo adminOperationRecordKeywordsInfo = new AdminOperationRecordKeywordsInfo();
        adminOperationRecordKeywordsInfo.keywords = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        adminOperationRecordKeywordsInfo.isRemove = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    adminOperationRecordKeywordsInfo.keywords.add(C1516700pZU.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return adminOperationRecordKeywordsInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AdminOperationRecordKeywordsInfo adminOperationRecordKeywordsInfo) {
        AdminOperationRecordKeywordsInfo adminOperationRecordKeywordsInfo2 = adminOperationRecordKeywordsInfo;
        if (adminOperationRecordKeywordsInfo2.keywords == null) {
            adminOperationRecordKeywordsInfo2.keywords = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final AdminOperationRecordKeywordsInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AdminOperationRecordKeywordsInfo adminOperationRecordKeywordsInfo, List list) {
    }
}
