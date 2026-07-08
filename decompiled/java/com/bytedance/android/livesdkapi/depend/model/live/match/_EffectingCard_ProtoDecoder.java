package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EffectingCard_ProtoDecoder implements C0IMD<EffectingCard> {
    public static EffectingCard LIZLLL(C1516680pZS c1516680pZS) {
        EffectingCard effectingCard = new EffectingCard();
        effectingCard.top3Cards = new ArrayList();
        effectingCard.potionCards = new ArrayList();
        effectingCard.waveCards = new ArrayList();
        effectingCard.criticalStrikeCards = new ArrayList();
        effectingCard.vaultGlovesCards = new ArrayList();
        effectingCard.extraTimeCards = new ArrayList();
        effectingCard.top2Cards = new ArrayList();
        effectingCard.specialEffectCards = new ArrayList();
        effectingCard.smokeCards = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        effectingCard.criticalStrikeCards.add(_CriticalStrikeCardInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 2:
                        effectingCard.smokeCards.add(_SmokeCardInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 3:
                        effectingCard.extraTimeCards.add(_ExtraTimeCardInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 4:
                        effectingCard.specialEffectCards.add(_SpecialEffectCardInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 5:
                        effectingCard.potionCards.add(_PotionCardInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 6:
                        effectingCard.waveCards.add(_WaveCardInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 7:
                        effectingCard.top2Cards.add(_Top2CardInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 8:
                        effectingCard.top3Cards.add(_Top3CardInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        effectingCard.vaultGlovesCards.add(_VaultGloveCardInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return effectingCard;
            }
        }
    }

    public static void LJ(EffectingCard effectingCard) {
        CommonCardInfo commonCardInfo;
        CommonCardInfo commonCardInfo2;
        CommonCardInfo commonCardInfo3;
        List<CriticalStrikeCardInfo> list = effectingCard.criticalStrikeCards;
        if (list == null) {
            effectingCard.criticalStrikeCards = new ArrayList();
        } else if (!list.isEmpty()) {
            for (CriticalStrikeCardInfo criticalStrikeCardInfo : effectingCard.criticalStrikeCards) {
                if (criticalStrikeCardInfo != null) {
                    _CriticalStrikeCardInfo_ProtoDecoder.LJ(criticalStrikeCardInfo);
                }
            }
        }
        List<SmokeCardInfo> list2 = effectingCard.smokeCards;
        if (list2 == null) {
            effectingCard.smokeCards = new ArrayList();
        } else if (!list2.isEmpty()) {
            for (SmokeCardInfo smokeCardInfo : effectingCard.smokeCards) {
                if (smokeCardInfo != null) {
                    _SmokeCardInfo_ProtoDecoder.LJ(smokeCardInfo);
                }
            }
        }
        List<ExtraTimeCardInfo> list3 = effectingCard.extraTimeCards;
        if (list3 == null) {
            effectingCard.extraTimeCards = new ArrayList();
        } else if (!list3.isEmpty()) {
            for (ExtraTimeCardInfo extraTimeCardInfo : effectingCard.extraTimeCards) {
                if (extraTimeCardInfo != null) {
                    _ExtraTimeCardInfo_ProtoDecoder.LJ(extraTimeCardInfo);
                }
            }
        }
        List<SpecialEffectCardInfo> list4 = effectingCard.specialEffectCards;
        if (list4 == null) {
            effectingCard.specialEffectCards = new ArrayList();
        } else if (!list4.isEmpty()) {
            for (SpecialEffectCardInfo specialEffectCardInfo : effectingCard.specialEffectCards) {
                if (specialEffectCardInfo != null) {
                    _SpecialEffectCardInfo_ProtoDecoder.LJ(specialEffectCardInfo);
                }
            }
        }
        List<PotionCardInfo> list5 = effectingCard.potionCards;
        if (list5 == null) {
            effectingCard.potionCards = new ArrayList();
        } else if (!list5.isEmpty()) {
            for (PotionCardInfo potionCardInfo : effectingCard.potionCards) {
                if (potionCardInfo != null) {
                    ImageModel imageModel = potionCardInfo.cardImage;
                    if (imageModel != null) {
                        _ImageModel_ProtoDecoder.LJ(imageModel);
                    }
                    BattleUserInfo battleUserInfo = potionCardInfo.sendUser;
                    if (battleUserInfo != null) {
                        _BattleUserInfo_ProtoDecoder.LJ(battleUserInfo);
                    }
                }
            }
        }
        List<WaveCardInfo> list6 = effectingCard.waveCards;
        if (list6 == null) {
            effectingCard.waveCards = new ArrayList();
        } else if (!list6.isEmpty()) {
            for (WaveCardInfo waveCardInfo : effectingCard.waveCards) {
                if (waveCardInfo != null) {
                    ImageModel imageModel2 = waveCardInfo.cardImage;
                    if (imageModel2 != null) {
                        _ImageModel_ProtoDecoder.LJ(imageModel2);
                    }
                    BattleUserInfo battleUserInfo2 = waveCardInfo.sendUser;
                    if (battleUserInfo2 != null) {
                        _BattleUserInfo_ProtoDecoder.LJ(battleUserInfo2);
                    }
                }
            }
        }
        List<Top2CardInfo> list7 = effectingCard.top2Cards;
        if (list7 == null) {
            effectingCard.top2Cards = new ArrayList();
        } else if (!list7.isEmpty()) {
            for (Top2CardInfo top2CardInfo : effectingCard.top2Cards) {
                if (top2CardInfo != null && (commonCardInfo = top2CardInfo.common) != null) {
                    _CommonCardInfo_ProtoDecoder.LJ(commonCardInfo);
                }
            }
        }
        List<Top3CardInfo> list8 = effectingCard.top3Cards;
        if (list8 == null) {
            effectingCard.top3Cards = new ArrayList();
        } else if (!list8.isEmpty()) {
            for (Top3CardInfo top3CardInfo : effectingCard.top3Cards) {
                if (top3CardInfo != null && (commonCardInfo2 = top3CardInfo.common) != null) {
                    _CommonCardInfo_ProtoDecoder.LJ(commonCardInfo2);
                }
            }
        }
        List<VaultGloveCardInfo> list9 = effectingCard.vaultGlovesCards;
        if (list9 == null) {
            effectingCard.vaultGlovesCards = new ArrayList();
            return;
        }
        if (list9.isEmpty()) {
            return;
        }
        for (VaultGloveCardInfo vaultGloveCardInfo : effectingCard.vaultGlovesCards) {
            if (vaultGloveCardInfo != null && (commonCardInfo3 = vaultGloveCardInfo.common) != null) {
                _CommonCardInfo_ProtoDecoder.LJ(commonCardInfo3);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EffectingCard effectingCard) {
        LJ(effectingCard);
    }

    @Override // X.C0IMD
    public final EffectingCard LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EffectingCard effectingCard, List list) {
    }
}
