package webcast.api.game;

import X.C09CT;
import com.bytedance.android.live.base.model.user.BadgeStruct;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorRank {

    @C09CT("badge")
    public BadgeStruct badge;

    @C09CT("can_sub_status")
    public int canSubStatus;

    @C09CT("can_subscribe")
    public boolean canSubscribe;

    @C09CT("claimed_reward_num")
    public long claimedRewardNum;

    @C09CT("is_in_grace_period")
    public boolean isInGracePeriod;

    @C09CT("is_online")
    public boolean isOnline;

    @C09CT("new_audience_num")
    public int newAudienceNum;

    @C09CT("rank")
    public int rank;

    @C09CT("anchor_user_id")
    public String anchorUserId = "";

    @C09CT("anchor_name")
    public String anchorName = "";

    @C09CT("anchor_avatar")
    public String anchorAvatar = "";

    @C09CT("room_id")
    public String roomId = "";

    @C09CT("anchor_sec_uid")
    public String anchorSecUid = "";
}
