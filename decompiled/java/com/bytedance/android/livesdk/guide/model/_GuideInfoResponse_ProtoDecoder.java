package com.bytedance.android.livesdk.guide.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.guide.model.GuideInfoResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuideInfoResponse_ProtoDecoder implements C0IMD<GuideInfoResponse> {
    @Override // X.C0IMD
    public final void LIZ(GuideInfoResponse guideInfoResponse) {
        GuideInfoResponse.Data data = guideInfoResponse.data;
        if (data != null) {
            GuideInfoResponse.GuideEntry guideEntry = data.guideEntry;
            if (guideEntry != null) {
                _GuideInfoResponse_GuideEntry_ProtoDecoder.LJ(guideEntry);
            }
            UGGiftTaskInfo uGGiftTaskInfo = data.ugGiftTaskInfo;
            if (uGGiftTaskInfo != null) {
                _UGGiftTaskInfo_ProtoDecoder.LJ(uGGiftTaskInfo);
            }
        }
    }

    @Override // X.C0IMD
    public final GuideInfoResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GuideInfoResponse guideInfoResponse = new GuideInfoResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    guideInfoResponse.data = _GuideInfoResponse_Data_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guideInfoResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuideInfoResponse guideInfoResponse, List list) {
    }
}
