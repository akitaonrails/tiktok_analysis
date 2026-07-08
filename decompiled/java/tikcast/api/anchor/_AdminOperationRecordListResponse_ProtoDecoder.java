package tikcast.api.anchor;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import tikcast.api.anchor.AdminOperationRecordListResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _AdminOperationRecordListResponse_ProtoDecoder implements C0IMD<AdminOperationRecordListResponse> {
    @Override // X.C0IMD
    public final void LIZ(AdminOperationRecordListResponse adminOperationRecordListResponse) {
        AdminOperationRecordListResponse.Data data = adminOperationRecordListResponse.data;
        if (data != null) {
            _AdminOperationRecordListResponse_Data_ProtoDecoder.LJ(data);
        }
    }

    @Override // X.C0IMD
    public final AdminOperationRecordListResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        AdminOperationRecordListResponse adminOperationRecordListResponse = new AdminOperationRecordListResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    adminOperationRecordListResponse.data = _AdminOperationRecordListResponse_Data_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return adminOperationRecordListResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AdminOperationRecordListResponse adminOperationRecordListResponse, List list) {
    }
}
