package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match.SmokeCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match._SmokeCardInfo_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UseSmokeCard_ProtoDecoder implements C0IMD<UseSmokeCard> {
    public static UseSmokeCard LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UseSmokeCard useSmokeCard = new UseSmokeCard();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            useSmokeCard.displayContent = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        useSmokeCard.anchorId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    useSmokeCard.cardInfo = _SmokeCardInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return useSmokeCard;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(UseSmokeCard useSmokeCard) {
        UseSmokeCard useSmokeCard2 = useSmokeCard;
        SmokeCardInfo smokeCardInfo = useSmokeCard2.cardInfo;
        if (smokeCardInfo != null) {
            _SmokeCardInfo_ProtoDecoder.LJ(smokeCardInfo);
        }
        Text text = useSmokeCard2.displayContent;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final UseSmokeCard LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UseSmokeCard useSmokeCard, List list) {
    }
}
