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
public final class _StarCommentPurchasePageResponse_ProtoDecoder implements C0IMD<StarCommentPurchasePageResponse> {
    @Override // X.C0IMD
    public final void LIZ(StarCommentPurchasePageResponse starCommentPurchasePageResponse) {
        StarCommentPurchasePageResponse.Data data = starCommentPurchasePageResponse.data;
        if (data != null) {
            StarCommentQueue starCommentQueue = data.queue;
            if (starCommentQueue != null) {
                _StarCommentQueue_ProtoDecoder.LJ(starCommentQueue);
            }
            StarCommentQueue starCommentQueue2 = data.originalQueue;
            if (starCommentQueue2 != null) {
                _StarCommentQueue_ProtoDecoder.LJ(starCommentQueue2);
            }
            PrivilegePrompt privilegePrompt = data.descInfo;
            if (privilegePrompt != null) {
                _PrivilegePrompt_ProtoDecoder.LJ(privilegePrompt);
            }
        }
    }

    @Override // X.C0IMD
    public final StarCommentPurchasePageResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        StarCommentPurchasePageResponse starCommentPurchasePageResponse = new StarCommentPurchasePageResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    starCommentPurchasePageResponse.data = _StarCommentPurchasePageResponse_Data_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return starCommentPurchasePageResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, StarCommentPurchasePageResponse starCommentPurchasePageResponse, List list) {
    }
}
