package webcast.data;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes.dex */
public final class SubInteractionStat {

    @C09CT("latest_live_end_ts")
    public long latestLiveEndTs;

    @C09CT("latest_live_sub_view_cnt")
    public long latestLiveSubViewCnt;

    @C09CT("most_active_comment_cnt")
    public long mostActiveCommentCnt;

    @C09CT("most_active_subscriber")
    public User mostActiveSubscriber;

    @C09CT("total_comment_cnt")
    public long totalCommentCnt;
}
