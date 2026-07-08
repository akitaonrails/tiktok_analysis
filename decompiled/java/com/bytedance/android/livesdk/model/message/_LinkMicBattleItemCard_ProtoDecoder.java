package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.CommonCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.CriticalStrikeCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.ExtraTimeCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.PotionCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.SmokeCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.Top2CardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.Top3CardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.VaultGloveCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.WaveCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleUserInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._CommonCardInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._CriticalStrikeCardInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._ExtraTimeCardInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._SmokeCardInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkMicBattleItemCard_ProtoDecoder implements C0IMD<LinkMicBattleItemCard> {
    @Override // X.C0IMD
    public final void LIZ(LinkMicBattleItemCard linkMicBattleItemCard) {
        CommonCardInfo commonCardInfo;
        CommonCardInfo commonCardInfo2;
        CommonCardInfo commonCardInfo3;
        LinkMicBattleItemCard linkMicBattleItemCard2 = linkMicBattleItemCard;
        CommonMessageData commonMessageData = linkMicBattleItemCard2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        UseCriticalStrikeCard useCriticalStrikeCard = linkMicBattleItemCard2.useCriticalStrikeCard;
        if (useCriticalStrikeCard != null) {
            CriticalStrikeCardInfo criticalStrikeCardInfo = useCriticalStrikeCard.cardInfo;
            if (criticalStrikeCardInfo != null) {
                _CriticalStrikeCardInfo_ProtoDecoder.LJ(criticalStrikeCardInfo);
            }
            Text text = useCriticalStrikeCard.displayContent;
            if (text != null) {
                _Text_ProtoDecoder.LJ(text);
            }
        }
        UseSmokeCard useSmokeCard = linkMicBattleItemCard2.useSmokeCard;
        if (useSmokeCard != null) {
            SmokeCardInfo smokeCardInfo = useSmokeCard.cardInfo;
            if (smokeCardInfo != null) {
                _SmokeCardInfo_ProtoDecoder.LJ(smokeCardInfo);
            }
            Text text2 = useSmokeCard.displayContent;
            if (text2 != null) {
                _Text_ProtoDecoder.LJ(text2);
            }
        }
        AwardCardNotice awardCardNotice = linkMicBattleItemCard2.awardCardNotice;
        if (awardCardNotice != null) {
            _AwardCardNotice_ProtoDecoder.LJ(awardCardNotice);
        }
        UseExtraTimeCard useExtraTimeCard = linkMicBattleItemCard2.useExtraTimeCard;
        if (useExtraTimeCard != null) {
            ExtraTimeCardInfo extraTimeCardInfo = useExtraTimeCard.cardInfo;
            if (extraTimeCardInfo != null) {
                _ExtraTimeCardInfo_ProtoDecoder.LJ(extraTimeCardInfo);
            }
            Text text3 = useExtraTimeCard.displayContent;
            if (text3 != null) {
                _Text_ProtoDecoder.LJ(text3);
            }
        }
        UseSpecialEffectCard useSpecialEffectCard = linkMicBattleItemCard2.useSpecialEffectCard;
        if (useSpecialEffectCard != null) {
            _UseSpecialEffectCard_ProtoDecoder.LJ(useSpecialEffectCard);
        }
        UsePotionCard usePotionCard = linkMicBattleItemCard2.usePotionCard;
        if (usePotionCard != null) {
            PotionCardInfo potionCardInfo = usePotionCard.cardInfo;
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
            Text text4 = usePotionCard.displayContent;
            if (text4 != null) {
                _Text_ProtoDecoder.LJ(text4);
            }
        }
        UseWaveCard useWaveCard = linkMicBattleItemCard2.useWaveCard;
        if (useWaveCard != null) {
            WaveCardInfo waveCardInfo = useWaveCard.cardInfo;
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
            Text text5 = useWaveCard.displayContent;
            if (text5 != null) {
                _Text_ProtoDecoder.LJ(text5);
            }
        }
        SpecialEffectNotice specialEffectNotice = linkMicBattleItemCard2.specialEffectNotice;
        if (specialEffectNotice != null) {
            _SpecialEffectNotice_ProtoDecoder.LJ(specialEffectNotice);
        }
        UseTop2Card useTop2Card = linkMicBattleItemCard2.useTop2Card;
        if (useTop2Card != null) {
            Top2CardInfo top2CardInfo = useTop2Card.cardInfo;
            if (top2CardInfo != null && (commonCardInfo3 = top2CardInfo.common) != null) {
                _CommonCardInfo_ProtoDecoder.LJ(commonCardInfo3);
            }
            Text text6 = useTop2Card.displayContent;
            if (text6 != null) {
                _Text_ProtoDecoder.LJ(text6);
            }
        }
        UseTop3Card useTop3Card = linkMicBattleItemCard2.useTop3Card;
        if (useTop3Card != null) {
            Top3CardInfo top3CardInfo = useTop3Card.cardInfo;
            if (top3CardInfo != null && (commonCardInfo2 = top3CardInfo.common) != null) {
                _CommonCardInfo_ProtoDecoder.LJ(commonCardInfo2);
            }
            Text text7 = useTop3Card.displayContent;
            if (text7 != null) {
                _Text_ProtoDecoder.LJ(text7);
            }
        }
        UseVaultGloveCard useVaultGloveCard = linkMicBattleItemCard2.useVaultGloveCard;
        if (useVaultGloveCard != null) {
            VaultGloveCardInfo vaultGloveCardInfo = useVaultGloveCard.cardInfo;
            if (vaultGloveCardInfo != null && (commonCardInfo = vaultGloveCardInfo.common) != null) {
                _CommonCardInfo_ProtoDecoder.LJ(commonCardInfo);
            }
            Text text8 = useVaultGloveCard.displayContent;
            if (text8 != null) {
                _Text_ProtoDecoder.LJ(text8);
            }
        }
    }

    @Override // X.C0IMD
    public final LinkMicBattleItemCard LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LinkMicBattleItemCard linkMicBattleItemCard = new LinkMicBattleItemCard();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        linkMicBattleItemCard.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        linkMicBattleItemCard.battleId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        linkMicBattleItemCard.msgType = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        linkMicBattleItemCard.cardObtainGuide = _CardObtainGuide_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        linkMicBattleItemCard.useCriticalStrikeCard = _UseCriticalStrikeCard_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        linkMicBattleItemCard.useSmokeCard = _UseSmokeCard_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        linkMicBattleItemCard.awardCardNotice = _AwardCardNotice_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        linkMicBattleItemCard.useExtraTimeCard = _UseExtraTimeCard_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        linkMicBattleItemCard.useSpecialEffectCard = _UseSpecialEffectCard_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        linkMicBattleItemCard.usePotionCard = _UsePotionCard_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        linkMicBattleItemCard.useWaveCard = _UseWaveCard_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        linkMicBattleItemCard.specialEffectNotice = _SpecialEffectNotice_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        linkMicBattleItemCard.useTop2Card = _UseTop2Card_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 14:
                        linkMicBattleItemCard.useTop3Card = _UseTop3Card_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 15:
                        linkMicBattleItemCard.useVaultGloveCard = _UseVaultGloveCard_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 16:
                        linkMicBattleItemCard.awardReason = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkMicBattleItemCard;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkMicBattleItemCard linkMicBattleItemCard, List list) {
    }
}
