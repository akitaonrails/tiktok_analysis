package tikcast.api.star_comment;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import tikcast.api.star_comment.StarCommentDeleteResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _StarCommentDeleteResponse_ProtoDecoder implements C0IMD<StarCommentDeleteResponse> {
    @Override // X.C0IMD
    public final void LIZ(StarCommentDeleteResponse starCommentDeleteResponse) {
        StarCommentQueue starCommentQueue;
        StarCommentDeleteResponse.Data data = starCommentDeleteResponse.data;
        if (data != null && (starCommentQueue = data.queue) != null) {
            _StarCommentQueue_ProtoDecoder.LJ(starCommentQueue);
        }
    }

    @Override // X.C0IMD
    public final StarCommentDeleteResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        StarCommentDeleteResponse starCommentDeleteResponse = new StarCommentDeleteResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    starCommentDeleteResponse.data = _StarCommentDeleteResponse_Data_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return starCommentDeleteResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, StarCommentDeleteResponse starCommentDeleteResponse, List list) {
    }
}
