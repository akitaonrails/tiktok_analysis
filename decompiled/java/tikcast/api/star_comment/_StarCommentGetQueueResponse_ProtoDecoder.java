package tikcast.api.star_comment;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import tikcast.api.star_comment.StarCommentGetQueueResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _StarCommentGetQueueResponse_ProtoDecoder implements C0IMD<StarCommentGetQueueResponse> {
    @Override // X.C0IMD
    public final void LIZ(StarCommentGetQueueResponse starCommentGetQueueResponse) {
        StarCommentQueue starCommentQueue;
        StarCommentGetQueueResponse.Data data = starCommentGetQueueResponse.data;
        if (data != null && (starCommentQueue = data.queue) != null) {
            _StarCommentQueue_ProtoDecoder.LJ(starCommentQueue);
        }
    }

    @Override // X.C0IMD
    public final StarCommentGetQueueResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        StarCommentGetQueueResponse starCommentGetQueueResponse = new StarCommentGetQueueResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    starCommentGetQueueResponse.data = _StarCommentGetQueueResponse_Data_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return starCommentGetQueueResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, StarCommentGetQueueResponse starCommentGetQueueResponse, List list) {
    }
}
