package com.bytedance.android.livesdk.guide.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.guide.model.GuideInfoResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuideInfoResponse_Data_ProtoDecoder implements C0IMD<GuideInfoResponse.Data> {
    public static GuideInfoResponse.Data LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GuideInfoResponse.Data data = new GuideInfoResponse.Data();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        data.userStats = _GuideInfoResponse_UserStats_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        data.guideType = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        data.schemaUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        data.shouldUseConfig = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 5:
                        data.guideEntry = _GuideInfoResponse_GuideEntry_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        data.ugGiftTaskInfo = _UGGiftTaskInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return data;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GuideInfoResponse.Data data) {
        GuideInfoResponse.Data data2 = data;
        GuideInfoResponse.GuideEntry guideEntry = data2.guideEntry;
        if (guideEntry != null) {
            _GuideInfoResponse_GuideEntry_ProtoDecoder.LJ(guideEntry);
        }
        UGGiftTaskInfo uGGiftTaskInfo = data2.ugGiftTaskInfo;
        if (uGGiftTaskInfo != null) {
            _UGGiftTaskInfo_ProtoDecoder.LJ(uGGiftTaskInfo);
        }
    }

    @Override // X.C0IMD
    public final GuideInfoResponse.Data LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuideInfoResponse.Data data, List list) {
    }
}
