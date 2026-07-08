package webcast.data;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MGHostGrowthActivity {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("target_user_tag_enum")
    public int targetUserTagEnum;

    @C09CT("user_tips")
    public MGHostGrowthTips userTips;

    @C09CT("tasks")
    public List<MGHostGrowthTask> tasks = new ArrayList();

    @C09CT("rewards")
    public List<MGHostGrowthActivityReward> rewards = new ArrayList();

    @C09CT("guide_links")
    public List<MGHostGrowthActivityGuideLink> guideLinks = new ArrayList();

    @C09CT("all_user_tips")
    public List<MGHostGrowthTips> allUserTips = new ArrayList();
}
