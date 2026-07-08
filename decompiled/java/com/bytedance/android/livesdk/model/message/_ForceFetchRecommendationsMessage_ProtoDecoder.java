package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ForceFetchRecommendationsMessage_ProtoDecoder implements C0IMD<ForceFetchRecommendationsMessage> {
    @Override // X.C0IMD
    public final void LIZ(ForceFetchRecommendationsMessage forceFetchRecommendationsMessage) {
        ForceFetchRecommendationsMessage forceFetchRecommendationsMessage2 = forceFetchRecommendationsMessage;
        CommonMessageData commonMessageData = forceFetchRecommendationsMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        if (forceFetchRecommendationsMessage2.reasons == null) {
            forceFetchRecommendationsMessage2.reasons = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final ForceFetchRecommendationsMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        ForceFetchRecommendationsMessage forceFetchRecommendationsMessage = new ForceFetchRecommendationsMessage();
        forceFetchRecommendationsMessage.reasons = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 100) {
                        if (iLJI != 10) {
                            if (iLJI != 11) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                forceFetchRecommendationsMessage.fetchWithinMs = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            forceFetchRecommendationsMessage.reasons.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                        }
                    } else {
                        forceFetchRecommendationsMessage.strategyContext = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    forceFetchRecommendationsMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return forceFetchRecommendationsMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ForceFetchRecommendationsMessage forceFetchRecommendationsMessage, List list) {
    }
}
