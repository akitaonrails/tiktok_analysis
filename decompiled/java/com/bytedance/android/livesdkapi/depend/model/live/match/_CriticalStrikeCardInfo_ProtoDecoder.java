package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CriticalStrikeCardInfo_ProtoDecoder implements C0IMD<CriticalStrikeCardInfo> {
    public static CriticalStrikeCardInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CriticalStrikeCardInfo criticalStrikeCardInfo = new CriticalStrikeCardInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        criticalStrikeCardInfo.cardNameKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        criticalStrikeCardInfo.cardImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        criticalStrikeCardInfo.sendTimeSec = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        criticalStrikeCardInfo.sendUser = _BattleUserInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        criticalStrikeCardInfo.effectLastDuration = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        criticalStrikeCardInfo.criticalStrikeRateLow = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        criticalStrikeCardInfo.criticalStrikeRateHigh = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        criticalStrikeCardInfo.multiple = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        criticalStrikeCardInfo.giftNameKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        criticalStrikeCardInfo.ruleUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        criticalStrikeCardInfo.effectTimeSec = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        criticalStrikeCardInfo.toAnchorId = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        criticalStrikeCardInfo.toAnchorIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return criticalStrikeCardInfo;
            }
        }
    }

    public static void LJ(CriticalStrikeCardInfo criticalStrikeCardInfo) {
        ImageModel imageModel = criticalStrikeCardInfo.cardImage;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        BattleUserInfo battleUserInfo = criticalStrikeCardInfo.sendUser;
        if (battleUserInfo != null) {
            _BattleUserInfo_ProtoDecoder.LJ(battleUserInfo);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CriticalStrikeCardInfo criticalStrikeCardInfo) {
        LJ(criticalStrikeCardInfo);
    }

    @Override // X.C0IMD
    public final CriticalStrikeCardInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CriticalStrikeCardInfo criticalStrikeCardInfo, List list) {
    }
}
