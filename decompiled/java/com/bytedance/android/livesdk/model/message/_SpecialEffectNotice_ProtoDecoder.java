package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.depend.model.live.match.CommunityHeartMeInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match._CommunityHeartMeInfo_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SpecialEffectNotice_ProtoDecoder implements C0IMD<SpecialEffectNotice> {
    public static SpecialEffectNotice LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SpecialEffectNotice specialEffectNotice = new SpecialEffectNotice();
        specialEffectNotice.affectedAnchorPairs = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        specialEffectNotice.score = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        specialEffectNotice.fromUserId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        specialEffectNotice.toAnchorId = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        specialEffectNotice.affectedAnchorPairs.add(_AnchorPair_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 5:
                        specialEffectNotice.effectType = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        specialEffectNotice.communityHeartMeInfo = _CommunityHeartMeInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        specialEffectNotice.communityHeartMeInfoStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return specialEffectNotice;
            }
        }
    }

    public static void LJ(SpecialEffectNotice specialEffectNotice) {
        List<AnchorPair> list = specialEffectNotice.affectedAnchorPairs;
        if (list == null) {
            specialEffectNotice.affectedAnchorPairs = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<AnchorPair> it2 = specialEffectNotice.affectedAnchorPairs.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        CommunityHeartMeInfo communityHeartMeInfo = specialEffectNotice.communityHeartMeInfo;
        if (communityHeartMeInfo != null) {
            _CommunityHeartMeInfo_ProtoDecoder.LJ(communityHeartMeInfo);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SpecialEffectNotice specialEffectNotice) {
        LJ(specialEffectNotice);
    }

    @Override // X.C0IMD
    public final SpecialEffectNotice LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SpecialEffectNotice specialEffectNotice, List list) {
    }
}
