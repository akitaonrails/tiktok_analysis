package webcast.data;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AcademyCourseTheme {

    @C09CT("claimed_reward_time")
    public long claimedRewardTime;

    @C09CT("completed_time")
    public long completedTime;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("reward")
    public AcademyTaskReward reward;

    @C09CT("series_id")
    public long seriesId;

    @C09CT("show_video_survey")
    public boolean showVideoSurvey;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("video_survey")
    public AnchorSurveyQuestion videoSurvey;

    @C09CT("name")
    public String name = "";

    @C09CT("cover")
    public String cover = "";

    @C09CT("description")
    public String description = "";

    @C09CT("tasks")
    public List<AcademyCourseTask> tasks = new ArrayList();
}
