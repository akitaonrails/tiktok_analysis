package webcast.api.battle;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.depend.model.live.match.CommonCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.CriticalStrikeCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.ExtraTimeCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.SmokeCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.SpecialEffectCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.Top2CardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.Top3CardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.VaultGloveCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match._CommonCardInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._CriticalStrikeCardInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._ExtraTimeCardInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._SmokeCardInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._SpecialEffectCardInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._Top2CardInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._Top3CardInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._VaultGloveCardInfo_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import webcast.api.battle.BattleAwardItemCardResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleAwardItemCardResponse_BattleAwardedItemCard_ProtoDecoder implements C0IMD<BattleAwardItemCardResponse.BattleAwardedItemCard> {
    public static BattleAwardItemCardResponse.BattleAwardedItemCard LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleAwardItemCardResponse.BattleAwardedItemCard battleAwardedItemCard = new BattleAwardItemCardResponse.BattleAwardedItemCard();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        battleAwardedItemCard.cardType = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        battleAwardedItemCard.criticalStrikeCard = _CriticalStrikeCardInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        battleAwardedItemCard.smokeCard = _SmokeCardInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        battleAwardedItemCard.extraTimeCard = _ExtraTimeCardInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        battleAwardedItemCard.specialEffectCard = _SpecialEffectCardInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        battleAwardedItemCard.top2Card = _Top2CardInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        battleAwardedItemCard.top3Card = _Top3CardInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        battleAwardedItemCard.vaultGlovesCard = _VaultGloveCardInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleAwardedItemCard;
            }
        }
    }

    public static void LJ(BattleAwardItemCardResponse.BattleAwardedItemCard battleAwardedItemCard) {
        CommonCardInfo commonCardInfo;
        CommonCardInfo commonCardInfo2;
        CommonCardInfo commonCardInfo3;
        CriticalStrikeCardInfo criticalStrikeCardInfo = battleAwardedItemCard.criticalStrikeCard;
        if (criticalStrikeCardInfo != null) {
            _CriticalStrikeCardInfo_ProtoDecoder.LJ(criticalStrikeCardInfo);
        }
        SmokeCardInfo smokeCardInfo = battleAwardedItemCard.smokeCard;
        if (smokeCardInfo != null) {
            _SmokeCardInfo_ProtoDecoder.LJ(smokeCardInfo);
        }
        ExtraTimeCardInfo extraTimeCardInfo = battleAwardedItemCard.extraTimeCard;
        if (extraTimeCardInfo != null) {
            _ExtraTimeCardInfo_ProtoDecoder.LJ(extraTimeCardInfo);
        }
        SpecialEffectCardInfo specialEffectCardInfo = battleAwardedItemCard.specialEffectCard;
        if (specialEffectCardInfo != null) {
            _SpecialEffectCardInfo_ProtoDecoder.LJ(specialEffectCardInfo);
        }
        Top2CardInfo top2CardInfo = battleAwardedItemCard.top2Card;
        if (top2CardInfo != null && (commonCardInfo3 = top2CardInfo.common) != null) {
            _CommonCardInfo_ProtoDecoder.LJ(commonCardInfo3);
        }
        Top3CardInfo top3CardInfo = battleAwardedItemCard.top3Card;
        if (top3CardInfo != null && (commonCardInfo2 = top3CardInfo.common) != null) {
            _CommonCardInfo_ProtoDecoder.LJ(commonCardInfo2);
        }
        VaultGloveCardInfo vaultGloveCardInfo = battleAwardedItemCard.vaultGlovesCard;
        if (vaultGloveCardInfo != null && (commonCardInfo = vaultGloveCardInfo.common) != null) {
            _CommonCardInfo_ProtoDecoder.LJ(commonCardInfo);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BattleAwardItemCardResponse.BattleAwardedItemCard battleAwardedItemCard) {
        LJ(battleAwardedItemCard);
    }

    @Override // X.C0IMD
    public final BattleAwardItemCardResponse.BattleAwardedItemCard LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleAwardItemCardResponse.BattleAwardedItemCard battleAwardedItemCard, List list) {
    }
}
