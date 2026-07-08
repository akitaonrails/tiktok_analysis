package tikcast.api.star_comment;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import tikcast.api.star_comment.StarCommentDeleteResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _StarCommentDeleteResponse_Data_ProtoDecoder implements C0IMD<StarCommentDeleteResponse.Data> {
    public static StarCommentDeleteResponse.Data LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        StarCommentDeleteResponse.Data data = new StarCommentDeleteResponse.Data();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        data.serverCurMsgStartTimeMs = c1516680pZS.LJIIJJI();
                    }
                } else {
                    data.queue = _StarCommentQueue_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return data;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(StarCommentDeleteResponse.Data data) {
        StarCommentQueue starCommentQueue = data.queue;
        if (starCommentQueue != null) {
            _StarCommentQueue_ProtoDecoder.LJ(starCommentQueue);
        }
    }

    @Override // X.C0IMD
    public final StarCommentDeleteResponse.Data LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, StarCommentDeleteResponse.Data data, List list) {
    }
}
