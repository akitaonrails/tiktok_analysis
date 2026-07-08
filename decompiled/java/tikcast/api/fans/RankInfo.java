package tikcast.api.fans;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import tikcast.api.creator_succ.CRMUserDisplayItem;

/* JADX INFO: loaded from: classes29.dex */
public final class RankInfo {

    @C09CT("crm_user_display_item")
    public CRMUserDisplayItem crmUserDisplayItem;

    @C09CT("fans_level")
    public long fansLevel;

    @C09CT("index")
    public int index;

    @C09CT("join_time_seconds")
    public long joinTimeSeconds;

    @C09CT("score")
    public int score;

    @C09CT("score_delta")
    public int scoreDelta;

    @C09CT("user")
    public User user;
}
