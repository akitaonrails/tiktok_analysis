package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.GiftLimitGetResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftLimitGetResponse_Data_ProtoDecoder implements C0IMD<GiftLimitGetResponse.Data> {
    @Override // X.C0IMD
    public final void LIZ(GiftLimitGetResponse.Data data) {
        GiftLimitGetResponse.Data.GiftPromptStall giftPromptStall = data.giftPromptStall;
        if (giftPromptStall != null && giftPromptStall.amountStalls == null) {
            giftPromptStall.amountStalls = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final GiftLimitGetResponse.Data LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GiftLimitGetResponse.Data data = new GiftLimitGetResponse.Data();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        data.notificationStatus = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        data.giftPromptStall = _GiftLimitGetResponse_Data_GiftPromptStall_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        data.setSuccessfullyToast = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        data.setFailedToast = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        data.allowCustomStall = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 6:
                        data.suggestedCustomStallText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        data.inUserGiftingAddictionExpr = C1516700pZU.LIZ(c1516680pZS);
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
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftLimitGetResponse.Data data, List list) {
    }
}
