package tikcast.api.anchor;

import X.C09CT;
import com.bytedance.android.livesdk.replay.proto.PostedVideo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorReplayVideoPostsData {

    @C09CT("all_time_post_cnt")
    public long allTimePostCnt;

    @C09CT("last_30_days_post_by_others")
    public long last30DaysPostByOthers;

    @C09CT("last_30_days_post_by_self")
    public long last30DaysPostBySelf;

    @C09CT("last_30_days_post_cnt")
    public long last30DaysPostCnt;

    @C09CT("live_watch_cnt_from_video_7d")
    public long liveWatchCntFromVideo7d;

    @C09CT("video_post_all_time_by_others")
    public long videoPostAllTimeByOthers;

    @C09CT("video_post_all_time_by_self")
    public long videoPostAllTimeBySelf;

    @C09CT("your_posts")
    public List<PostedVideo> yourPosts = new ArrayList();

    @C09CT("posted_by_others")
    public List<PostedVideo> postedByOthers = new ArrayList();
}
