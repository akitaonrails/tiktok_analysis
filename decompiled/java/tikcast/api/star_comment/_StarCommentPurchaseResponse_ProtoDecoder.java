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
import webcast.data.RechargeCustomError;
import webcast.data._RechargeCustomError_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _StarCommentPurchaseResponse_ProtoDecoder implements C0IMD<StarCommentPurchaseResponse> {
    @Override // X.C0IMD
    public final void LIZ(StarCommentPurchaseResponse starCommentPurchaseResponse) {
        RechargeCustomError rechargeCustomError;
        UserGrade userGrade;
        StarCommentPurchaseResponse starCommentPurchaseResponse2 = starCommentPurchaseResponse;
        StarCommentPurchaseResponse.Data data = starCommentPurchaseResponse2.data;
        if (data != null) {
            StarCommentQueue starCommentQueue = data.queue;
            if (starCommentQueue != null) {
                _StarCommentQueue_ProtoDecoder.LJ(starCommentQueue);
            }
            PayGradeInfo payGradeInfo = data.payGradeInfo;
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
        StarCommentPurchaseResponse.Extra extra = starCommentPurchaseResponse2.extra;
        if (extra != null && (rechargeCustomError = extra.customError) != null) {
            _RechargeCustomError_ProtoDecoder.LJ(rechargeCustomError);
        }
    }

    @Override // X.C0IMD
    public final StarCommentPurchaseResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        StarCommentPurchaseResponse starCommentPurchaseResponse = new StarCommentPurchaseResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        starCommentPurchaseResponse.extra = _StarCommentPurchaseResponse_Extra_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    starCommentPurchaseResponse.data = _StarCommentPurchaseResponse_Data_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return starCommentPurchaseResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, StarCommentPurchaseResponse starCommentPurchaseResponse, List list) {
    }
}
