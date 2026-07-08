package tikcast.api.eco;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class GetViolationListResponse {

    @C09CT("data")
    public ResponseData data;

    @C09CT("extra")
    public ResponseExtra extra;

    public static final class ResponseData {

        @C09CT("active_count")
        public int activeCount;

        @C09CT("feedback")
        public ViolationFeedback feedback;

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("history_count")
        public int historyCount;

        @C09CT("is_eea")
        public boolean isEea;

        @C09CT("records")
        public List<ViolationRecord> records = new ArrayList();

        @C09CT("next_last_id")
        public String nextLastId = "";

        @C09CT("guide_detail_list")
        public List<GuideDetail> guideDetailList = new ArrayList();
    }

    public static final class ResponseExtra {

        @C09CT("now")
        public long now;
    }
}
