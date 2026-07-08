package tikcast.api.anchor;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AdminOperationRecordItem_ProtoDecoder implements C0IMD<AdminOperationRecordItem> {
    public static AdminOperationRecordItem LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AdminOperationRecordItem adminOperationRecordItem = new AdminOperationRecordItem();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        adminOperationRecordItem.commonInfo = _AdminOperationRecordCommonInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        adminOperationRecordItem.commentSwitchInfo = _AdminOperationRecordCommentSwitchInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        adminOperationRecordItem.blockInfo = _AdminOperationRecordBlockInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        adminOperationRecordItem.muteInfo = _AdminOperationRecordMuteInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        adminOperationRecordItem.keywordsInfo = _AdminOperationRecordKeywordsInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        adminOperationRecordItem.pinCommentInfo = _AdminOperationRecordPinCommentInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return adminOperationRecordItem;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AdminOperationRecordItem adminOperationRecordItem) {
        AdminOperationRecordItem adminOperationRecordItem2 = adminOperationRecordItem;
        AdminOperationRecordCommonInfo adminOperationRecordCommonInfo = adminOperationRecordItem2.commonInfo;
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
        AdminOperationRecordKeywordsInfo adminOperationRecordKeywordsInfo = adminOperationRecordItem2.keywordsInfo;
        if (adminOperationRecordKeywordsInfo != null && adminOperationRecordKeywordsInfo.keywords == null) {
            adminOperationRecordKeywordsInfo.keywords = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final AdminOperationRecordItem LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AdminOperationRecordItem adminOperationRecordItem, List list) {
    }
}
