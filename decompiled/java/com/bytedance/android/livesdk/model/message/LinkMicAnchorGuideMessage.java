package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LinkMicAnchorGuideMessage extends AbstractC1136060ffY {

    @C09CT("available_friend_number")
    public int availableFriendNumber;

    @C09CT("button_content")
    public String buttonContent;

    @C09CT("button_show_type")
    public int buttonShowType;

    @C09CT("cohost_follow_message")
    public CohostFollowMessage cohostFollowMessage;

    @C09CT("connect_type")
    public int connectType;

    @C09CT("group_channel_id")
    public long groupChannelId;

    @C09CT("guide_content")
    public String guideContent;

    @C09CT("guide_type")
    public int guideType;

    @C09CT("is_followed_by_rival")
    public boolean isFollowRival;

    @C09CT("log_id")
    public String logId;

    @C09CT("opt_pair_info")
    public OptPairInfo optPairInfo;

    @C09CT("reserve_info")
    public ReserveInfo reserveInfo;

    @C09CT("user")
    public User user;

    @C09CT("user_model_prediction_data")
    public List<UserModelPredictionData> userModelPredictionData;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return true;
    }

    public LinkMicAnchorGuideMessage() {
        this.type = C001A.LINK_CO_HOST_GUIDE;
    }
}
