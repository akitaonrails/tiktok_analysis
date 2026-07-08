package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PotionCardInfo_ProtoDecoder implements C0IMD<PotionCardInfo> {
    public static PotionCardInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PotionCardInfo potionCardInfo = new PotionCardInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        potionCardInfo.cardNameKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        potionCardInfo.cardImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        potionCardInfo.sendTimeSec = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        potionCardInfo.sendUser = _BattleUserInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        potionCardInfo.effectLastDuration = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        potionCardInfo.ruleUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        potionCardInfo.effectTimeSec = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        potionCardInfo.toAnchorId = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return potionCardInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PotionCardInfo potionCardInfo) {
        PotionCardInfo potionCardInfo2 = potionCardInfo;
        ImageModel imageModel = potionCardInfo2.cardImage;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        BattleUserInfo battleUserInfo = potionCardInfo2.sendUser;
        if (battleUserInfo != null) {
            _BattleUserInfo_ProtoDecoder.LJ(battleUserInfo);
        }
    }

    @Override // X.C0IMD
    public final PotionCardInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PotionCardInfo potionCardInfo, List list) {
    }
}
