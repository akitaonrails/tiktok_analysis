package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.LiveJourneyLevelInfo;

/* JADX INFO: loaded from: classes13.dex */
public final class AnchorLiveJourneyReceiveRewardResp {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("success_level_list")
        public List<Long> successLevelList = new ArrayList();

        @C09CT("success_level_info_list")
        public List<LiveJourneyLevelInfo> successLevelInfoList = new ArrayList();

        @C09CT("stockout_level_list")
        public List<Long> stockoutLevelList = new ArrayList();
    }
}
