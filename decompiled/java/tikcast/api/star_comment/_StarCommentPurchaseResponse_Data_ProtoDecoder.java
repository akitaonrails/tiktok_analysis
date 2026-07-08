package tikcast.api.star_comment;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user._BadgeStruct_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import tikcast.api.star_comment.StarCommentPurchaseResponse;
import tikcast.api.user_level.PayGradeInfo;
import tikcast.api.user_level.UserGrade;
import tikcast.api.user_level._PayGradeInfo_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _StarCommentPurchaseResponse_Data_ProtoDecoder implements C0IMD<StarCommentPurchaseResponse.Data> {
    public static StarCommentPurchaseResponse.Data LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        StarCommentPurchaseResponse.Data data = new StarCommentPurchaseResponse.Data();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        data.purchaseResult = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        data.queue = _StarCommentQueue_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        data.serverCurMsgStartTimeMs = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        data.payGradeInfo = _PayGradeInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        data.roomUserCount = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        data.coins = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        data.msgId = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return data;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(StarCommentPurchaseResponse.Data data) {
        UserGrade userGrade;
        StarCommentPurchaseResponse.Data data2 = data;
        StarCommentQueue starCommentQueue = data2.queue;
        if (starCommentQueue != null) {
            _StarCommentQueue_ProtoDecoder.LJ(starCommentQueue);
        }
        PayGradeInfo payGradeInfo = data2.payGradeInfo;
        if (payGradeInfo != null && (userGrade = payGradeInfo.userGrade) != null) {
            BadgeStruct badgeStruct = userGrade.defaultGradeBadge;
            if (badgeStruct != null) {
                _BadgeStruct_ProtoDecoder.LJ(badgeStruct);
            }
            BadgeStruct badgeStruct2 = userGrade.opacityBadge;
            if (badgeStruct2 != null) {
                _BadgeStruct_ProtoDecoder.LJ(badgeStruct2);
            }
        }
    }

    @Override // X.C0IMD
    public final StarCommentPurchaseResponse.Data LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, StarCommentPurchaseResponse.Data data, List list) {
    }
}
