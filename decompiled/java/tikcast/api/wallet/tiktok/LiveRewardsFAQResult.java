package tikcast.api.wallet.tiktok;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class LiveRewardsFAQResult {

    @C09CT("data")
    public LiveRewardsFAQData data;

    public static final class LiveRewardsFAQData {

        @C09CT("faq_items")
        public List<FAQItem> faqItems = new ArrayList();

        @C09CT("update_timestamp")
        public long updateTimestamp;
    }
}
