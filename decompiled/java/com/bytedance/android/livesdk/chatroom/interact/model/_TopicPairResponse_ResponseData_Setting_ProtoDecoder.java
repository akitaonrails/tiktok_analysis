package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.interact.model.TopicPairResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TopicPairResponse_ResponseData_Setting_ProtoDecoder implements C0IMD<TopicPairResponse.ResponseData.Setting> {
    public static TopicPairResponse.ResponseData.Setting LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TopicPairResponse.ResponseData.Setting setting = new TopicPairResponse.ResponseData.Setting();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        setting.timeoutSec = c1516680pZS.LJIIJJI();
                    }
                } else {
                    setting.expectSuccSec = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return setting;
            }
        }
    }

    @Override // X.C0IMD
    public final TopicPairResponse.ResponseData.Setting LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(TopicPairResponse.ResponseData.Setting setting) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TopicPairResponse.ResponseData.Setting setting, List list) {
    }
}
