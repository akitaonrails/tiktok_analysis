package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.UpsellIndustry;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class UpsellIndustryListResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("select_industry_info")
        public SelectedIndustryInfo selectIndustryInfo;

        @C09CT("industry_list")
        public List<UpsellIndustry> industryList = new ArrayList();

        @C09CT("industry_l2_list")
        public List<UpsellIndustry> industryL2List = new ArrayList();

        public static final class SelectedIndustryInfo {

            @C09CT("can_reselect")
            public boolean canReselect;

            @C09CT("latest_update_date")
            public long latestUpdateDate;

            @C09CT("selected_industry_id")
            public long selectedIndustryId;
        }
    }
}
