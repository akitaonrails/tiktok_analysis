package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class GetCampaignListResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("has_more")
        public long hasMore;

        @C09CT("offset")
        public long offset;

        @C09CT("total_count")
        public long totalCount;

        @C09CT("campaign_map")
        public Map<Long, CampaignInfos> campaignMap = new LinkedHashMap();

        @C09CT("registration_activity_list")
        public List<RegistrationActivity> registrationActivityList = new ArrayList();

        @C09CT("extra")
        public String extra = "";
    }
}
