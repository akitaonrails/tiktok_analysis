package tikcast.api.fans;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.List;
import webcast.data.PopularityRankCard;
import webcast.data.UserPopularityTask;

/* JADX INFO: loaded from: classes29.dex */
public final class UserPopularityInfo {

    @C09CT("boost_expire_time")
    public long boostExpireTime;

    @C09CT("boost_factor")
    public double boostFactor;

    @C09CT("closest_privilege_gift_id")
    public long closestPrivilegeGiftId;

    @C09CT("contributors_num")
    public long contributorsNum;

    @C09CT("is_gift_task_boost")
    public boolean isGiftTaskBoost;

    @C09CT("rank_card")
    public PopularityRankCard rankCard;

    @C09CT("self_contribute_points")
    public long selfContributePoints;

    @C09CT("top_contributors_avatars")
    public List<ImageModel> topContributorsAvatars = new ArrayList();

    @C09CT("user_task")
    public UserPopularityTask userTask;

    @C09CT("yesterday_rank_if_boost")
    public long yesterdayRankIfBoost;
}
