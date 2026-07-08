package com.bytedance.android.livesdk.model.message.battle;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMeta;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMetaV2;
import com.bytedance.android.livesdkapi.depend.model.live.match._GiftModeMetaV2_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._GiftModeMeta_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleSetting_ProtoDecoder implements C0IMD<BattleSetting> {
    public static BattleSetting LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleSetting battleSetting = new BattleSetting();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        battleSetting.battleId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        battleSetting.startTimeMs = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        battleSetting.duration = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        battleSetting.channelId = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        battleSetting.status = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        battleSetting.inviteType = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        battleSetting.giftModeMeta = _GiftModeMeta_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        battleSetting.battleType = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        battleSetting.extraDurationSecond = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        battleSetting.endTimeMs = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        battleSetting.scene = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        battleSetting.sourceType = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        battleSetting.iceShowdownSetting = c1516680pZS.LJIIJ();
                        break;
                    case 14:
                        battleSetting.gameplayOption = c1516680pZS.LJIIJ();
                        break;
                    case 15:
                        battleSetting.giftModeMetaV2 = _GiftModeMetaV2_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleSetting;
            }
        }
    }

    public static void LJ(BattleSetting battleSetting) {
        GiftModeMeta giftModeMeta = battleSetting.giftModeMeta;
        if (giftModeMeta != null) {
            _GiftModeMeta_ProtoDecoder.LJ(giftModeMeta);
        }
        GiftModeMetaV2 giftModeMetaV2 = battleSetting.giftModeMetaV2;
        if (giftModeMetaV2 != null) {
            _GiftModeMetaV2_ProtoDecoder.LJ(giftModeMetaV2);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BattleSetting battleSetting) {
        LJ(battleSetting);
    }

    @Override // X.C0IMD
    public final BattleSetting LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleSetting battleSetting, List list) {
    }
}
