package tikcast.api.anchor_data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import tikcast.api.boost.BoostTier;
import tikcast.api.boost.Card;
import tikcast.api.boost.FaqConfig;
import tikcast.api.boost.GoalTierFlag;

/* JADX INFO: loaded from: classes29.dex */
public final class FlareCard {

    @C09CT("boost_user_count")
    public long boostUserCount;

    @C09CT("boosted")
    public boolean boosted;

    @C09CT("faq_config")
    public FaqConfig faqConfig;

    @C09CT("cards")
    public List<Card> cards = new ArrayList();

    @C09CT("tiers")
    public List<BoostTier> tiers = new ArrayList();

    @C09CT("flags")
    public List<GoalTierFlag> flags = new ArrayList();
}
