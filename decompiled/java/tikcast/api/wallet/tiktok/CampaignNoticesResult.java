package tikcast.api.wallet.tiktok;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class CampaignNoticesResult {

    @C09CT("data")
    public CampaignNoticesData data;

    public static final class CampaignNoticesData {

        @C09CT("continue_polling")
        public boolean continuePolling;

        @C09CT("is_in_campaign")
        public boolean isInCampaign;

        @C09CT("notices")
        public List<CampaignNotice> notices = new ArrayList();

        @C09CT("refresh_interval")
        public long refreshInterval;
    }
}
