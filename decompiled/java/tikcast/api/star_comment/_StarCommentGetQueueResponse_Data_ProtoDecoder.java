package tikcast.api.star_comment;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import tikcast.api.star_comment.StarCommentGetQueueResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _StarCommentGetQueueResponse_Data_ProtoDecoder implements C0IMD<StarCommentGetQueueResponse.Data> {
    public static StarCommentGetQueueResponse.Data LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        StarCommentGetQueueResponse.Data data = new StarCommentGetQueueResponse.Data();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        data.queue = _StarCommentQueue_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        data.serverCurMsgStartTimeMs = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        data.clientReserve = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        data.pollingIntervalMs = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        data.normalIntervalBetweenMsgMs = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        data.advancedIntervalBetweenMsgMs = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        data.laggingIntervalBetweenMsgMs = c1516680pZS.LJIIJJI();
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
    public final void LIZ(StarCommentGetQueueResponse.Data data) {
        StarCommentQueue starCommentQueue = data.queue;
        if (starCommentQueue != null) {
            _StarCommentQueue_ProtoDecoder.LJ(starCommentQueue);
        }
    }

    @Override // X.C0IMD
    public final StarCommentGetQueueResponse.Data LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, StarCommentGetQueueResponse.Data data, List list) {
    }
}
