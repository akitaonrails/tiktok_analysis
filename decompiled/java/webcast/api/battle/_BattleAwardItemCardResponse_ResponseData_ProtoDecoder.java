package webcast.api.battle;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.depend.model.live.match.CriticalStrikeCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.ExtraTimeCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.SmokeCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.SpecialEffectCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match._CriticalStrikeCardInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._ExtraTimeCardInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._SmokeCardInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._SpecialEffectCardInfo_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import webcast.api.battle.BattleAwardItemCardResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleAwardItemCardResponse_ResponseData_ProtoDecoder implements C0IMD<BattleAwardItemCardResponse.ResponseData> {
    @Override // X.C0IMD
    public final void LIZ(BattleAwardItemCardResponse.ResponseData responseData) {
        BattleAwardItemCardResponse.ResponseData responseData2 = responseData;
        CriticalStrikeCardInfo criticalStrikeCardInfo = responseData2.criticalStrikeCard;
        if (criticalStrikeCardInfo != null) {
            _CriticalStrikeCardInfo_ProtoDecoder.LJ(criticalStrikeCardInfo);
        }
        SmokeCardInfo smokeCardInfo = responseData2.smokeCard;
        if (smokeCardInfo != null) {
            _SmokeCardInfo_ProtoDecoder.LJ(smokeCardInfo);
        }
        ExtraTimeCardInfo extraTimeCardInfo = responseData2.extraTimeCard;
        if (extraTimeCardInfo != null) {
            _ExtraTimeCardInfo_ProtoDecoder.LJ(extraTimeCardInfo);
        }
        SpecialEffectCardInfo specialEffectCardInfo = responseData2.specialEffectCard;
        if (specialEffectCardInfo != null) {
            _SpecialEffectCardInfo_ProtoDecoder.LJ(specialEffectCardInfo);
        }
        List<BattleAwardItemCardResponse.BattleAwardedItemCard> list = responseData2.cards;
        if (list == null) {
            responseData2.cards = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (BattleAwardItemCardResponse.BattleAwardedItemCard battleAwardedItemCard : responseData2.cards) {
            if (battleAwardedItemCard != null) {
                _BattleAwardItemCardResponse_BattleAwardedItemCard_ProtoDecoder.LJ(battleAwardedItemCard);
            }
        }
    }

    @Override // X.C0IMD
    public final BattleAwardItemCardResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        BattleAwardItemCardResponse.ResponseData responseData = new BattleAwardItemCardResponse.ResponseData();
        responseData.cards = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        responseData.cardType = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        responseData.criticalStrikeCard = _CriticalStrikeCardInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        responseData.smokeCard = _SmokeCardInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        responseData.extraTimeCard = _ExtraTimeCardInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        responseData.specialEffectCard = _SpecialEffectCardInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        responseData.cards.add(_BattleAwardItemCardResponse_BattleAwardedItemCard_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleAwardItemCardResponse.ResponseData responseData, List list) {
    }
}
