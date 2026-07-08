package com.bytedance.android.livesdk.chatroom.api;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.api.SubPinCard;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SubPinCard_SubPinCardExtra_ProtoDecoder implements C0IMD<SubPinCard.SubPinCardExtra> {
    public static SubPinCard.SubPinCardExtra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SubPinCard.SubPinCardExtra subPinCardExtra = new SubPinCard.SubPinCardExtra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    subPinCardExtra.sovInfo = _SOVPinCardInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return subPinCardExtra;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SubPinCard.SubPinCardExtra subPinCardExtra) {
        SubOnlyVideosBriefInfo subOnlyVideosBriefInfo;
        SOVPinCardInfo sOVPinCardInfo = subPinCardExtra.sovInfo;
        if (sOVPinCardInfo != null && (subOnlyVideosBriefInfo = sOVPinCardInfo.sovInfo) != null) {
            _SubOnlyVideosBriefInfo_ProtoDecoder.LJ(subOnlyVideosBriefInfo);
        }
    }

    @Override // X.C0IMD
    public final SubPinCard.SubPinCardExtra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SubPinCard.SubPinCardExtra subPinCardExtra, List list) {
    }
}
