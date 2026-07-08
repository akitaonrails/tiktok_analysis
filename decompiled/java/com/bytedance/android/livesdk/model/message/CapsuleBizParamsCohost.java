package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeSection;

/* JADX INFO: loaded from: classes.dex */
public final class CapsuleBizParamsCohost {

    @C09CT("anchor_class_label")
    public GiftGalleryBadgeSection anchorClassLabel;

    @C09CT("available_friend_number")
    public long availableFriendNumber;

    @C09CT("invitee_inner_channel_id")
    public long inviteeInnerChannelId;

    @C09CT("invitee_model_prediction_data")
    public UserModelPredictionData inviteeModelPredictionData;

    @C09CT("invitee_room_id")
    public long inviteeRoomId;

    @C09CT("invitee_user_info")
    public User inviteeUserInfo;

    @C09CT("is_followed_by_rival")
    public boolean isFollowedByRival;

    @C09CT("is_friend")
    public boolean isFriend;

    @C09CT("rival_class_label")
    public GiftGalleryBadgeSection rivalClassLabel;

    @C09CT("rival_user")
    public User rivalUser;

    @C09CT("rival_vote_count")
    public String rivalVoteCount = "";

    @C09CT("sub_type")
    public String subType = "";

    @C09CT("type")
    public String type = "";
}
