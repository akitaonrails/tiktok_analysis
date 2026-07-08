package tikcast.api.anchor;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import tikcast.api.anchor.AdminOperationRecordListResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _AdminOperationRecordListResponse_Data_RoomRecord_ProtoDecoder implements C0IMD<AdminOperationRecordListResponse.Data.RoomRecord> {
    public static AdminOperationRecordListResponse.Data.RoomRecord LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AdminOperationRecordListResponse.Data.RoomRecord roomRecord = new AdminOperationRecordListResponse.Data.RoomRecord();
        roomRecord.records = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            roomRecord.startTime = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        roomRecord.records.add(_AdminOperationRecordItem_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    roomRecord.roomId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return roomRecord;
            }
        }
    }

    public static void LJ(AdminOperationRecordListResponse.Data.RoomRecord roomRecord) {
        List<AdminOperationRecordItem> list = roomRecord.records;
        if (list == null) {
            roomRecord.records = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (AdminOperationRecordItem adminOperationRecordItem : roomRecord.records) {
            if (adminOperationRecordItem != null) {
                AdminOperationRecordCommonInfo adminOperationRecordCommonInfo = adminOperationRecordItem.commonInfo;
                if (adminOperationRecordCommonInfo != null) {
                    User user = adminOperationRecordCommonInfo.operator;
                    if (user != null) {
                        _User_ProtoDecoder.LJ(user);
                    }
                    User user2 = adminOperationRecordCommonInfo.targetUser;
                    if (user2 != null) {
                        _User_ProtoDecoder.LJ(user2);
                    }
                }
                AdminOperationRecordKeywordsInfo adminOperationRecordKeywordsInfo = adminOperationRecordItem.keywordsInfo;
                if (adminOperationRecordKeywordsInfo != null && adminOperationRecordKeywordsInfo.keywords == null) {
                    adminOperationRecordKeywordsInfo.keywords = new ArrayList();
                }
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AdminOperationRecordListResponse.Data.RoomRecord roomRecord) {
        LJ(roomRecord);
    }

    @Override // X.C0IMD
    public final AdminOperationRecordListResponse.Data.RoomRecord LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AdminOperationRecordListResponse.Data.RoomRecord roomRecord, List list) {
    }
}
