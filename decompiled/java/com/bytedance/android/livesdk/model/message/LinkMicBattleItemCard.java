package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class LinkMicBattleItemCard extends AbstractC1136060ffY {
    public CharSequence LL;

    @C09CT("award_card_notice")
    public AwardCardNotice awardCardNotice;

    @C09CT("award_reason")
    public int awardReason;

    @C09CT("battle_id")
    public long battleId;

    @C09CT("card_obtain_guide")
    public CardObtainGuide cardObtainGuide;

    @C09CT("msg_type")
    public int msgType;

    @C09CT("special_effect_notice")
    public SpecialEffectNotice specialEffectNotice;

    @C09CT("use_critical_strike_card")
    public UseCriticalStrikeCard useCriticalStrikeCard;

    @C09CT("use_extra_time_card")
    public UseExtraTimeCard useExtraTimeCard;

    @C09CT("use_potion_card")
    public UsePotionCard usePotionCard;

    @C09CT("use_smoke_card")
    public UseSmokeCard useSmokeCard;

    @C09CT("use_special_effect_card")
    public UseSpecialEffectCard useSpecialEffectCard;

    @C09CT("use_top2_card")
    public UseTop2Card useTop2Card;

    @C09CT("use_top3_card")
    public UseTop3Card useTop3Card;

    @C09CT("use_vault_glove_card")
    public UseVaultGloveCard useVaultGloveCard;

    @C09CT("use_wave_card")
    public UseWaveCard useWaveCard;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return this.msgType > 1;
    }

    public LinkMicBattleItemCard() {
        this.type = C001A.LINK_MIC_BATTLE_ITEM_CARD;
    }
}
