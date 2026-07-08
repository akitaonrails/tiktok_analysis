package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SpecialEffectCardInfo_ProtoDecoder implements C0IMD<SpecialEffectCardInfo> {
    public static SpecialEffectCardInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SpecialEffectCardInfo specialEffectCardInfo = new SpecialEffectCardInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        specialEffectCardInfo.cardNameKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        specialEffectCardInfo.cardImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        specialEffectCardInfo.sendTimeSec = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        specialEffectCardInfo.sendUser = _BattleUserInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        specialEffectCardInfo.effectLastDuration = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        specialEffectCardInfo.ruleUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        specialEffectCardInfo.effectTimeSec = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        specialEffectCardInfo.toAnchorId = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        specialEffectCardInfo.toAnchorIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return specialEffectCardInfo;
            }
        }
    }

    public static void LJ(SpecialEffectCardInfo specialEffectCardInfo) {
        ImageModel imageModel = specialEffectCardInfo.cardImage;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        BattleUserInfo battleUserInfo = specialEffectCardInfo.sendUser;
        if (battleUserInfo != null) {
            _BattleUserInfo_ProtoDecoder.LJ(battleUserInfo);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SpecialEffectCardInfo specialEffectCardInfo) {
        LJ(specialEffectCardInfo);
    }

    @Override // X.C0IMD
    public final SpecialEffectCardInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SpecialEffectCardInfo specialEffectCardInfo, List list) {
    }
}
