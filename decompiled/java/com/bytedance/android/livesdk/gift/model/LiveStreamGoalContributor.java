package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.goal.model.SubGoalContribution;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LiveStreamGoalContributor {

    @C09CT("avatar")
    public ImageModel avatar;

    @C09CT("display_id")
    public String displayId;

    @C09CT("enigma_info")
    public User.EnigmaInfo enigmaInfo;

    @C09CT("follow_by_owner")
    public boolean followByOwner;

    @C09CT("in_room")
    public boolean inRoom;

    @C09CT("is_fist_contribute")
    public boolean isFistContribute;

    @C09CT("is_friend")
    public boolean isFriend;

    @C09CT("score")
    public long score;

    @C09CT("user_id")
    public long userId;

    @C09CT("user_id_str")
    public String userIdStr = "";

    @C09CT("sub_goal_contributions")
    public List<SubGoalContribution> subGoalContributions = new ArrayList();
}
