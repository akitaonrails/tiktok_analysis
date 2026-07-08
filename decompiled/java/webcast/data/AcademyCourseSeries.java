package webcast.data;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AcademyCourseSeries {

    @C09CT("coureses_count")
    public int couresesCount;

    @C09CT("has_reward")
    public boolean hasReward;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("name")
    public String name = "";

    @C09CT("themes")
    public List<AcademyCourseTheme> themes = new ArrayList();

    @C09CT("stage_key")
    public String stageKey = "";
}
