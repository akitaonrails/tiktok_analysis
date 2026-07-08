package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.LiveJourneyTaskRecordInfo;

/* JADX INFO: loaded from: classes29.dex */
public final class AnchorLiveJourneyTaskQuickPassCardDetailResp {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("total_quick_pass_card_num")
        public long totalQuickPassCardNum;

        @C09CT("task_list")
        public List<LiveJourneyTaskRecordInfo> taskList = new ArrayList();

        @C09CT("icon")
        public String icon = "";
    }
}
