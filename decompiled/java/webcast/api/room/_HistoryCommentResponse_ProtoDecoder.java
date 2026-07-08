package webcast.api.room;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import webcast.api.room.HistoryCommentResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _HistoryCommentResponse_ProtoDecoder implements C0IMD<HistoryCommentResponse> {
    @Override // X.C0IMD
    public final void LIZ(HistoryCommentResponse historyCommentResponse) {
        HistoryCommentResponse.ResponseData responseData = historyCommentResponse.data;
        if (responseData != null) {
            _HistoryCommentResponse_ResponseData_ProtoDecoder.LJ(responseData);
        }
    }

    @Override // X.C0IMD
    public final HistoryCommentResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        HistoryCommentResponse historyCommentResponse = new HistoryCommentResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    historyCommentResponse.data = _HistoryCommentResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return historyCommentResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, HistoryCommentResponse historyCommentResponse, List list) {
    }
}
