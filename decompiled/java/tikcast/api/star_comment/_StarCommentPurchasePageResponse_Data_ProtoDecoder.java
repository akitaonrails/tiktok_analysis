package tikcast.api.star_comment;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import tikcast.api.privilege.PrivilegePrompt;
import tikcast.api.privilege._PrivilegePrompt_ProtoDecoder;
import tikcast.api.star_comment.StarCommentPurchasePageResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _StarCommentPurchasePageResponse_Data_ProtoDecoder implements C0IMD<StarCommentPurchasePageResponse.Data> {
    public static StarCommentPurchasePageResponse.Data LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        StarCommentPurchasePageResponse.Data data = new StarCommentPurchasePageResponse.Data();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        data.purchasePageStatus = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        data.notAllowReason = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        data.queue = _StarCommentQueue_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        data.wordLimit = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        data.errorCode = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        data.originalQueue = _StarCommentQueue_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        data.baselinePrice = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        data.descInfo = _PrivilegePrompt_ProtoDecoder.LIZLLL(c1516680pZS);
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
    public final void LIZ(StarCommentPurchasePageResponse.Data data) {
        StarCommentPurchasePageResponse.Data data2 = data;
        StarCommentQueue starCommentQueue = data2.queue;
        if (starCommentQueue != null) {
            _StarCommentQueue_ProtoDecoder.LJ(starCommentQueue);
        }
        StarCommentQueue starCommentQueue2 = data2.originalQueue;
        if (starCommentQueue2 != null) {
            _StarCommentQueue_ProtoDecoder.LJ(starCommentQueue2);
        }
        PrivilegePrompt privilegePrompt = data2.descInfo;
        if (privilegePrompt != null) {
            _PrivilegePrompt_ProtoDecoder.LJ(privilegePrompt);
        }
    }

    @Override // X.C0IMD
    public final StarCommentPurchasePageResponse.Data LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, StarCommentPurchasePageResponse.Data data, List list) {
    }
}
