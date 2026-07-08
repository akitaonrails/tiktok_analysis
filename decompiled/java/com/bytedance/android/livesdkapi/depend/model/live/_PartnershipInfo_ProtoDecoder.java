package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PartnershipInfo_ProtoDecoder implements C0IMD<PartnershipInfo> {
    public static PartnershipInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PartnershipInfo partnershipInfo = new PartnershipInfo();
        partnershipInfo.gameInfoList = new ArrayList();
        partnershipInfo.taskIdList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        partnershipInfo.partnershipRoom = Boolean.valueOf(C1516700pZU.LIZ(c1516680pZS));
                        break;
                    case 2:
                        partnershipInfo.promotingTaskId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        partnershipInfo.taskIdList.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 4:
                        partnershipInfo.promotingGameId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        partnershipInfo.showTaskId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        partnershipInfo.promotingDropsId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        partnershipInfo.promotingRoom = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 8:
                        partnershipInfo.promotingTaskType = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        partnershipInfo.showTaskType = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        partnershipInfo.gameInfoList.add(_PartnershipGameInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return partnershipInfo;
            }
        }
    }

    public static void LJ(PartnershipInfo partnershipInfo) {
        if (partnershipInfo.taskIdList == null) {
            partnershipInfo.taskIdList = new ArrayList();
        }
        List<PartnershipGameInfo> list = partnershipInfo.gameInfoList;
        if (list == null) {
            partnershipInfo.gameInfoList = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<PartnershipGameInfo> it2 = partnershipInfo.gameInfoList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PartnershipInfo partnershipInfo) {
        LJ(partnershipInfo);
    }

    @Override // X.C0IMD
    public final PartnershipInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PartnershipInfo partnershipInfo, List list) {
    }
}
