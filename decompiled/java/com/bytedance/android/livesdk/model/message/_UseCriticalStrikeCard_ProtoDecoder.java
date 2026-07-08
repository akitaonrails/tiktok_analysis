package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match.CriticalStrikeCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match._CriticalStrikeCardInfo_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UseCriticalStrikeCard_ProtoDecoder implements C0IMD<UseCriticalStrikeCard> {
    public static UseCriticalStrikeCard LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UseCriticalStrikeCard useCriticalStrikeCard = new UseCriticalStrikeCard();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            useCriticalStrikeCard.displayContent = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        useCriticalStrikeCard.anchorId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    useCriticalStrikeCard.cardInfo = _CriticalStrikeCardInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return useCriticalStrikeCard;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(UseCriticalStrikeCard useCriticalStrikeCard) {
        UseCriticalStrikeCard useCriticalStrikeCard2 = useCriticalStrikeCard;
        CriticalStrikeCardInfo criticalStrikeCardInfo = useCriticalStrikeCard2.cardInfo;
        if (criticalStrikeCardInfo != null) {
            _CriticalStrikeCardInfo_ProtoDecoder.LJ(criticalStrikeCardInfo);
        }
        Text text = useCriticalStrikeCard2.displayContent;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final UseCriticalStrikeCard LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UseCriticalStrikeCard useCriticalStrikeCard, List list) {
    }
}
