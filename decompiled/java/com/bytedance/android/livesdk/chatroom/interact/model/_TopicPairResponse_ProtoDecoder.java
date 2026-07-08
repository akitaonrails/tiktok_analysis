package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.interact.model.TopicPairResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TopicPairResponse_ProtoDecoder implements C0IMD<TopicPairResponse> {
    @Override // X.C0IMD
    public final void LIZ(TopicPairResponse topicPairResponse) {
        TopicPairResponse.ResponseData responseData = topicPairResponse.data;
        if (responseData != null) {
            _TopicPairResponse_ResponseData_ProtoDecoder.LJ(responseData);
        }
    }

    @Override // X.C0IMD
    public final TopicPairResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        TopicPairResponse topicPairResponse = new TopicPairResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    topicPairResponse.data = _TopicPairResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return topicPairResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TopicPairResponse topicPairResponse, List list) {
    }
}
