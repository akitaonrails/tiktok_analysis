package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.interact.model.TopicSetResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TopicSetResponse_ResponseData_ProtoDecoder implements C0IMD<TopicSetResponse.ResponseData> {
    @Override // X.C0IMD
    public final TopicSetResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        TopicSetResponse.ResponseData responseData = new TopicSetResponse.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (c1516680pZS.LJI() != -1) {
            C1516700pZU.LJ(c1516680pZS);
        }
        c1516680pZS.LJ(jLIZJ);
        return responseData;
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(TopicSetResponse.ResponseData responseData) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TopicSetResponse.ResponseData responseData, List list) {
    }
}
