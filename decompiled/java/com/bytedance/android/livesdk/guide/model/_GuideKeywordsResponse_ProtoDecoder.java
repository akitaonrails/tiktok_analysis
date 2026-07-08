package com.bytedance.android.livesdk.guide.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.guide.model.GuideKeywordsResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuideKeywordsResponse_ProtoDecoder implements C0IMD<GuideKeywordsResponse> {
    @Override // X.C0IMD
    public final void LIZ(GuideKeywordsResponse guideKeywordsResponse) {
        GuideKeywordsResponse.Data data = guideKeywordsResponse.data;
        if (data != null) {
            _GuideKeywordsResponse_Data_ProtoDecoder.LJ(data);
        }
    }

    @Override // X.C0IMD
    public final GuideKeywordsResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GuideKeywordsResponse guideKeywordsResponse = new GuideKeywordsResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    guideKeywordsResponse.data = _GuideKeywordsResponse_Data_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guideKeywordsResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuideKeywordsResponse guideKeywordsResponse, List list) {
    }
}
