package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match.CommonCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.Top2CardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match._CommonCardInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._Top2CardInfo_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UseTop2Card_ProtoDecoder implements C0IMD<UseTop2Card> {
    public static UseTop2Card LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UseTop2Card useTop2Card = new UseTop2Card();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            useTop2Card.displayContent = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        useTop2Card.anchorId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    useTop2Card.cardInfo = _Top2CardInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return useTop2Card;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(UseTop2Card useTop2Card) {
        CommonCardInfo commonCardInfo;
        UseTop2Card useTop2Card2 = useTop2Card;
        Top2CardInfo top2CardInfo = useTop2Card2.cardInfo;
        if (top2CardInfo != null && (commonCardInfo = top2CardInfo.common) != null) {
            _CommonCardInfo_ProtoDecoder.LJ(commonCardInfo);
        }
        Text text = useTop2Card2.displayContent;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final UseTop2Card LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UseTop2Card useTop2Card, List list) {
    }
}
