package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match.CommonCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.Top3CardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match._CommonCardInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._Top3CardInfo_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UseTop3Card_ProtoDecoder implements C0IMD<UseTop3Card> {
    public static UseTop3Card LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UseTop3Card useTop3Card = new UseTop3Card();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            useTop3Card.displayContent = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        useTop3Card.anchorId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    useTop3Card.cardInfo = _Top3CardInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return useTop3Card;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(UseTop3Card useTop3Card) {
        CommonCardInfo commonCardInfo;
        UseTop3Card useTop3Card2 = useTop3Card;
        Top3CardInfo top3CardInfo = useTop3Card2.cardInfo;
        if (top3CardInfo != null && (commonCardInfo = top3CardInfo.common) != null) {
            _CommonCardInfo_ProtoDecoder.LJ(commonCardInfo);
        }
        Text text = useTop3Card2.displayContent;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final UseTop3Card LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UseTop3Card useTop3Card, List list) {
    }
}
