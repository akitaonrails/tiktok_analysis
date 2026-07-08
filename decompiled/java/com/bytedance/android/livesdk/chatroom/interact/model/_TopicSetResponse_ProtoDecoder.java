package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.interact.model.TopicSetResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TopicSetResponse_ProtoDecoder implements C0IMD<TopicSetResponse> {
    @Override // X.C0IMD
    public final void LIZ(TopicSetResponse topicSetResponse) {
    }

    @Override // X.C0IMD
    public final TopicSetResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        TopicSetResponse topicSetResponse = new TopicSetResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    TopicSetResponse.ResponseData responseData = new TopicSetResponse.ResponseData();
                    long jLIZJ2 = c1516680pZS.LIZJ();
                    while (c1516680pZS.LJI() != -1) {
                        C1516700pZU.LJ(c1516680pZS);
                    }
                    c1516680pZS.LJ(jLIZJ2);
                    topicSetResponse.data = responseData;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return topicSetResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TopicSetResponse topicSetResponse, List list) {
    }
}
