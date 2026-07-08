package tikcast.api.boost;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class QueryCardsResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("faq_config")
        public FaqConfig faqConfig;

        @C09CT("cards")
        public List<Card> cards = new ArrayList();

        @C09CT("tiers")
        public List<BoostTier> tiers = new ArrayList();

        @C09CT("flags")
        public List<GoalTierFlag> flags = new ArrayList();
    }
}
