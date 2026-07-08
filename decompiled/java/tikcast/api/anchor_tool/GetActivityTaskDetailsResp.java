package tikcast.api.anchor_tool;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class GetActivityTaskDetailsResp {

    @C09CT("data")
    public GetActivityTaskDetailsData data;

    public static final class GetActivityTaskDetailsData {

        @C09CT("cur_week")
        public int curWeek;

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("task_details")
        public List<TaskDetail> taskDetails = new ArrayList();
    }
}
