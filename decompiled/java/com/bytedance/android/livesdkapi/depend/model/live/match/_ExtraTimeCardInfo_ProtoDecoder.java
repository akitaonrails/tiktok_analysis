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
public final class _ExtraTimeCardInfo_ProtoDecoder implements C0IMD<ExtraTimeCardInfo> {
    public static ExtraTimeCardInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ExtraTimeCardInfo extraTimeCardInfo = new ExtraTimeCardInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        extraTimeCardInfo.cardNameKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        extraTimeCardInfo.cardImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        extraTimeCardInfo.sendTimeSec = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        extraTimeCardInfo.sendUser = _BattleUserInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        extraTimeCardInfo.effectLastDuration = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        extraTimeCardInfo.ruleUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        extraTimeCardInfo.effectTimeSec = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        extraTimeCardInfo.toAnchorId = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        extraTimeCardInfo.extraDurationSec = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        extraTimeCardInfo.toAnchorIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return extraTimeCardInfo;
            }
        }
    }

    public static void LJ(ExtraTimeCardInfo extraTimeCardInfo) {
        ImageModel imageModel = extraTimeCardInfo.cardImage;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        BattleUserInfo battleUserInfo = extraTimeCardInfo.sendUser;
        if (battleUserInfo != null) {
            _BattleUserInfo_ProtoDecoder.LJ(battleUserInfo);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ExtraTimeCardInfo extraTimeCardInfo) {
        LJ(extraTimeCardInfo);
    }

    @Override // X.C0IMD
    public final ExtraTimeCardInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ExtraTimeCardInfo extraTimeCardInfo, List list) {
    }
}
