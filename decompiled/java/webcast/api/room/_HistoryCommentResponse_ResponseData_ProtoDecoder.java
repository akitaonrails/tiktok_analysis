package webcast.api.room;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.ProtoMessageFetchResult;
import com.bytedance.android.livesdkapi.message._ProtoMessageFetchResult_BaseProtoMessage_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import webcast.api.room.HistoryCommentResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _HistoryCommentResponse_ResponseData_ProtoDecoder implements C0IMD<HistoryCommentResponse.ResponseData> {
    public static HistoryCommentResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        HistoryCommentResponse.ResponseData responseData = new HistoryCommentResponse.ResponseData();
        responseData.messages = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            responseData.cursor = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        responseData.hasMore = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    responseData.messages.add(_ProtoMessageFetchResult_BaseProtoMessage_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    public static void LJ(HistoryCommentResponse.ResponseData responseData) {
        List<ProtoMessageFetchResult.BaseProtoMessage> list = responseData.messages;
        if (list == null) {
            responseData.messages = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<ProtoMessageFetchResult.BaseProtoMessage> it2 = responseData.messages.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(HistoryCommentResponse.ResponseData responseData) {
        LJ(responseData);
    }

    @Override // X.C0IMD
    public final HistoryCommentResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, HistoryCommentResponse.ResponseData responseData, List list) {
    }
}
