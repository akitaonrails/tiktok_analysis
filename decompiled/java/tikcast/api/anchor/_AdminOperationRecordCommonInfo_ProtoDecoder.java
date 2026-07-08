package tikcast.api.anchor;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AdminOperationRecordCommonInfo_ProtoDecoder implements C0IMD<AdminOperationRecordCommonInfo> {
    public static AdminOperationRecordCommonInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AdminOperationRecordCommonInfo adminOperationRecordCommonInfo = new AdminOperationRecordCommonInfo();
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
                                    adminOperationRecordCommonInfo.targetUser = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                adminOperationRecordCommonInfo.operationTime = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            adminOperationRecordCommonInfo.operationType = c1516680pZS.LJIIJ();
                        }
                    } else {
                        adminOperationRecordCommonInfo.operator = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    adminOperationRecordCommonInfo.id = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return adminOperationRecordCommonInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AdminOperationRecordCommonInfo adminOperationRecordCommonInfo) {
        AdminOperationRecordCommonInfo adminOperationRecordCommonInfo2 = adminOperationRecordCommonInfo;
        User user = adminOperationRecordCommonInfo2.operator;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        User user2 = adminOperationRecordCommonInfo2.targetUser;
        if (user2 != null) {
            _User_ProtoDecoder.LJ(user2);
        }
    }

    @Override // X.C0IMD
    public final AdminOperationRecordCommonInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AdminOperationRecordCommonInfo adminOperationRecordCommonInfo, List list) {
    }
}
