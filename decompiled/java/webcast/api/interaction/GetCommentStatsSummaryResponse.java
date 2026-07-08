package webcast.api.interaction;

import X.C09CT;
import com.bytedance.android.livesdk.model.AICommentSummaryContent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class GetCommentStatsSummaryResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("ai_summary")
        public AICommentSummaryContent aiSummary;

        @C09CT("anchor_id")
        public long anchorId;

        @C09CT("summary_list")
        public List<CommentStatsSummary> summaryList = new ArrayList();
    }
}
