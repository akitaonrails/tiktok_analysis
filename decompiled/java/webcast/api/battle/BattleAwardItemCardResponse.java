package webcast.api.battle;

import X.C09CT;
import com.bytedance.android.livesdkapi.depend.model.live.match.CriticalStrikeCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.ExtraTimeCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.SmokeCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.SpecialEffectCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.Top2CardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.Top3CardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.VaultGloveCardInfo;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class BattleAwardItemCardResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class BattleAwardedItemCard {

        @C09CT("card_type")
        public int cardType;

        @C09CT("critical_strike_card")
        public CriticalStrikeCardInfo criticalStrikeCard;

        @C09CT("extra_time_card")
        public ExtraTimeCardInfo extraTimeCard;

        @C09CT("smoke_card")
        public SmokeCardInfo smokeCard;

        @C09CT("special_effect_card")
        public SpecialEffectCardInfo specialEffectCard;

        @C09CT("top2_card")
        public Top2CardInfo top2Card;

        @C09CT("top3_card")
        public Top3CardInfo top3Card;

        @C09CT("vault_gloves_card")
        public VaultGloveCardInfo vaultGlovesCard;
    }

    public static final class ResponseData {

        @C09CT("card_type")
        public int cardType;

        @C09CT("cards")
        public List<BattleAwardedItemCard> cards;

        @C09CT("critical_strike_card")
        public CriticalStrikeCardInfo criticalStrikeCard;

        @C09CT("extra_time_card")
        public ExtraTimeCardInfo extraTimeCard;

        @C09CT("smoke_card")
        public SmokeCardInfo smokeCard;

        @C09CT("special_effect_card")
        public SpecialEffectCardInfo specialEffectCard;
    }
}
