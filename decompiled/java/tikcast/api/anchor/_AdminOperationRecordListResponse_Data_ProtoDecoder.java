package tikcast.api.anchor;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import tikcast.api.anchor.AdminOperationRecordListResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _AdminOperationRecordListResponse_Data_ProtoDecoder implements C0IMD<AdminOperationRecordListResponse.Data> {
    public static AdminOperationRecordListResponse.Data LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AdminOperationRecordListResponse.Data data = new AdminOperationRecordListResponse.Data();
        data.roomRecords = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    data.roomRecords.add(_AdminOperationRecordListResponse_Data_RoomRecord_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return data;
            }
        }
    }

    public static void LJ(AdminOperationRecordListResponse.Data data) {
        List<AdminOperationRecordListResponse.Data.RoomRecord> list = data.roomRecords;
        if (list == null) {
            data.roomRecords = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (AdminOperationRecordListResponse.Data.RoomRecord roomRecord : data.roomRecords) {
            if (roomRecord != null) {
                _AdminOperationRecordListResponse_Data_RoomRecord_ProtoDecoder.LJ(roomRecord);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AdminOperationRecordListResponse.Data data) {
        LJ(data);
    }

    @Override // X.C0IMD
    public final AdminOperationRecordListResponse.Data LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AdminOperationRecordListResponse.Data data, List list) {
    }
}
