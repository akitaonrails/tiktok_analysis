package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _OecLiveCreatorMessageData_ProtoDecoder implements C0IMD<OecLiveCreatorMessageData> {
    public static OecLiveCreatorMessageData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        OecLiveCreatorMessageData oecLiveCreatorMessageData = new OecLiveCreatorMessageData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 2) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    oecLiveCreatorMessageData.auctionConfig = _AuctionConfigV2_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return oecLiveCreatorMessageData;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(OecLiveCreatorMessageData oecLiveCreatorMessageData) {
        SurpriseSet surpriseSet;
        AuctionConfigV2 auctionConfigV2 = oecLiveCreatorMessageData.auctionConfig;
        if (auctionConfigV2 != null && (surpriseSet = auctionConfigV2.surpriseSet) != null) {
            _SurpriseSet_ProtoDecoder.LJ(surpriseSet);
        }
    }

    @Override // X.C0IMD
    public final OecLiveCreatorMessageData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, OecLiveCreatorMessageData oecLiveCreatorMessageData, List list) {
    }
}
