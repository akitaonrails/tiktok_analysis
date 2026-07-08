package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match.CommunityHeartMeInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.SpecialEffectCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match._CommunityHeartMeInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._SpecialEffectCardInfo_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UseSpecialEffectCard_ProtoDecoder implements C0IMD<UseSpecialEffectCard> {
    public static UseSpecialEffectCard LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UseSpecialEffectCard useSpecialEffectCard = new UseSpecialEffectCard();
        useSpecialEffectCard.affectedAnchorPairs = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        useSpecialEffectCard.cardInfo = _SpecialEffectCardInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        useSpecialEffectCard.anchorId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        useSpecialEffectCard.displayContent = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        useSpecialEffectCard.affectedAnchorPairs.add(_AnchorPair_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 5:
                        useSpecialEffectCard.effectType = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        useSpecialEffectCard.communityHeartMeInfo = _CommunityHeartMeInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        useSpecialEffectCard.communityHeartMeInfoStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return useSpecialEffectCard;
            }
        }
    }

    public static void LJ(UseSpecialEffectCard useSpecialEffectCard) {
        SpecialEffectCardInfo specialEffectCardInfo = useSpecialEffectCard.cardInfo;
        if (specialEffectCardInfo != null) {
            _SpecialEffectCardInfo_ProtoDecoder.LJ(specialEffectCardInfo);
        }
        Text text = useSpecialEffectCard.displayContent;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        List<AnchorPair> list = useSpecialEffectCard.affectedAnchorPairs;
        if (list == null) {
            useSpecialEffectCard.affectedAnchorPairs = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<AnchorPair> it2 = useSpecialEffectCard.affectedAnchorPairs.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        CommunityHeartMeInfo communityHeartMeInfo = useSpecialEffectCard.communityHeartMeInfo;
        if (communityHeartMeInfo != null) {
            _CommunityHeartMeInfo_ProtoDecoder.LJ(communityHeartMeInfo);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(UseSpecialEffectCard useSpecialEffectCard) {
        LJ(useSpecialEffectCard);
    }

    @Override // X.C0IMD
    public final UseSpecialEffectCard LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UseSpecialEffectCard useSpecialEffectCard, List list) {
    }
}
