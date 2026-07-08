package webcast.api.gift;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import webcast.api.gift.GiftRecommendationResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftRecommendationResponse_Data_ProtoDecoder implements C0IMD<GiftRecommendationResponse.Data> {
    @Override // X.C0IMD
    public final GiftRecommendationResponse.Data LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GiftRecommendationResponse.Data data = new GiftRecommendationResponse.Data();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        data.strategyToken = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    data.recommendedGiftIds = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return data;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GiftRecommendationResponse.Data data) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftRecommendationResponse.Data data, List list) {
    }
}
