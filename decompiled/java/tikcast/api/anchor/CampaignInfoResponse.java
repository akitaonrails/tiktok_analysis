package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class CampaignInfoResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("campaigns")
        public List<CampaignInfo> campaigns = new ArrayList();

        @C09CT("total_page")
        public int totalPage;
    }
}
