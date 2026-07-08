package tikcast.api.star_comment;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import tikcast.api.star_comment.StarCommentPurchaseResponse;
import webcast.data.RechargeCustomError;
import webcast.data._RechargeCustomError_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _StarCommentPurchaseResponse_Extra_ProtoDecoder implements C0IMD<StarCommentPurchaseResponse.Extra> {
    public static StarCommentPurchaseResponse.Extra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        StarCommentPurchaseResponse.Extra extra = new StarCommentPurchaseResponse.Extra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    extra.customError = _RechargeCustomError_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return extra;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(StarCommentPurchaseResponse.Extra extra) {
        RechargeCustomError rechargeCustomError = extra.customError;
        if (rechargeCustomError != null) {
            _RechargeCustomError_ProtoDecoder.LJ(rechargeCustomError);
        }
    }

    @Override // X.C0IMD
    public final StarCommentPurchaseResponse.Extra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, StarCommentPurchaseResponse.Extra extra, List list) {
    }
}
