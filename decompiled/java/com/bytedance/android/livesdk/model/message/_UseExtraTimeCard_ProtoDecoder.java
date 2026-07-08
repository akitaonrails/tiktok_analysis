package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match.ExtraTimeCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match._ExtraTimeCardInfo_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UseExtraTimeCard_ProtoDecoder implements C0IMD<UseExtraTimeCard> {
    public static UseExtraTimeCard LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UseExtraTimeCard useExtraTimeCard = new UseExtraTimeCard();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            useExtraTimeCard.displayContent = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        useExtraTimeCard.anchorId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    useExtraTimeCard.cardInfo = _ExtraTimeCardInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return useExtraTimeCard;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(UseExtraTimeCard useExtraTimeCard) {
        UseExtraTimeCard useExtraTimeCard2 = useExtraTimeCard;
        ExtraTimeCardInfo extraTimeCardInfo = useExtraTimeCard2.cardInfo;
        if (extraTimeCardInfo != null) {
            _ExtraTimeCardInfo_ProtoDecoder.LJ(extraTimeCardInfo);
        }
        Text text = useExtraTimeCard2.displayContent;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final UseExtraTimeCard LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UseExtraTimeCard useExtraTimeCard, List list) {
    }
}
